public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog(String name, String breed, boolean hasShots){
        this.name = name;
        this.breed = breed;
        this.hasShots = hasShots;
    }
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}


//Tester
public class DogTester
{
    public static void main(String[] args)
    {
        // Start here!
        Dog karel = new Dog("karel", "Retriever", true);
        Dog mom = new Dog("Yourmom", "mom");

        System.out.println(karel);
        System.out.println(mom);
    }
}