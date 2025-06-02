import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);

        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println("Enter a word: ");
        String words = ip.nextLine();
        System.out.println("Enter the letter to be replaced: ");
        String letter1 = ip.nextLine();
        System.out.println("Enter the new letter: ");
        String letter2 = ip.nextLine();

        String rep = replaceLetter(words, letter1, letter2);
        System.out.println("Result: " + rep);
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String Letter)
    {
        int firstin = word.indexOf(letterToReplace);
        String blank = "";
        for(int i = 0; i < word.length(); i++)
        {
            String char1 = word.substring(i, i+1);
            if (char1.equals(letterToReplace) && i != firstin) {
                blank += Letter;
            }
            else {
                blank += char1;
            }
        }
        return blank;
    }
}