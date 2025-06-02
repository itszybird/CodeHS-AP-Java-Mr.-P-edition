import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        // Ask for a berry 
        System.out.println("Enter the initial of the berry: ");
        String berry = ip.nextLine();
        
        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        // Remember that characters can be compared using == 
        if (berry.charAt(0) == 'E'){
            System.out.println("You ordered Elderberry");
        }
        else if (berry.charAt(0) == 'G'){
            System.out.println("You ordered Gooseberry");
        }
        else if (berry.charAt(0) == 'L'){
            System.out.println("You ordered Lingonberry");
        }
        else{
            System.out.println("Berry not recognized");
        }
        // Use comments to list the different
        // branches you will need before you write the code
    }
}