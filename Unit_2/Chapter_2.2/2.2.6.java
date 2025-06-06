public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}


//Tester
public class RectangleTester 
{
    public static void main(String[] args)
    {
        // Create a rectangle with width 5 and height 12
        Rectangle rect = new Rectangle(5,12);
        System.out.println(rect);
        // Then print it out
    }
}