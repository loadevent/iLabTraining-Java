package Chapter2;

public class WorkingWithVariables {
    public static void main(String[] args) {
        //declare
        int age;
        String strName = "Kabelo"; //initialize
        double height;
        float salary = 15000.00F; //initialize

        //assign
        age = 25;
        strName = "David";
        height = 1.85;

        //use
        System.out.println("Name: " + strName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
    }
}
