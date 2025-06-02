public class Point
{
    private int x;
    private int y;
    
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString()
    {
        return x + ", " + y;
    }
}


//Tester
public class PointTester
{
    public static void main(String[] args)
    {
        Point p0 = new Point(10, 5);
        System.out.println(p0);
        p0.move(3, 4);
        
        System.out.println(p0);
        
        Point p1 = new Point(2, 4);
        System.out.println(p1);
        p1.move(5, 2);
        
        System.out.println(p1);
        
        // Make a new point here at position (2, 4)
        
        // Then print it out
        
        // Move the point 5 units in the x direction and
        // 2 units in the y direction
        
        // Print out the point again to see that it moved
    }
}