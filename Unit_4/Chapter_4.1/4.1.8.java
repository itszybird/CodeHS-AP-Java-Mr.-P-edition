public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        while (num > 0) {
            int sum = num % 10;
            System.out.println(sum);
            num = num / 10;
        } 
    }
}