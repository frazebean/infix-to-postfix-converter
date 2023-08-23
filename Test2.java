public class Test2 
{
    public static void main(String[] args) 
    {
        String equation = "24 + 3 * 2";
        double operand;
        String[] postfixExpression = new String[100];

        String[] splitEquation = equation.split(" ");

        for(int i = 0; i < splitEquation.length; i++)
        {
            if(splitEquation[i].equals("+") || splitEquation[i].equals("*"))
            {
                
            }
            else
            {
                operand = Double.parseDouble(splitEquation[i]);
                System.out.println("This is a double! " + operand);
            }

        }
    }

}

