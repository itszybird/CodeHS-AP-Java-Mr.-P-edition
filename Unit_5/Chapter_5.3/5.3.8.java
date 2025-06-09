import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        // Start by importing your code from the previous exercise
        System.out.print("Do you want to travel to [A]tlantis or [R]ibe? ");
        String firstChoice = input.nextLine();
        if (firstChoice.toUpperCase().substring(0,1).equals("R")) System.out.print("Great now your in Ribe");
        if (firstChoice.toUpperCase().substring(0,1).equals("A")) System.out.print("Great now your in Altantis");

        System.out.print("Do you want to travel to [M]om or [D]ad? ");
        String firstChoice = input.nextLine();
        if (firstChoice.toUpperCase().substring(0,1).equals("M")) System.out.print("Great now your at Mom");
        if (firstChoice.toUpperCase().substring(0,1).equals("D")) System.out.print("Great now your at Dad");
    }
}