package OOPConcepts.Collections.LinkedHashMapExample9;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class App {
    public static void main(String args[]){

    LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();


        hm.put(101, "Vivek Singh");
        hm.put(102, "GsLab Baner");
        hm.put(103, "Manasarovar Jaipur");
        hm.put(104, "Malviya Nagar");
        hm.put(105, "Shastri Nagar");
        hm.put(106, null);
        hm.put(107, null);
        hm.put(null, "Again ");

        System.out.println(hm.get(103));


        for (Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey()+ " "+ e.getValue());
        }

        System.out.println("*******************************");

        for(int i = 101; i< hm.size()+100; i++ ){
            System.out.println(hm.get(i));
        }
    }
}
