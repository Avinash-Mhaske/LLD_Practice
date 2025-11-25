package com.scaler.multiThreadedMergeSort;

import com.scaler.executorService.NumberPrinter;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args)  throws ExecutionException, InterruptedException {

        List<Integer> listToSort= Arrays.asList(4, 1, 7, 2, 3, 6, 8, 5, 4);

    ExecutorService executorService=Executors.newCachedThreadPool();
    MergeSorter mergeSorter=new MergeSorter(listToSort, executorService);//executor service added after constructor injection.
    Future<List<Integer>> futureSortedList=executorService.submit(mergeSorter);

        System.out.println(futureSortedList.get());
 }
}
