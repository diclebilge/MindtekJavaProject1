package referenceVars;

public class Student {

    String fname;

    String lname;

    int age;

    String gender;

    public void displayInfo() {
        System.out.println("Student name: " + fname + " " + lname);
        System.out.println("Student gender: " + age);
        System.out.println("Student gender: " + gender);
    }
    public void disPlayAge() {
        System.out.println("Student " + fname +" is " + age + " years old.");
    }
}

