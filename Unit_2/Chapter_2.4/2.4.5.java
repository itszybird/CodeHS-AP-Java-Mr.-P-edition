public class Hello {

    private String name;

    public Hello (String yourName)
    {
        name = yourName;
    }

    public void english(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("!");
    }

    public void spanish(){
        System.out.print("Hola ");
        System.out.print(name);
        System.out.println("!");
    }

    public void french(){
        System.out.print("Bonjour ");
        System.out.print(name);
        System.out.println("!");
    }

    public void german(){
        System.out.print("Hallo ");
        System.out.print(name);
        System.out.println("!");
    }

    public void russian(){
        System.out.print("Privet ");
        System.out.print(name);
        System.out.println("!");
    }

    public void chinese(){
        System.out.print("Ni hao ");
        System.out.print(name);
        System.out.println("!");
    }
}


//Tester
import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner ip = new Scanner(System.in);
        System.out.print("whats your name: ");
        String name = ip.next();
        Hello greet = new Hello(name);
        greet.chinese();
        greet.english();
        greet.spanish();
        
        /*
        System.out.println("English");
        System.out.println("Spanish");
        System.out.println("French");
        System.out.println("German");
        System.out.println("Russian");
        System.out.println("Chinese");
        System.out.print("which one: ");
        String hello = ip.next();
        
        Hello hi = new Hello(hello);
        System.out.println(hi);
        */
    }
}