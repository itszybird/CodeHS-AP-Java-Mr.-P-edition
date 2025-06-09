public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor        
        public Food(String foodName, int cal){
            this.name = foodName;
            this.calories = cal;
        }
        
        
        //Add getter and setter methods for calories        
        public int getCalories(){
            return this.calories;
        }
        
        public void setCalories(int val){
            this.calories = val;
        }
        
        //Add getter and setter methods for name        
        public String getName(){
            return this.name;
        }
        
        public void setName(String val){
            this.name = val;
        }
        
        //Add toString method        
        public String toString(){
            return this.name + " have " + this.calories + " calories.";
        }
    
}


//Runner
import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Food mom = new Food("mom", 600);
        Food dad = new Food("mom", 350);
        Food kyle = new Food("kyle", 200);
        
        System.out.println("moms have 600 calories.\nHow many would you like?");
        int numHam = input.nextInt();
        
        System.out.println("French dad have 350 calories.\nHow many would you like?");
        int numdad = input.nextInt();
        
        System.out.println("kyle have 200 calories.\nHow many would you like?");
        int numkyle = input.nextInt();
        
        int totalCalories = (mom.getCalories() * numHam) + (dad.getCalories() * numdad) + (kyle.getCalories() * numkyle);
        
        System.out.println("Your meal with have a total of " + totalCalories + " calories");
    }
}