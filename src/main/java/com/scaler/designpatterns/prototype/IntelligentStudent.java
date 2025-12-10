package com.scaler.designpatterns.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq= student.iq;
    }

    public IntelligentStudent(){

    }



    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
