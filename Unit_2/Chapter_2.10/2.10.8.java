public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track rounded to 2 decimals
    public double computeTime(double distance)
    {
        double t = Math.sqrt(2 * (distance / accel));
        return Math.round(t * 100.0) / 100.0; 
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}


//Main
public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double acar1 = Math.round(Math.random() * 100 + 1);
        double acar2 = Math.round(Math.random() * 100 + 1);
        
        // Create two Racecar objects
        Racecar car1 = new Racecar(acar1, "mom");
        Racecar car2 = new Racecar(acar1, "dad");
        
        // Compute the finishing times for both cars
        double time1 = car1.computeTime(distance);
        double time2 = car2.computeTime(distance);
        
        // Print times of each car
        System.out.println(car1 + " finished in " + (time1)+ " seconds");
        System.out.println(car2 + " finished in " + (time2)+ " seconds");
        
    }
}