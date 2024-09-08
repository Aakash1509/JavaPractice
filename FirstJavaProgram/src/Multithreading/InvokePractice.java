package Multithreading;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


//The invokeAny method in the ExecutorService returns the result of the first successfully completed Callable from the provided collection of tasks.

public class InvokePractice {
    public static void main(String[] args) {
        // Create an executor service with a single thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Use a List to store Callable tasks
        List<Callable<String>> callables = new ArrayList<>();

        // Add tasks to the list
        callables.add(() -> "Task 2");
        callables.add(() -> "Task 1");
        callables.add(() -> "Task 3");

        try {
            // Invoke any one of the Callable tasks
            String result = executorService.invokeAny(callables);
            System.out.println("result = " + result);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor service
            executorService.shutdown();
        }
    }
}
