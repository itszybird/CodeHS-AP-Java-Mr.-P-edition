public class Pizza
{
    // Add the instance variables here
    private String type;
    private String toppings;
    private int size;
    // Put the constructor here
    public Pizza (String theType, String theToppings, int theSize)
    {
        type = theType;
        toppings = theToppings;
        size = theSize;
    }
    
    
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}


//Tester
public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza yum = new Pizza("Cheese", "Cheese", 100);
        System.out.println(yum);
        yum = new Pizza("Veggie", "Cheese", 100);
        System.out.println(yum);
        yum = new Pizza("Meat", "Cheese", 100);
        System.out.println(yum);
    }
}