public class Talker
{
    private String speech;
    
    // Constructor
    public Talker(String startingText)
    {
        speech = startingText;
    }
    
    // Returns the text in all uppercase letters .toUpperCase()
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call 
    public String outdoorVoice()
    {
        return speech.toUpperCase();
    }
    
    // Returns the text in all lowercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String indoorVoice()
    {
        return speech.toLowerCase();
    }
    
    // Reset the instance variable to the new text
    public void setSpeech(String text)
    {
        speech = text;
    }
    
    // Returns a String representation of this object
    // The returned String should look like
    // 
    // "Text goes here," said the talker
    // 
    // The quotes should appear in the String
    // The text displayed should be the value of the instance variable
    public String toString()
    {
        return "\"" + speech + ",\" said the talker";
    }
}


//Tester
import java.util.Scanner;

public class TalkerTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter some text: ");
        String words = input.nextLine();
        
        Talker talky = new Talker(words); 
        String yelling = talky.outdoorVoice();
        String whispers = talky.indoorVoice();
        
        System.out.println(talky);
        System.out.println("Yelling: " + yelling);
        System.out.println("Whispering: " + whispers);
        
    }
}