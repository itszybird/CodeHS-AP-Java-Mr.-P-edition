public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    
    public Website()
    {
        domain = "example";
        topLevelDomain = "com";
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain, int numPeople)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}


//Tester
public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website Web1 = new Website();
        System.out.println(Web1);
        Website Web2 = new Website("your", "dad");
        System.out.println(Web2);
        Website Web3 = new Website("your", "mom", 10000);
        System.out.println(Web3);
    }
}