public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int length = word.length() / 2;
        String fh = word.substring(0,length);
        String sh = word.substring(length);
        return sh + fh;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String fp = word.substring(0, insertIdx);
        String sp = word.substring(insertIdx);
        return fp + insertText + sp;
        
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int num = word.indexOf(insertChar);
        String fs =  word.substring(0, num);
        String ss = word.substring(num);
        return fs + insertText + ss;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
}


//Tester
import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
        String w = input.nextLine();
        WordGames wor = new WordGames(w);
        // Scramble it
        // Print out scrambled word
        System.out.println(wor.scramble());
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String wor2 = input.nextLine();
        String ot = wor.bananaSplit(idx, wor2);
        // Add random word at index
        // Print out the word
        System.out.println(ot);
        // Ask for a character (store as a String)
        // Ask for random word
        System.out.println("Enter an index: ");
        String chr = input.nextLine();
        ot = wor.bananaSplit(chr, wor2);
        // Add random word at character
        System.out.println(ot);
        // Print out the word
        System.out.println(wor);
        
        
    }
}