import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        System.out.println("What do you want to drink? ");
        String type_shit = ip.nextLine();
        
        System.out.println("How many teaspoons of sugar do you want? ");
        int SUGARRUSH = ip.nextInt();
        
        if (SUGARRUSH <= 0){
            System.out.println("Confirming your order. You wanted:\n" + type_shit);
        }
        if (SUGARRUSH > 0){
            System.out.println("Confirming your order. You wanted:\n" + type_shit +" with sugar");
        }
        
    }
}