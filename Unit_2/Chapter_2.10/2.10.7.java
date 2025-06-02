public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double angle1 = 0;
        double angle2= Math.PI / 2;
        double angle3 = Math.PI;
        double rou1 = Math.cos(angle2);
        double rou2 = Math.sin(angle3);
        
        System.out.println(angle1 + ": " + Math.cos(angle1) + ", " + Math.sin(angle1));
        System.out.println(angle2 + ": " + Math.round(rou1) + ", " + Math.sin(angle2));
        System.out.println(angle3 + ": " + Math.cos(angle3) + ", " + Math.round(rou2));
    }
}