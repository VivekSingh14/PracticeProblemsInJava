package Overriding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TestingPurposeOnly {
    public static void main(String args[]){
        /*ArrayList<Integer> list1 = new ArrayList<>();*/
        Queue<Integer> que1 = new LinkedList<>();

    
        que1.add(10);
        que1.add(20);
        que1.add(30);

        //list1.add(1);
        //list1.add(2);
        //list1.add(3);

        //System.out.println(list1.size());

        //System.out.println("Iterating queue");
        while(que1){
        System.out.println();
        }
        //System.out.println("after removing elements size of list");
        //list1.size();
    }
}
