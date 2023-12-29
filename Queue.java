public class Queue {
    private static Queue instance;
    private int queueNumber;

    private Queue(){
        this.queueNumber = 1;
    }

    public static Queue getInstance() {
        if (instance == null) {
            synchronized (Queue.class) {
                if (instance == null) {
                    instance = new Queue();
                }
            }
        }
        return instance;
    }

    public void incrementQueueNumber() {
        queueNumber++;
    }

    public void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber >= 1) {
            queueNumber = newQueueNumber;
            System.out.println("Queue has been reset");
        } else {
            System.out.println("Invalid input. Queue number remains as " + queueNumber);
        }
    }

    public void displayQueueNumber() {
        System.out.println("Current Queue Number: " + queueNumber);
        System.out.println();
    }
}