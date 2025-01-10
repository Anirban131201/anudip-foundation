// Custom thread class extending the Thread class
class myThread3 extends Thread {
    private String name; // Name of the thread
    private int sleepDuration; // Sleep duration for the thread

    // Constructor to initialize the thread's name and sleep duration
    public myThread3(String name, int sleepDuration) {
        this.name = name;
        this.sleepDuration = sleepDuration;
    }

    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        // Loop to simulate thread activity
        for (int i = 0; i < 5; i++) {
            try {
                // Print a message indicating the thread is running
                System.out.println("Thread '" + name + "' is running");
                // Pause the thread for the specified duration
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
                // Handle any interruptions during sleep
                e.printStackTrace();
            }
        }
    }
}

// Main class to demonstrate thread priorities
public class PriorityThreads {
    public static void main(String[] args) {
        // Create threads with different names and sleep durations
        myThread3 lowPriorityThread = new myThread3("Low Priority", 1000);
        myThread3 mediumPriorityThread = new myThread3("Medium Priority", 500);
        myThread3 highPriorityThread = new myThread3("High Priority", 250);

        // Start the threads
        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();
    }
}
