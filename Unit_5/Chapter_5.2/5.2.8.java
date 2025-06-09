//Club
public class SchoolClub
{

    private Student leader;
    private String name;
    private int numMembers;

    /* Add your constructor here
     * Constructor should take a leader and club name, then set
     * numMembers to 0.
     */
    public SchoolClub(Student leader, String name){
        this.leader = leader;
        this.numMembers = 0;
        this.name = name;
    }

    public void addMember() {
        numMembers ++;
    }

    public String toString(){
        return leader.getFirstName() + " is the leader of the " + name + " club.";
    }
}


//Main
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Copy over your constructors from the previous exercise. 
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
    public Student(String firstName, String lastName, int gradeLevel, String school){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    public Student(String firstName, String lastName, int gradeLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        
        if (gradeLevel >= 9 && gradeLevel <=12) this.school = "high school";
        else if (gradeLevel >= 6 && gradeLevel <=8) this.school = "middle school";
        else this.school = "elementary school";
    }
   
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school ;
    }
}


//Tester
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        
        
        System.out.println(alan);
        System.out.println(ada);

        SchoolClub yourmom = new SchoolClub(alan, "YOURMOM");
        System.out.println(yourmom.toString());
    }
}