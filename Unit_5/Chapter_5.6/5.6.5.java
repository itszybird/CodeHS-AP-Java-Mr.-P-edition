public class Distance
{
    private double kilometers;

    public Distance(double kilometers){
        this.kilometers = kilometers;
    }

    public double getKilometers(){
        return kilometers;
    }
    
    public double toMiles(){
        return kilometers / 1.609;
    }

    public double toLeagues(){
        return kilometers / 5.556;
    }

    public double doubleMiles(){
        return this.toMiles() * 2;
    }
}


//Tester
public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance mom = new Distance(100);
        Distance morpheus = new Distance(100);
        Distance dad = new Distance(100);
        // Convert one to miles, one to leagues and
        // double one mileage
        System.out.println(100 + " km = " + mom.toMiles() + " miles");
        System.out.println(100 + " km = " + morpheus.toLeagues() + " leagues");
        System.out.println(100 + " km (one way) = " + dad.doubleMiles() + " miles (round trip)");
        // Print out the converted values
        // Use the getter!
    }
}