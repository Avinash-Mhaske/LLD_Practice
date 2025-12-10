package com.scaler.designpatterns.prototype;

//1.4 step 4: client class to call the prototype copy
public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student march24LLDEvePrototype= new Student();
        march24LLDEvePrototype.setBatch("March24Evening");
        march24LLDEvePrototype.setAvgBatchPsp(80.0);
        studentRegistry.register("March24Eve", march24LLDEvePrototype);

        Student feb24EvePrototype=new Student();
        feb24EvePrototype.setBatch("Feb24Evening");
        feb24EvePrototype.setAvgBatchPsp(74.0);
        studentRegistry.register("feb24Eve", feb24EvePrototype);


        IntelligentStudent feb24EveIsPrototype=new IntelligentStudent();
        feb24EveIsPrototype.setBatch("feb24EveIS");
        feb24EveIsPrototype.setAvgBatchPsp(74.0);
        feb24EveIsPrototype.iq=100;
        studentRegistry.register("feb24EveIntgntStnt", feb24EveIsPrototype);
    }

    public static void main(String[] args) {


        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry((studentRegistry));

        Student shiv = studentRegistry.get("March24Eve").clone();
        shiv.setName("ShivPrasad");
        shiv.setAge(34);
        shiv.setPsp(98.9);

        Student intelligentStudent=studentRegistry.get("feb24EveIntgntStnt").clone();

        System.out.println("DEBUG");//debug here to see if object is created or not.

    }
}
