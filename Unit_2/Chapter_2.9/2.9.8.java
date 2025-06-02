public class Extremes
{
    private Integer min;
    private Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
    }
    
    // Returns the quotient
    // max / number
    public Integer maxQuotient(Integer number)
    {
        return max / number;
    }

    // Returns the quotient
    // min / number
    public Integer minQuotient(Integer number)
    {
        return min / number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}


//Main
import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner ip = new Scanner(System.in);
        // Create an Extremes object
        Extremes obj = new Extremes();
        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is? ");
        int mx = ip.nextInt();
        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        System.out.println("You'd need to multiply your number by " + obj.maxQuotient(mx) + " to reach the max value!");
        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is? ");
        int mi = ip.nextInt();
        // Computer and display what they'd need to multiply by
        // to reach the minimum number
        System.out.println("You'd need to multiply your number by " + obj.minQuotient(mi) + " to reach the min value!");
    }
}