// Define a custom class that implements the Runnable interface
class myRunnable implements Runnable {
    // Override the run() method to define the behavior of the thread
    @Override
    public void run() {
        // Print a message to the console when the thread runs
        System.out.print("Hello, my name is Anirban");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        // Create an instance of the myRunnable class
        myRunnable r1 = new myRunnable();

        // Create a new Thread object, passing the runnable instance as an argument
        Thread t1 = new Thread(r1);

        // Start the thread's execution
        // This calls the run() method in the myRunnable class
        t1.start();
    }
}
