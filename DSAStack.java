public class DSAStack
{
    // Class fields
    private Object[] stack;
    private int count;

    // Class constant
    public static final int DEFAULT_CAPACITY = 100;

    // Default constructor
    public DSAStack()
    {
        stack = new Object[DEFAULT_CAPACITY];
        count = 0;
    }
    // Parameter/Alternate constructor
    public DSAStack(int maxCapacity)
    {
        stack = new Object[maxCapacity];
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

        if(count == stack.length)
        {
            full = true;
        }

        return full;
    }

    // Mutator 'push'
    public void push(Object value)
    {
        if(isFull())
        {
            throw new ArrayIndexOutOfBoundsException("Stack is full!");
        }
        else
        {
            stack[count] = value;
            count = count + 1;
        }
    }
    // Mutator 'pop'
    public Object pop()
    {
        Object topVal;

        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Stack is empty!");
        }
        else
        {
            topVal = top();
            count = count - 1;
            stack[count] = null;
        }
        return topVal;
    }
    // Accessor 'top'
    public Object top()
    {
        Object topVal;

        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Stack is empty!");
        }
        else
        {
            topVal = stack[count-1];
        }

        return topVal;
    }

    // Just an extra function I added to easily see stack in action.
    public void printStack()
    {
        for(int i = 0; i < stack.length; i++)
        {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}