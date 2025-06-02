public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    // Returns the numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    // Returns the denominator
    public int getDenominator()
    {
        return denominator;
    }
    
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return numerator + "/" + denominator;
    }
}


//Tester
import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner ip = new Scanner(System.in);
        
        // Ask for input
        System.out.println("Enter the numerator: ");
        int num = ip.nextInt();
        System.out.println("Enter the denominator: ");
        int den = ip.nextInt();
        // Create a new Fraction with the user's input
        Fraction frac = new Fraction(num, den);
        Fraction def = new Fraction(1,2);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int a = def.getNumerator();
        int b = def.getDenominator();
        int c = frac.getNumerator();
        int d = frac.getDenominator();
        int tn = (a*d) + (b*c);
        int td = b*d;
        String total = tn + "/" + td;
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println( def + " + " + frac + " = " + total);
        
    }
}