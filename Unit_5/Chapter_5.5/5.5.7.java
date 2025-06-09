public class Routine
{
    double school;
    double sleep;
    double friends;
    double hobbies;

    public double getSchool(){
        return school;
    }

    public double getSleep(){
        return sleep;
    }

    public double getFriends(){
        return friends;
    }

    public double getHobbies(){
        return hobbies;
    }

    public void setSchool(double value){
        school = value;
    }

    public void setSleep(double value){
        sleep = value;
    }

    public void setFriends(double value){
        friends = value;
    }

    public void setHobbies(double value){
        hobbies = value;
    }

    public void printTotal(){
        double total = 7 * (this.school + this.sleep + this.friends + this.hobbies);
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + this.school * 7);
        System.out.println("Sleeping: " + this.sleep * 7);
        System.out.println("With Friends: " + this.friends * 7);
        System.out.println("Doing fun stuff: " + this.hobbies * 7);
        System.out.println("You're busy " + total + " hours a week!");
    }

}


//Tester
public class RoutineTester
{
    public static void main(String[] args) 
    {
        Routine myWeek = new Routine();
        
        myWeek.setSchool(8);
        myWeek.setHobbies(2);
        myWeek.setFriends(2.5);
        myWeek.setSleep(8);
        
        // Prints the totals for the WHOLE WEEK
        myWeek.printTotal();
    }
}