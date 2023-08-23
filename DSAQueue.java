public class DSAQueue 
{
    // Class fields
    protected Object[] queue;
    protected int count;
    protected int front = -1;
    protected int rear = -1;

    // Class constant
    public static final int DEFAULT_CAPACITY = 100;

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
