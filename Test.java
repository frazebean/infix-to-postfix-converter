public class Test 
{
    public static void main(String[] args) 
    {
        DSACircularQueue circularQueue = new DSACircularQueue(3);

        circularQueue.enqueue(23);
        circularQueue.enqueue("ho");

        System.out.println(circularQueue.getCount());
        circularQueue.printQueue();
    }   
}
