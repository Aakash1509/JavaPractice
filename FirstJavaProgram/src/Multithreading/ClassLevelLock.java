package Multithreading;

class ClassLevelLockExample {
    public static synchronized void display() {
        System.out.println("Class-level lock acquired by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Class-level lock released by " + Thread.currentThread().getName());
    }
}

public class ClassLevelLock {
    public static void main(String[] args) {
        ClassLevelLockExample obj1 = new ClassLevelLockExample();
        ClassLevelLockExample obj2 = new ClassLevelLockExample();

        // Both threads are working on the same class-level lock, since the method is static
        Thread t1 = new Thread(() -> ClassLevelLockExample.display(), "Thread 1");
        Thread t2 = new Thread(() -> ClassLevelLockExample.display(), "Thread 2");

        t1.start();
        t2.start();
    }
}

