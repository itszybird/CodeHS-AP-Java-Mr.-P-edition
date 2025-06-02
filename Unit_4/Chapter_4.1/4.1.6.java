import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
        // Your code starts here
        Scanner ip = new Scanner(System.in);
        System.out.print("Starting Taffy Timer...\nEnter the temperature: ");
        int mix = ip.nextInt();


        while (mix < 270) {
           System.out.println(""); 
           System.out.print("The mixture isn't ready yet.\nEnter the temperature: ");
           mix = ip.nextInt();

        } 

        System.out.println(""); 
        System.out.println("Your taffy is ready for the next step!");
    }
}