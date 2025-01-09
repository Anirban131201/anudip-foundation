// Define a custom thread class by extending the Thread class
class myThread extends Thread {
    // Override the run() method to define the behavior of the thread
    @Override
    public void run() {
        try {
            // Print "Hello" to the console
            System.out.print("Hello");

            // Pause the thread execution for 500 milliseconds
            Thread.sleep(500);

            // Print " world" to the console after the delay
            System.out.print(" world");
        } catch (InterruptedException e) {
            // Handle InterruptedException if the thread is interrupted during sleep
            e.printStackTrace();
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create a new thread by instantiating the custom myThread class
        myThread t1 = new myThread();

        // Start the thread's execution
        // This invokes the run() method in the myThread class
        t1.start();
    }
}
