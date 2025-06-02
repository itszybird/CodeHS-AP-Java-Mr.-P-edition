import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the median.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int first = input.nextInt();

        System.out.println("Enter the second integer: ");
        int second = input.nextInt();

        System.out.println("Enter the third integer: ");
        int third = input.nextInt();

        if (first > second && third < second || third > second && first < second){
            System.out.println("The median is " + second);
        }
        else if (second > first && third < first || third > first && second < first){
            System.out.println("The median is " + first);
        }
        else {
            System.out.println("The median is " + third);
        }
        
    }
}