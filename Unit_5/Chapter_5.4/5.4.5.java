//Comment
public class Comment
{
    private String poster;
    private String text;
    private String date;
    
    public Comment(String personPosting, String message, String textDate)
    {
        poster = personPosting;
        text = message;
        date = textDate;
    }
    
    public String getPoster() {
        return poster;
    }
    public String getText() {
        return text;
    }
    public String getDate() {   
        return date;
    }
    
    public String toString()
    {
        return text + "\n--" + poster + "(" + date + ")\n";
    }
}


//Message
public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
        // Then use the accessor methods to print out the instance variables
        Comment mom = new Comment("mom","yourmom","may");
        Comment dad = new Comment("dad","yourdad","may");

        System.out.print(mom);
        System.out.print(dad);
    }
}