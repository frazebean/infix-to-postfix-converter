public class Test 
{
    public static void main(String[] args) 
    {
        ShuffleQueue shuffleQueue = new ShuffleQueue(3);

        shuffleQueue.enqueue(3);
        shuffleQueue.enqueue(5);

        shuffleQueue.dequeue();

        shuffleQueue.enqueue(3);
        shuffleQueue.enqueue(7);

        shuffleQueue.dequeue();
    
        System.out.println(shuffleQueue.peek());
        shuffleQueue.printQueue();
    }   
}
