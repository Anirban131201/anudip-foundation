// Custom thread class extending the Thread class
class myThread2 extends Thread {
    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        try {
            // Loop to print numbers from 1 to 10 with a delay
            for (int i = 1; i <= 10; i++) {
                // Print the current number followed by a newline
                System.out.println(i);
                // Pause the thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Handle the InterruptedException if the thread is interrupted
            e.printStackTrace();
        }
    }
}

public class ThreadExample3 {
    public static void main(String[] args) {
        // Create an instance of the custom thread class
        myThread2 t1 = new myThread2();
        // Start the thread, which will execute the run() method
        t1.start();
    }
}
