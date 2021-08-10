package OOPConcepts.multithreading.example6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String args[]){
        Task task = new Task("GeeksForGeeks");


        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> result = executorService.submit(task);

        try{
            System.out.println(result.get());
            
        }catch(InterruptedException | ExecutionException e){

            System.out.println("Error occurred");
            e.getStackTrace();
        }

        executorService.shutdown();
    }
    
}
