// Custom thread class extending the Thread class
class myThread1 extends Thread {
    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        try {
            // Loop to print numbers from 0 to 5 with a delay
            for (int i = 0; i <= 5; i++) {
                // Print the current number followed by a tab
                System.out.print(i + "\t");
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // Handle the InterruptedException if the thread is interrupted
            e.printStackTrace();
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        // Create multiple thread instances
        myThread1 t1 = new myThread1();
        myThread1 t2 = new myThread1();
        myThread1 t3 = new myThread1();

        // Start the threads, which will execute their run() methods concurrently
        t1.start();
        t2.start();
        t3.start();
    }
}
