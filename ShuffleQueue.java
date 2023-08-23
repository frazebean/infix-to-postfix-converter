public class ShuffleQueue extends DSAQueue
{
    // Class constructor
    public ShuffleQueue()
    {
        queue = new Object[DEFAULT_CAPACITY];
        count = 0;
    }
    // Parameter/Alternate constructor
    public ShuffleQueue(int maxCapacity)
    {
        queue = new Object[maxCapacity];
        count = 0;
    }

    // Mutator 'enqueue'
    public void enqueue(Object value)
    {
        if(isFull())
        {
            throw new ArrayIndexOutOfBoundsException("Queue is full!");
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
            throw new IndexOutOfBoundsException("Queue is empty!");
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
            throw new IndexOutOfBoundsException("Queue is empty!");
        }
        else
        {
            frontValue = queue[0];
        }

        return frontValue;
    }
}
