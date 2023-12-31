public class CircularQueue extends DSAQueue
{
    // Class constructor
    public CircularQueue()
    {
        queue = new Object[DEFAULT_CAPACITY];
        count = 0;
    }
    // Parameter/Alternate constructor
    public CircularQueue(int maxCapacity)
    {
        queue = new Object[maxCapacity];
        count = 0;
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
    public Object dequeue()
    {
        Object frontValue;

        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Circular queue is empty!");
        }
        else
        {
            frontValue = peek();

            if(front == queue.length-1)
            {
                front = -1;
            }

            front = front + 1;
            queue[front] = null;
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
}   
