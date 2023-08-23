public class DSACircularQueue 
{
    // Class fields
    private Object[] queue;
    private int count;
    private int front = -1;
    private int rear = -1;

    // Class constant
    public static final int DEFAULT_CAPACITY = 100;

    // Default constructor
    public DSACircularQueue()
    {
        queue = new Object[DEFAULT_CAPACITY];
        count = 0;
    }
    // Parameter/Alternate constructor
    public DSACircularQueue(int maxCapacity)
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
            throw new ArrayIndexOutOfBoundsException("Circular queue is full!");
        }
        else
        {
            if(rear == queue.length-1)
            {
                rear = -1;
            }

            rear = rear + 1;
            queue[rear] = value;
            count = count + 1;
        }
    }
    // Mutator 'dequeue'
    public void dequeue()
    {
        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Circular queue is empty!");
        }
        else
        {
            if(front == queue.length-1)
            {
                front = -1;
            }

            front = front + 1;
            queue[front] = null;
            count = count - 1;
        }
    }
    // Accessor 'peek'
    public Object peek()
    {
        Object frontValue;

        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Circular queue is empty!");
        }
        else
        {
            if(front == queue.length-1)
            {
                front = -1;
            }
            
            frontValue = queue[front+1];
        }

        return frontValue;
    }

    public void printCircularQueue()
    {
        for(int i = 0; i < queue.length; i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}   
