import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the first test name: ");
        String name1 = input.nextLine();
        System.out.print("Please enter the first test score: ");
        double score1 = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter the second test name: ");
        String name2 = input.nextLine();
        System.out.print("Please enter the second test score: ");
        double score2 = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter the third test name: ");
        String name3 = input.nextLine();
        System.out.print("Please enter the third test score: ");
        double score3 = input.nextDouble();
        double sum = (score1 + score2 + score3) / 3;
        System.out.print("Your average score is: " + sum);
    }
}
/*
Please enter the first test name: Variables
Please enter the first test score: 97.3
Please enter the second test name: Printing
Please enter the second test score: 96
Please enter the third test name: User Input
Please enter the third test score: 100
Your average score is: 97.76666666666667
*/