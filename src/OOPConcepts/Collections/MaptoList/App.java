package OOPConcepts.Collections.MaptoList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class App {
    public static void main(String args[]){
        ConcurrentHashMap<Integer, String > map1 = new ConcurrentHashMap<>();
        map1.put(201, "One");
        map1.put(202, "Two");
        map1.put(203, "Three");
        map1.put(204, "Four");
        map1.put(205, "Five");


        ArrayList<Integer> listofKeys = new ArrayList<>();
        Set<Integer> keys = map1.keySet();
        listofKeys.addAll(keys);


        Collection<String> values = map1.values();
        ArrayList<String> listofValues = new ArrayList<>(values);
        
        for(int i = 0; i< listofKeys.size();i++){
            System.out.println(listofKeys.get(i)+" : "+ listofValues.get(i));
        }
        
    }
}
