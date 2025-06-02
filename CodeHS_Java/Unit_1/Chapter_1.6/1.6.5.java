import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);
        System.out.print("First Int: ");
        int int1 = in.nextInt();
        System.out.print("Second Int: ");
        int int2 = in.nextInt();
        double sum = (double)int1 / (double)int2;
        System.out.print(sum);
        
        
    }
}