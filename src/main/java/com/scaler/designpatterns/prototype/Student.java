package com.scaler.designpatterns.prototype;

//1.1 Step 1 :identify the class that we need an object of (prototype)..... here Student class
public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double psp;
    private String batch;
    private double avgBatchPsp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public Student(Student student){ // copy constructor to create a copy of object.
        this.name=student.name;
        this.age=student.age;
        this.psp=student.psp;
        this.batch=student.batch;
        this.avgBatchPsp=student.avgBatchPsp;
    }
    public Student(){//default constructor.. created for any use in future.(if needed)

    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
