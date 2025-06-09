public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int level, String attack){
        this.attack = attack;
        this.level = level;
    }
    // Put getters here
    public String getAttack(){
        return attack;
    }
    public int getLevel(){
        return level;
    }
    // Put other methods here
    public String fight(){
        String blank = "";
        for (int i=0; i<level; i++){
            if (level >= 15) blank += "^";
            else if (level >= 3) blank += "*~*";
            else blank += ">";
        }
        return blank;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}


//Tester
public class DragonTester
{
    public static void main(String[] args)
    {
        // Create a Dragon here to test out the Dragon class!
        Dragon mom = new Dragon(16, "explode");
        System.out.println(mom);
        System.out.println(mom.fight());
    }
}