public class EquationSolver 
{
    public static void main(String[] args) 
    {
        DSAStack operatorStack = new DSAStack();
        ShuffleQueue postfix = new ShuffleQueue();

        String equation = "( 10.3 * ( 14 + 3.2 ) ) / ( 5 + 2 - 4 * 3 )";
        String[] infix = equation.split(" ");

        for(int i = 0; i < infix.length; i++)
        {
            System.out.println(infix[i]);
        }

        Object openBracket = '(';

        for(int i = 0; i < infix.length; i++)
        {
            char term = infix[i].charAt(0);

            if(term == '(')
            {
                operatorStack.push('(');
            }
            else if(term == ')')
            {
                while(operatorStack.top() != openBracket)
                {
                    postfix.enqueue(operatorStack.pop());
                }
                operatorStack.pop();
            }
            else if((term == '+') || (term == '-') || (term == '*') || (term == '/'))
            {
                while(!(operatorStack.isEmpty()) && (operatorStack.top() != openBracket)
                && (precedenceOf((char)operatorStack.top())) >= (precedenceOf(term)))
                {
                    postfix.enqueue(operatorStack.pop());
                }
                operatorStack.push(term);
            }
            else
            {
                double value = Double.valueOf(infix[i]);
                postfix.enqueue(value);
            }
        }

        while(!(operatorStack.isEmpty()))
        {
            postfix.enqueue(operatorStack.pop());
        }
        
        postfix.printQueue();
    }

    public static int precedenceOf(char theOperator)
    {
        int value = 0;
        if((theOperator == '+') || (theOperator == '-'))
        {
            value = 1;
        }
        else if((theOperator == '*') || (theOperator == '/'))
        {
            value = 2;
        }
        return value;
    }
}
