import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit: ");
        int num = ip.nextInt();
        int small = 0;
        int large = 0;
        if (num != 0) {
            large = num;
            small = num;
        }

        while (num != 0) {
            if (num > large) {
                large = num; 
            } 
            if (num < small) {
                small = num;
            }               
            System.out.println("Results so far:\nLargest number: " + large + "\nSmallest number: " + small);
            System.out.println("Enter a number or 0 to quit: ");
            num = ip.nextInt();
        }
        
        
    }
}