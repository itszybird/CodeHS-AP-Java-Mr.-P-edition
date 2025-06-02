public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        // Generate a random number of seconds
        int hot = (int)(Math.random() * (150 + 1) + 90);
        // Print the number of seconds
       System.out.println("Microwaving for " + hot + " seconds");
        // Use two if statements to print the temperature
        if (hot <= 120){
            System.out.println("Rolls will be the right temperature!");
        }
        if (hot > 120){
            System.out.println("Rolls will be boiling hot!");
        }
    }
}