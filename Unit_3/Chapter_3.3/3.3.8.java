import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        System.out.println("Enter player one's name: ");
        String name1 = ip.nextLine();

        System.out.println("Enter player two's name: ");
        String name2 = ip.nextLine();
        
        System.out.println("Enter "+ name1 +"'s score");
        int s1 = ip.nextInt();

        System.out.println("Enter "+ name2 +"'s score");
        int s2 = ip.nextInt();

        if (name1.compareTo(name2) < 1){
            System.out.println(name1 + " scored "+ s1 +" points");
            System.out.println(name2 + " scored "+ s2 +" points");
            if (s1 > s2){
                System.out.println(name1 + " wins!");
            }
            else{
                System.out.println(name2 + " wins!");
            }
        }
        else {
            System.out.println(name2 + " scored "+ s2 +" points");
            System.out.println(name1 + " scored "+ s1 +" points");
            if (s1 > s2){
                System.out.println(name1 + " wins!");
            }
            else{
                System.out.println(name2 + " wins!");
            }
        }
    }
}