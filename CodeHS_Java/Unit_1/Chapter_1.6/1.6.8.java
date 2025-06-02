import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       Scanner in = new Scanner(System.in);
       System.out.println("Enter movie rating (as a decimal)");
       double rating = in.nextDouble();
       int rounded = (int)(rating + 0.5);
       System.out.println("Rating rounded: " + rounded);

       
    }
}