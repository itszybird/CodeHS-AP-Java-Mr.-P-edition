import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does dinner usually cost?");
        double cost1 = input.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double cost2 = input.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        double cost3 = input.nextDouble();
        System.out.println("");
        
        cost1 += cost1*2;
        cost2 *= 2;
        cost3 += (cost3/1/3);
        double sum = cost1 + cost2 + cost3;
        
        System.out.println("Dinner: $" + cost1);
        System.out.println("Laser Tag: $" + cost2);
        System.out.println("Ice cream: $" + cost3);
        System.out.println("Grand Total: $" + sum);
        
        
    }
}