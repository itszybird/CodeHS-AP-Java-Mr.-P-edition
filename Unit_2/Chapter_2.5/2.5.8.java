public class Calculator
{
    /* This class doesn't need instance variable or
     * a constructor. You can create the same way
     * you create other objects, using empty
     * parenthesis.
     * Calculator c = new Calculator();
     *
     */
     
    // Prints the sum of x and y
    public void add(double x, double y)
    {
        double result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(double x, double y)
    {
        double result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the quotient of x and y
    public void divide(double x, double y)
    {
        double result = x / y;
        System.out.print(x);
        System.out.print(" / ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the difference of x and y
    public void subtract(double x, double y)
    {
        double result = x - y;
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
}


//Tester
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter two doubles: ");
        Double enter1 = ip.nextDouble();
        Double enter2 = ip.nextDouble();
        
        c.add(enter1, enter2);
        c.multiply(enter1, enter2);
        c.divide(enter1, enter2);
        c.subtract(enter1, enter2);
        
        
        
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
    }
}