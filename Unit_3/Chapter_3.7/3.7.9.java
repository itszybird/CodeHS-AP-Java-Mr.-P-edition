import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";

        System.out.println("Enter your password: ");
        String password1 = input.nextLine();

        System.out.println("Enter the company's secret code: ");
        String password2 = input.nextLine();

        String fullCode = password1 + companyCode;

        if (fullCode.equals(password1 + password2)) {
            System.out.println("Access granted");
        }
        else {
            System.out.println(password1 + password2 + " is denied");
        }

        
        // Use comments to organize your logic before you start coding
    }
}