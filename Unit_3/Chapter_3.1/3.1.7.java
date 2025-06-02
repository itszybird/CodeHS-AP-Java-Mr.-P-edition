import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today? ");
        int granny = ip.nextInt();
        // Use a boolean expression to print if they can eat more sugar
        boolean grandpa = granny < 30;
        System.out.println("You can eat more sugar: " + grandpa);
    }
}