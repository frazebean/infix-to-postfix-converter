public class TestProgram 
{
    public static void main(String[] args) 
    {
        testDSAStack();
        System.out.println();
        testShuffleQueue();
        System.out.println();
        testCircularQueue();
    }

    public static void testDSAStack()
    {
        DSAStack stack = new DSAStack(5);

        System.out.println("Stack operation:");

        stack.push(8);
        stack.push("Cow");
        stack.push("Horse");
        stack.push(89);
        stack.push("Cat");

        System.out.print("\nBefore popping: ");
        stack.printStack();
        System.out.println("Count: " + stack.getCount());
        System.out.println("Top: " + stack.top());
        System.out.println();

        Object firstPop = stack.pop();
        Object secondPop = stack.pop();
        Object thirdPop = stack.pop();

        System.out.println("First pop: " + firstPop);
        System.out.println("Second pop: " + secondPop);
        System.out.println("Third pop: " + thirdPop);

        System.out.print("\nAfter popping: ");
        stack.printStack();
        System.out.println("Count: " + stack.getCount());
        System.out.println("Top: " + stack.top());
    }

    public static void testShuffleQueue()
    {
        ShuffleQueue shuffleQueue = new ShuffleQueue(5);

        System.out.println("Queue operation (Shuffle):");

        shuffleQueue.enqueue(8);
        shuffleQueue.enqueue("Cow");
        shuffleQueue.enqueue("Horse");
        shuffleQueue.enqueue(89);
        shuffleQueue.enqueue("Cat");

        System.out.print("\nBefore popping: ");
        shuffleQueue.printQueue();
        System.out.println("Count: " + shuffleQueue.getCount());
        System.out.println("Top: " + shuffleQueue.peek());
        System.out.println();

        Object firstDequeue = shuffleQueue.dequeue();
        Object secondDequeue = shuffleQueue.dequeue();
        Object thirdDequeue = shuffleQueue.dequeue();

        System.out.println("First dequeue: " + firstDequeue);
        System.out.println("Second dequeue: " + secondDequeue);
        System.out.println("Third dequeue: " + thirdDequeue);

        System.out.print("\nAfter popping: ");
        shuffleQueue.printQueue();
        System.out.println("Count: " + shuffleQueue.getCount());
        System.out.println("Top: " + shuffleQueue.peek());
    }

    public static void testCircularQueue()
    {
        CircularQueue circularQueue = new CircularQueue(5);

        System.out.println("Queue operation (Circular):");

        circularQueue.enqueue(8);
        circularQueue.enqueue("Cow");
        circularQueue.enqueue("Horse");
        circularQueue.enqueue(89);
        circularQueue.enqueue("Cat");

        System.out.print("\nBefore popping: ");
        circularQueue.printQueue();
        System.out.println("Count: " + circularQueue.getCount());
        System.out.println("Top: " + circularQueue.peek());
        System.out.println();

        Object firstDequeue = circularQueue.dequeue();
        Object secondDequeue = circularQueue.dequeue();
        Object thirdDequeue = circularQueue.dequeue();

        System.out.println("First dequeue: " + firstDequeue);
        System.out.println("Second dequeue: " + secondDequeue);
        System.out.println("Third dequeue: " + thirdDequeue);

        System.out.print("\nAfter popping: ");
        circularQueue.printQueue();
        System.out.println("Count: " + circularQueue.getCount());
        System.out.println("Top: " + circularQueue.peek());
    }
}
