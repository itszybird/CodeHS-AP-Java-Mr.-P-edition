public class Salutations
{
    private String name;
    
    public Salutations(String user){
        name = user;
    }
    
    public void addressLetter(){
        System.out.print("Dear " +name);
    }
    public void signLetter(){
        System.out.println("Sincerely,");
        System.out.println(name);
    }
    public void addressMemo(){
        System.out.println("To whom it may concern");
    }
    public void signMemo(){
        System.out.println("Best,");
        System.out.println(name);
    }
    
    public String toString(){
        return name;
    }
}


//Tester
public class SalutationsTester
{
    public static void main(String[] args)
    {
        
    }
}