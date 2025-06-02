public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    // Constructor
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void updateDamage(int attackPower)
    {
        if (attackPower < 5) {
            health -= 2;
        }
        else if (attackPower < 10) {
            health -= 7;
        }
        else if (attackPower >= 10) {
            health -= 10;
        }

    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        return health > 0;
    }
    
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
}


//Tester
public class ShipTester
{
    public static void main(String[] args)
    {
        Battleship sub = new Battleship("submarine", 6);
        Battleship raft = new Battleship("raft", 2);
        Battleship destroyer = new Battleship("destroyer", 11);
     
        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());
        
        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());
        
        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());
        
        System.out.println("\nRaft attacks Sub");
        sub.updateDamage(raft.getPower());
        System.out.println(sub);
        
        System.out.println("\nDestroyer attacks Raft");
        raft.updateDamage(destroyer.getPower());
        System.out.println(raft);
        
        System.out.println("\nSub attacks Destroyer");
        destroyer.updateDamage(sub.getPower());
        System.out.println(destroyer);


    }
}