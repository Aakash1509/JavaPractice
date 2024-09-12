package Multithreading;

class ObjectLevelLockExample {
    public synchronized void display() {
        System.out.println("Object-level lock acquired by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Object-level lock released by " + Thread.currentThread().getName());
    }
}

public class ObjectLevelLock {
    public static void main(String[] args) {
        ObjectLevelLockExample obj1 = new ObjectLevelLockExample();

        ObjectLevelLockExample obj2 = new ObjectLevelLockExample();

        // Thread t1 will lock obj1, and t2 will lock obj2
        Thread t1 = new Thread(() -> obj1.display(), "Thread 1");
        Thread t2 = new Thread(() -> obj2.display(), "Thread 2");

        t1.start();
        t2.start();
    }
}

