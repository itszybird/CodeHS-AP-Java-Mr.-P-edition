public class IntegerOverflow
{
    public static void main(String[] args)
    {
        // Start here!
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);
        min--;
        max++;
        System.out.println(min);
        System.out.println(max);
        
    }
}