public class DSAShufflingQueue
{
    // Class fields
    private Object[] queue;
    private int count;

    // Class constant
    public static final int DEFAULT_CAPACITY = 100;

    // Default constructor
    public DSAShufflingQueue()
    {
        queue = new Object[DEFAULT_CAPACITY];
        count = 0;
    }
    // Parameter/Alternate constructor
    public DSAShufflingQueue(int maxCapacity)
    {
        queue = new Object[maxCapacity];
        count = 0;
    }

    // Accessor 'getCount'
    public int getCount()
    {
        return count;
    }
    // Accessor 'isEmpty'
    public boolean isEmpty()
    {
        boolean empty = false;

        if(count == 0)
        {
            empty = true;
        }

        return empty;
    }
    // Accessor 'isFull'
    public boolean isFull()
    {
        boolean full = false;

        if(count == queue.length)
        {
            full = true;
        }

        return full;
    }

    // Mutator 'enqueue'
    public void enqueue(Object value)
    {
        if(isFull())
        {
            throw new ArrayIndexOutOfBoundsException("Shuffling queue is full!");
        }
        else
        {
            queue[count] = value;
            count = count + 1;
        }
    }
    // Mutator 'dequeue'
    public Object dequeue()
    {
        Object frontValue;

        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Shuffling queue is empty!");
        }
        else
        {
            frontValue = peek();

            for(int i = 0; i < count-1; i++)
            {
                queue[i] = queue[i+1];
            }
            queue[count-1] = null;
            count = count - 1;
        }

        return frontValue;
    }
    // Accessor 'peek'
    public Object peek()
    {
        Object frontValue;

        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Shuffling queue is empty!");
        }
        else
        {
            frontValue = queue[0];
        }

        return frontValue;
    }

    // Just an extra function I added to easily see stack in action.
    public void printQueue()
    {
        for(int i = 0; i < queue.length; i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
