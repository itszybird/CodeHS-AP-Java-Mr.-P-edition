import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score? ");
        int po = ip.nextInt();
        System.out.println("How many rebounds did you get? ");
        int re = ip.nextInt();
        System.out.println("How many assists did you have? ");
        int ass = ip.nextInt();
        // Create three boolean variables that
        boolean act = po >= 10;
        boolean atc = re >= 10;
        boolean ac = ass >= 10;
        // check if the stats are 10 or more
        System.out.println("You got 10 or more points: " + act);
        System.out.println("You got 10 or more rebounds: " + atc);
        System.out.println("You got 10 or more assists: " + ac);
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        
        
    }
}