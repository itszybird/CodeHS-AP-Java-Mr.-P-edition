//Log
/**
 * The ActivityLog class tracks the number of hours and miles 
 * a user logs during physical activity.
 */
public class ActivityLog
{
    // Fields to store total hours and miles
    private double numHours;
    private double numMiles;

    /**
     * Constructs a new ActivityLog with 0 hours and 0 miles.
     */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }

    /**
     * Adds the specified number of hours to the activity log.
     *
     * @param hours the number of hours to add
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }

    /**
     * Adds the specified number of miles to the activity log.
     *
     * @param miles the number of miles to add
     */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }

    /**
     * Gets the total number of miles logged.
     *
     * @return the total miles
     */
    public double getMiles()
    {
        return numMiles;
    }

    /**
     * Gets the total number of hours logged.
     *
     * @return the total hours
     */
    public double getHours() 
    {
        return numHours;
    }
}


//Tester
public class ActivityTracker
{
    public static void main(String[] args)
    {
        ActivityLog mylog = new ActivityLog();
        
        mylog.addMiles(5);
        mylog.addHours(1);
        
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        double hoursToday = mylog.getHours();
        
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        double increase = mylog.getHours() - hoursToday;
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}