import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = ip.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int urmom = ip.nextInt();
        // Compare numbers by creating three booleans
        boolean go = goal < urmom;
        boolean dad = urmom < goal;
        boolean mom = goal == urmom;
        // Display results as instructed
        System.out.println("Went over goal? " + go);
        System.out.println("Did not meet goal? " + dad);
        System.out.println("Met goal exactly? " + mom);
    }
}