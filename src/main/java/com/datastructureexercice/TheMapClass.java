package com.datastructureexercice;

import java.util.HashMap;
import java.util.Map;

public class TheMapClass {

    public static void main(String[] args) {
        Map<Integer, ThePersonClass> map =  new HashMap<>();
        map.put(1,new ThePersonClass("alex", 21));
        map.put(2,new ThePersonClass("hakim", 22));
        map.put(3,new ThePersonClass("salam", 222));
        // displaying a map
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        // displaying methodes for hashmap using loops

        map.entrySet().forEach(x->System.out.println(x.getKey() + "-->" + x.getValue()));
        map.forEach( ());
    }
}
