//Log
public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    public double getMiles()
    {
        return numMiles;
    }
    
    public double getHours() 
    {
        return numHours;
    }
    
}


//Tester
// Class to track physical activities like miles walked and hours exercised
public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Create a new ActivityLog object to record activity data
        ActivityLog mylog = new ActivityLog();
        
        // Add 5 miles to the activity log
        mylog.addMiles(5);

        // Add 1 hour of activity
        mylog.addHours(1);
        
        // Output the total number of miles recorded
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Store the current number of hours logged (after the first day)
        double hoursToday = mylog.getHours();
        
        // Add more hours to simulate logging activity for additional days
        mylog.addHours(1.5);  // Day 2
        mylog.addHours(3);    // Day 3
        
        // Calculate the increase in activity hours from the first day
        double increase = mylog.getHours() - hoursToday;
        
        // Display how many more hours were logged today compared to two days ago
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}