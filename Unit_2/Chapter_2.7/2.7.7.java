public class Calculator
{
    // This class does not need instance variables!
    // Since there are no instance variables,
    // this class also does not need a constructor.
    
    // Java will create an empty constructor for you.
    
    // Returns the sum of x and y
    public double sum(double x, double y)
    {
        return x + y;
        
    }
    
    // Returns the product of x and y
    public double multiply(double x, double y)
    {
        return x * y;
        
    }
    
    // Returns the quotient x / y
    public double divide(double x, double y)
    {
       return x / y;
    }
    
    // Returns the difference of x - y
    public double subtract(double x, double y)
    {
        return x - y;
    }
}


//Tester
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner ip = new Scanner(System.in);
        Calculator cal = new Calculator();
        
        System.out.println("Enter two doubles ");
        double num1 = ip.nextDouble();
        double num2 = ip.nextDouble();
        
        System.out.println(num1 + " + " +  num2 + " = " + cal.sum(num1, num2));
        System.out.println(num1 + " - " +  num2 + " = " + cal.subtract(num1, num2));
        System.out.println(num1 + " * " +  num2 + " = " + cal.multiply(num1, num2));
        System.out.println(num1 + " / " +  num2 + " = " + cal.divide(num1, num2));
        
        
    }
}

/*
Enter two doubles
3.4
1.6
3.4 + 1.6 = 5.0
3.4 - 1.6 = 1.7999999999999998
3.4 * 1.6 = 5.44
3.4 / 1.6 = 2.125
*/