import java.util.Scanner;

public class Grammar
{
    //creating this for easy access to this varaibale
    public static int fixed = 0;
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        System.out.println("Enter a sentence: ");
        String sentence = ip.nextLine();
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println(useProperGrammar(sentence));
        System.out.println("Fixed "+ fixed +" grammatical errors:");
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        fixed = 0;
        String blank = "";
        for (int i=0; i<theText.length(); i++){
            String letter = theText.substring(i, i+1);
            if (letter.equals("2")) {
                letter = "to";
                blank += letter;
                fixed++;
            }
            else blank += letter;
        }
        return blank;
    }
}