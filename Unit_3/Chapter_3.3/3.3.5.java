import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        // Start by making comments to outline the logic of your program
        int mile = ip.nextInt();
        if (mile >= 223){
            System.out.println("Right on! Keep running!");
        }
        else{
           System.out.println("Are you sure? That's a new world record!"); 
        }
    }
}