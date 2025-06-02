public class RosterOrganizer
{
    private String student;
    
    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }
    
    // Returns the word
    public String getStudent()
    {
        return student;
    }
    
    // Returns true if student comes
    // before otherStudent.
    // Returns false otherwise.
    public boolean placeBefore(String otherStudent)
    {
        return otherStudent.compareTo(student) > 0;
        
    }
    
    
    // Returns true if student comes
    // after otherStudent.
    // Returns false otherwise.
    public boolean placeAfter(String otherStudent)
    {
        return student.compareTo(otherStudent) > 0;
        
    }
    
    
    // Returns true if student is equal to otherStudent.
    // Returns false otherwise.
    public boolean isEqual(String otherStudent)
    {
        return student.equals(otherStudent);
    }
}


//Tester
import java.util.Scanner;

public class RosterTester
{
    public static void main(String[] args)
    {
        RosterOrganizer currentStudent = new RosterOrganizer("Jose");
        
        String name = "Silu";
        
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));
        
        
        // Notice that the capitalization matters
        name = "adrian";
        System.out.println("\n\n");
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));
        
        
        
        System.out.println("\n\n");
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));

    }
}