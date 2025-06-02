public class Construction
{
    private double lumber;  // price per board 
    private double windows; // price per square inch of window
    private double taxRate; 
   
    
    public Construction(double lumberPrice, double windowPrice, double taxes)
    {
        lumber = lumberPrice;
        windows = windowPrice;
        taxRate = taxes;
    }
    
    // Computes and returns the cost
    // of the lumber
    public double lumberCost(int numBoards)
    {
        return lumber * numBoards;   
    }
    
    // Computes and returns the cost of the windows
    public double windowCost(int numWindows)
    {
        return windows * numWindows;   
    }
    
    // Computes the grand total by adding
    // the tax amount to the total
    public double grandTotal(double total)
    {
        return total * (1 + taxRate);
    }
}


//Tester
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner (System.in);
        System.out.println("Enter the sales tax rate:");
        double sale = ip.nextDouble();
        
        Construction total = new Construction(8, 11, sale);
        
        System.out.println("How many boards do you need?");
        int board = ip.nextInt();
        double lumbers = total.lumberCost(board);
        
        System.out.println("How many windows do you need?");
        int window = ip.nextInt();
        double wins = total.windowCost(window);
        
        double subtotal = lumbers + wins;
        System.out.println("Total: " + subtotal);
        
        double grand = total.grandTotal(subtotal);
        System.out.println("Grand Total: " + grand);
        
    }
}