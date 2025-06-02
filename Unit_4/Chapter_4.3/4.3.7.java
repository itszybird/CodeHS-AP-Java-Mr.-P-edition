import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        System.out.println("What is the password: ");
        String pass = ip.nextLine();
        System.out.println(passwordCheck(pass));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.

        //Character.isLetterOrDigit() useful for checking 
        //instead of typing all the letter and numbers
        if (password.length() < 8) return false;
        
        for (int i = 0; i < password.length(); i++) {
            char check = password.charAt(i);
            if (!Character.isLetterOrDigit(check)) return false;
        }
        return true;
    }
}