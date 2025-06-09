public class Calculator {

    private int total;
    private int value; // Value is the number stored in memory

    public Calculator(int startingValue){
        this.total = startingValue;
        this.value = 0;
    }

    public int add(int newval){
        this.total = this.total + newval;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        this.total += this.value;
        return total;
    }

    public int multiple(int newval){
        this.total *= newval;
        return total;
    }

    public void setValue(int newVal){
        this.value = newVal;
    }

    public int getValue(){
        return value;
    }
}


//Tester
public class CalculatorTester
{
    public static void main(String[] args) {

        System.out.println("Starting at 5");
        Calculator mymom = new Calculator(5);

        System.out.println("Adding 10 ...");
        System.out.print("Should print 15: ");
        System.out.println(mymom.add(10));

        System.out.println("Multiplying by 2 ...");
        System.out.print("Should print 30: ");
        System.out.println(mymom.multiple(2));

        System.out.println("Changing value to 20 ...");
        mymom.setValue(20);
        System.out.print("Adding. Should print 50: ");
        System.out.println(mymom.add());

    }
}