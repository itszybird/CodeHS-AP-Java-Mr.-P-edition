public class NumberGames
{
    
    // Keep track of the number
    private double num;
    
    // Constructor
    public NumberGames(double startingNumber)
    {
        num = startingNumber;
    }
    
    // Returns the number
    public double getNumber()
    {
        return num;
    }
    
    // Doubles the number
    // Returns the doubled number
    public double doubleNumber()
    {
        num *= 2;
        return num;
    }
    
    // Squares the number
    // Returns the squared number
    public double squareNumber()
    {
        num *= num;
        return num;
    }
}


//Tester
public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        
        // Square the number
        // Print it out
        double gamesq = game.squareNumber();
        System.out.println(gamesq);
        
        // Double the number
        // Print it out
        gamesq = game.doubleNumber();
        System.out.println(gamesq);
        
        // Square the number again
        // Print it out
        gamesq = game.squareNumber();
        System.out.println(gamesq);
        
        // Get the number and store the value
        // Print out your stored value 
        gamesq = game.getNumber();
        System.out.println(gamesq);
        
        // Get the number again then store and print
        // the value
        gamesq = game.getNumber();
        System.out.println(gamesq);
        
    }
}