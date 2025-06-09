public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        this.numerator = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        this.denominator = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator = other.getNumerator() * this.numerator;
        this.denominator = other.getDenominator() * this.denominator;
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + " / " + denominator;
    }
}


//Tester
public class FractionTester
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        Fraction mom = new Fraction(1, 3);
        // Then add code here to test out your Fraction class!
        System.out.println(mom);
    }
}