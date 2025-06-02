import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String name = input.nextLine();
        System.out.println("Enter the year the book was published: ");
        String pub = input.nextLine();
        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String puber = input.nextLine();
    
        System.out.println(name + ". " + title+". ");
        System.out.println("  "+puber+ ", " +pub+ ". ");
    }   
}
/*
Enter the author's name as 'Last name, First name': 
Collins, Suzanne
Enter the year the book was published: 
2008
Enter the title of the book: 
The Hunger Games
Enter the publisher of the book: 
Scholastic
Collins, Suzanne. The Hunger Games.
Scholastic, 2008.
*/