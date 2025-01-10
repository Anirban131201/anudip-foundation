// Thread to calculate the average of the first 10 numbers
class AverageThread extends Thread {
    private final Object lock; // Shared lock object for thread synchronization

    // Constructor to initialize the lock object
    public AverageThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) { // Synchronize on the shared lock object
            int sum = 0;
            // Calculate the sum of the first 10 numbers
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            // Calculate and print the average
            double average = sum / 10.0;
            System.out.println("Average of first 10 numbers: " + average);

            // Notify the other thread that it can proceed
            lock.notify();
            try {
                // Wait for the other thread to complete
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread to calculate the squares of numbers in an array
class SquareThread extends Thread {
    private final Object lock; // Shared lock object for thread synchronization
    private final int[] arr;   // Array of numbers to process

    // Constructor to initialize the lock object and the array
    public SquareThread(Object lock, int[] arr) {
        this.lock = lock;
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (lock) { // Synchronize on the shared lock object
            // Calculate and print the square of each number in the array
            for (int num : arr) {
                System.out.println("Square of " + num + ": " + (num * num));
            }

            // Notify the other thread that it can proceed
            lock.notify();
            try {
                // Wait for the other thread to complete
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class to demonstrate thread synchronization
public class ThreadExample4 {
    public static void main(String[] args) {
        Object lock = new Object(); // Shared lock object for synchronization
        int[] arr = {1, 20, 50, 15, 30}; // Array of numbers to calculate squares

        // Create instances of both threads
        AverageThread averageThread = new AverageThread(lock);
        SquareThread squareThread = new SquareThread(lock, arr);

        // Start both threads
        averageThread.start();
        squareThread.start();
    }
}
