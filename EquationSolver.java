import java.util.*;

public class EquationSolver 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String equation;

        System.out.print("Enter your equation: ");
        equation = input.nextLine();

        System.out.println(solve(equation));

        input.close();
    }
    public static double solve(String equation)
    {
        CircularQueue postfixFormat = parseInfixToPostfix(equation);
        double finalResult = evaluatePostfix(postfixFormat);

        return finalResult;
    }
    private static CircularQueue parseInfixToPostfix(String equation)
    {
        DSAStack operatorStack = new DSAStack();
        CircularQueue postfix = new CircularQueue();
        String[] infix = equation.split(" ");

        Object openBracket = '(';

        try
        {
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
        }
        catch(Exception error)
        {
            System.out.println("Invalid expression!");
        }

        return postfix;
    }
    private static int precedenceOf(char theOperator)
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

    private static double evaluatePostfix(CircularQueue postfix)
    {
        DSAStack evalStack = new DSAStack();
        double finalResult = 0;

        try
        {
            for(int i = 0; i < (postfix.queue).length; i++)
            {
                Object postfixElement = postfix.queue[i];

                if(postfixElement instanceof Double)
                {
                    evalStack.push(postfixElement);
                }
                else if(postfixElement instanceof Character)
                {
                    char operator = (char)postfixElement;

                    double num1 = (double)evalStack.pop();
                    double num2 = (double)evalStack.pop();
                    double result = executeOperation(operator, num1, num2);
                    evalStack.push(result);
                }
            }
            
            if(evalStack.getCount() == 1)
            {
                finalResult = (double)evalStack.pop();
            }

            System.out.print("Your answer is: ");
        }
        catch(Exception error)
        {
            System.out.println("Invalid expression!");
        }
        return finalResult;
    }
    private static double executeOperation(char operator, double operand1, double operand2)
    {
        double result = 0.0;

        if(operator == '+')
        {
            result = operand2 + operand1;
        }
        else if(operator == '-')
        {
            result = operand2 - operand1;
        }
        else if(operator == '*')
        {
            result = operand2 * operand1;
        }
        else if(operator == '/')
        {
            result = operand2 / operand1;
        }
        return result;
    }
}
