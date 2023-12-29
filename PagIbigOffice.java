public class PagIbigOffice {
    public static void main(String[] args){
        //instantiate the app
        Queue queue = Queue.getInstance();

        queue.displayQueueNumber();

        queue.incrementQueueNumber();
        queue.displayQueueNumber();

        queue.incrementQueueNumber();
        queue.displayQueueNumber();

        queue.incrementQueueNumber();
        queue.displayQueueNumber();

        queue.resetQueueNumber(1);
        queue.displayQueueNumber();

        queue.incrementQueueNumber();
        queue.displayQueueNumber();

        queue.resetQueueNumber(0);
        queue.displayQueueNumber();

        queue.incrementQueueNumber();
        queue.displayQueueNumber();

        queue.incrementQueueNumber();
        queue.displayQueueNumber();

    }
}
