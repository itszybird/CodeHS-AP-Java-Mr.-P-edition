public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String theCandy, String theColor, String theShape)
    {
        candy = theCandy;
        color = theColor;
        shape = theShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String theColor, String theShape)
    {
        candy = "hard candy";
        color = theColor;
        shape = theShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String theCandy)
    {
        candy = theCandy;
        color = "rainbow";
        shape = "donkey";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}


//Tester
public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", "blue", "star");
        Pinata sweetie = new Pinata("sour straws");
        
        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
        
        
    }
}