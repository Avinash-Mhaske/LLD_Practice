package com.scaler.multiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> listToSort;
//    private ExecutorService executorService; //uncomment this line after adding the constructor injection

    public MergeSorter(List<Integer> listToSort
//            , ExecutorService executorService
    ){
        this.listToSort=listToSort;
//        this.executorService=executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // the return type of this call method is the same as
        // that we pass to the callable interface while implementing.
//  Steps
//  Merge sort logic should be implemented here
        int n=listToSort.size();

        if(n<=1){
            return listToSort;
        }
//  divide the list into 2 halfs.
//        List<Integer> firstHalf=listToSort.subList(0, n/2);
//        List<Integer> secondHalf=listToSort.subList(n/2, listToSort.size());
// Note :Above 2 lines also divide the list into 2 half's using sublist JFYI. We can use above or below one's
        List<Integer> firstHalf=new ArrayList<>();
        List<Integer> secondHalf=new ArrayList<>();

        for (int i=0;i<n/2;i++){
            firstHalf.add(listToSort.get(i));
        }
        for (int i=n/2;i<n;i++){
            secondHalf.add(listToSort.get(i));
        }
//  sort 1st half and 2nd half recursively on separate thread.
//  create 2 tasks to sort the first half and second half of the list
        MergeSorter leftMergeSorter = new MergeSorter(firstHalf
//                , executorService
        );//executor service added after constructor injection.
        MergeSorter rightMergeSorter = new MergeSorter(secondHalf
//                , executorService
        );//executor service added after constructor injection.

//  Create an executor service.
//        Here we are not sure of how many threads we need to create hence instead of using
//            Executors.newFixedThreadPool(10); we will use Executors.newCachedThreadPool();
        ExecutorService executorService= Executors.newCachedThreadPool();
// note: Executing with above executor service line first see the pools created. we can see 8 pools are created which is not good idea
//        Line 58 - creates a new ExecutorService object every time, we can use the one we have passed inside the constructor.(constructor injection).
//        comment line 58 and uncomment line number 13, 16, 19, 49, 52 here and line 20 in main class and now execute and see the pool size. >> o/p only 1 pool created.
        Future<List<Integer>> futureLeftSortedList = executorService.submit(leftMergeSorter);//nonblocking call for now
        Future<List<Integer>> futureRightSortedList=executorService.submit(rightMergeSorter);//nonblocking call for now

//  Up to here we have the left sorted and right sorted list
//  now we need to merge this two
        List<Integer> leftSortedList = futureLeftSortedList.get();//this is a blocking call now
        List<Integer> rightSortedList=futureRightSortedList.get();//this is a blocking call now

//  Merge-logic 2 pointer approach
        int i=0,j=0;
        List<Integer> finalSortedList=new ArrayList<>();

        while(i<leftSortedList.size() && j< rightSortedList.size()){
            if (leftSortedList.get(i) < rightSortedList.get(j)){
                finalSortedList.add(leftSortedList.get(i));
                i++;
            }
            else {
                finalSortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while(i<leftSortedList.size()){
            finalSortedList.add(leftSortedList.get(i));
            i++;
        }
        while(j<rightSortedList.size()){
            finalSortedList.add(rightSortedList.get(j));
            j++;
        }
        return finalSortedList;
    }
}
