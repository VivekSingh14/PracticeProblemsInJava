package OOPConcepts.Collections.hashMapExample8;

import java.util.HashMap;
import java.util.Map.Entry;

public class App {
    public static void main(String args[]){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();


        hm.put(101, "Vivek Singh");
        hm.put(102, "GsLab Baner");
        hm.put(103, "Agra Road Jaipur");
        hm.put(104, "Malviya Nagar");
        hm.put(105, "Shastri Nagar");

        System.out.println(hm.get(103));


        for (Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey()+ " "+ e.getValue());
        }
    }
}
