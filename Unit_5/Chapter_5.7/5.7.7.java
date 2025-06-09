public class Team
{
    // Static Variables
    public static int totalTeams = 0;
    public static int minTeams = 6;
    
    // Constructor
    public Team(){
        totalTeams += 1;
    }
    
    // Static Methods 
    public static boolean tournamentReady(){
        if (totalTeams >= minTeams) return true;
        return false;
    }
}


//Tester
public class TeamTester
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 8; i++)
        {
            // Create a team
            Team opponent = new Team();
            
            // Ready to play a tournament?
            System.out.println(i + 1 + " teams added");
            System.out.print("Ready for tournament? ");
            System.out.println(Team.tournamentReady());
        }
    }
}