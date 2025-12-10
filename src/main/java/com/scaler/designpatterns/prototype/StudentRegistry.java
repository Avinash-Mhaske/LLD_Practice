package com.scaler.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

//1.3. Step 3: create a registry  class.
public class StudentRegistry {
    private Map<String, Student> map=new HashMap<>();

    void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        return map.get(key);
    }
}
