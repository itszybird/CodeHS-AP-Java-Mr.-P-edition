//Chef
public class Chef
{
    private String name;
    private String restaurant;
    private Meal best;

    public Chef(String name, String restaurant, Meal best){
        this.name = name;
        this.restaurant = restaurant;
        this.best = best;
    }

    public String getName(){
        return name;
    }
    
    public String getRestaurant(){
        return restaurant;
    }

    public String getMealName(){
        return best.getName();
    }

    public int getMealServings(){
        return best.getNumberOfServings();
    }

    public String getMealCourse(){
        return best.getCourse();
    }

    public String toString(){
        return "Chef " + name + " works at " + restaurant + " and is best known for " + best;
    }
}


//Meal
public class Meal
{
    private String name;
    private String course;
    private int servings;

    public Meal(String name, String course, int servings){
        this.name = name;
        this.course = course;
        this.servings = servings;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    public int getNumberOfServings(){
        return servings;
    }

    public String toString(){
        return name + " (" + course + ") ";
    }
}


//Tester
public class ChefTester
{
    public static void main(String[] args)
    {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);
        
        System.out.println(alex);
        System.out.println(alex.getMealName());
        
        // Create your own Meal and Chef here:
    }
}