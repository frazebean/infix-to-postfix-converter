public class EQSolverTest 
{
    public static void main(String[] args) 
    {
        DSAStack operatorStack = new DSAStack();
        ShuffleQueue postfix = new ShuffleQueue();

        String equation = "( 10.3 * ( 14 + 3.2 ) ) / ( 5 + 2 - 4 * 3 )";
        String[] infix = equation.split(" ");

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

        DSAStack evalStack = new DSAStack();

        Character plus = '+';
        Character minus = '-';
        Character multiply = '*';
        Character divide = '/';

        for(int i = 0; i < (postfix.queue).length; i++)
        {
            Object postfixElement = postfix.queue[i];

            if((postfixElement != plus) && (postfixElement != minus) &&
            (postfixElement != multiply) && (postfixElement != divide) && !(postfixElement.equals("")))
            {
                evalStack.push(postfixElement);
            }
            else
            {
                char operator = 'a';

                if(postfixElement instanceof Character)
                {
                    operator = (char)postfixElement;
                }

                double num1 = (double)evalStack.pop();
                double num2 = (double)evalStack.pop();
                double result = executeOperation(operator, num1, num2);
                evalStack.push(result);
            }
        }
    }

    public static double executeOperation(char operator, double operand1, double operand2)
    {
        double result = 0;

        if(operator == '+')
        {
            result = operand1 + operand2;
        }
        else if(operator == '-')
        {
            result = operand1 - operand2;
        }
        else if(operator == '*')
        {
            result = operand1 * operand2;
        }
        else if(operator == '/')
        {
            result = operand1 / operand2;
        }
        return result;
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
