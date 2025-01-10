// Class A with synchronized methods
class A {
    // Synchronized method that attempts to call a method in class B
    synchronized void method(B b) {
        System.out.println("ThreadA: holding lock on A");
        try {
            Thread.sleep(100); // Simulate some processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ThreadA waiting for lock on B");
        // Calls the last() method of class B, requiring a lock on B
        b.last();
    }

    // Another synchronized method in class A
    synchronized void last() {
        System.out.println("Inside A's last() method");
    }
}

// Class B with synchronized methods
class B {
    // Synchronized method that attempts to call a method in class A
    synchronized void method(A a) {
        System.out.println("ThreadB: holding lock on B");
        try {
            Thread.sleep(100); // Simulate some processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ThreadB waiting for lock on A");
        // Calls the last() method of class A, requiring a lock on A
        a.last();
    }

    // Another synchronized method in class B
    synchronized void last() {
        System.out.println("Inside B's last() method");
    }
}

// Main class to demonstrate potential deadlock
public class DeadlockExample {
    public static void main(String[] args) {
        A a = new A(); // Create an instance of class A
        B b = new B(); // Create an instance of class B

        // Start ThreadA to call method() on A with an instance of B
        new Thread(() -> a.method(b)).start();

        // Start ThreadB to call method() on B with an instance of A
        new Thread(() -> b.method(a)).start();
    }
}
