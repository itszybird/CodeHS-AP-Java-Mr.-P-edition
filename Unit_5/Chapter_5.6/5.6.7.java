public class Car {

    // Start here
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;

    public Car(double carEfficiency, double carTankCapacity){
        this.tankCapacity = carTankCapacity;
        this.efficiency = carEfficiency;
    }

    public void addGas(){
        this.gas = this.tankCapacity;
        System.out.println("Filling up ...");
    } //- this method should fill the car with gas up to the tank capacity. The method should print `Filling up ...`

    public void addGas(double amount){
        this.gas += amount;
        if (gas > this.tankCapacity) {
            this.gas = this.tankCapacity;
        }
        System.out.println("Adding gas ...");
    } //- This should add amount to the tank. If the amount is greater than the capacity, set the gas to the tank capacity. The method should print `Adding gas ...`

    public double getTotalMilesDriven(){
        return totalMilesDriven;
    } //- returns the number of miles the car has driven

    public void drive(double distance){
        if (this.gas * this.efficiency >= distance) {
            this.gas -= (distance / efficiency);
            this.totalMilesDriven += distance;
            System.out.println("Driving " + distance);
        }
        else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    } //- checks if car can drive that number of miles, and then adds miles to totalMilesDriven and subtracts the amount of gas needed to go those miles. The method should print `Driving [distance]` or, if the distance is too far, it should print `Can't drive [distance]. That's too far!`

    public boolean canDrive (double distance){
        if (this.gas * this.efficiency >= distance) {
            return true;
        }
        return false;
    } //- returns true if the car has enough gas to travel the specified distance

    public double milesAvailable(){
        return this.gas * this.efficiency;
    } //- returns how many more miles the car could drive

    public double getGas(){
        return gas;
    } //- returns the amount of gas left
}


//Tester
public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car mom = new Car(20, 15);
        //Fill up the gas tank
        mom.addGas();
        //Check the miles available
        System.out.println("Miles available: " + mom.milesAvailable());
        //Drive 100 miles
        mom.drive(100);
        //Check the miles available
        System.out.println("Miles available: " + mom.milesAvailable());
        //Add 2 gallons to the gas tank
        mom.addGas(2);
        //Check the miles available
        System.out.println("Miles available: " + mom.milesAvailable());
        //Try driving more miles than available by driving 1000 miles
        mom.drive(1000);
        //Drive 200 miles
        mom.drive(200);
        //Check how much gas you have left
        System.out.println("Gas remaining: " + mom.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " + mom.getTotalMilesDriven());

    }
}