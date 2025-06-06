public class Battleship
{
    private String shipType;
    private int position;
    
    public Battleship(String type, int shipPosition)
    {
        shipType = type; 
        position = shipPosition;
    }
    
    // Moves the ship
    // If safeToMove is true, add 10 to position
    // else subtract 1 from position
    public void move (boolean safeToMove)
    {
       if (safeToMove){
           position += 10;
       }
       else{
           position -= 1;
       }
       // Because safeToMove is already a boolean
       // value, you DO NOT need to compare it to
       // true
       // Just use
       // if (safeToMove)

    }
    
    // Returns the position of the ship
    public int getPosition()
    {
        return position;
    }
    
    // String representation of the object
    public String toString()
    {
        return shipType + " at " + position;
    }
}


//Tester
public class BattleshipTester
{
    public static void main(String[] args)
    {
        // Create objects
        Battleship submarine = new Battleship("Submarine", 4);
        Battleship carrier = new Battleship("Carrier", 10);
        
        // Check initial positions
        System.out.println(submarine);
        System.out.println(carrier);
        
        // Test: Safely move submarine
        System.out.println("Submarine cleared to proceed");
        submarine.move(true);
        System.out.println(submarine);
        
        
        // Test unsafe to move carrier
        System.out.println("Carrier NOT cleared to proceed");
        carrier.move(false);
        System.out.println(carrier);
        
        
    }
}