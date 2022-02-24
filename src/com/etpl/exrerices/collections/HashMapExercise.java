package com.etpl.exrerices.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMapExercise hme=new HashMapExercise();

        Map<String,String> map=hme.getSampleMapData();

        hme.printMyMap(map);

    }

    private void printMyMap(Map<String, String> map) {
        System.out.println(".Map SIze ."+map.size());

        System.out.println("Check if map contains key..> "+map.containsKey("abc"));
        System.out.println("value check"+map.containsValue("abc"));

        for(String key: map.keySet()){
            System.out.println("Value in Key ["+key+"] is = {"+map.get(key)+"}");
        }
    }

    private Map<String, String> getSampleMapData() {
        Map<String,String> map= new HashMap<String, String>();
        map.put("abc","l;fkj Al;DKJGHUI");
        map.put("def","fhsdkhf");
        map.put("xyz","mand");

        return map;
    }
}
