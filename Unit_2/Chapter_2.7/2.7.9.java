import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        
        // Ask for a quote
        // Ask for the author
        System.out.println("Enter a quote: ");
        String quote = ip.nextLine();
        
        System.out.println("Enter the author of the quote: ");
        String author = ip.nextLine();
        
        System.out.println("\"" + quote + "\"" + "\n" + author);
        
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
    }
}

/*
Enter a quote: 
Oh the places you'll go!
Enter the author of the quote: 
Dr. Seuss
"Oh the places you'll go!"
Dr. Seuss
*/