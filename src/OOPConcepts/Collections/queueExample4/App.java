package OOPConcepts.Collections.queueExample4;

import java.util.PriorityQueue;

public class App {
    public static void main(String args[]){
        
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        que.add(201);
        que.add(202);
        que.add(203);
        que.add(204);
        que.add(205);

        System.out.println(que);

        System.out.println(que.peek());

        que.poll();

        System.out.println(que);

        System.out.println(que.peek());


    }
}
