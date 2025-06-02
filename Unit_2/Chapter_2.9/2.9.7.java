public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        int out = (int) value.doubleValue();
        return out;
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        int out = (int) value.doubleValue();
        double f = (value - out) * 100.0;
        return (int)(f + 0.50);
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        String val = String.format("%.2f", value);
        return "$" + val;
    }
}


//Tester
public class CurrencyTester
{
    public static void main(String[] args)
    {
        Currency bankRoll = new Currency(12.45);
        
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
        bankRoll.setValue(20.56);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        bankRoll.setValue(67.78);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
    }
}