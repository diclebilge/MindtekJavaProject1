package encapsulationProject;

public class Student {
    private int age;
    protected int id;
    int height; //default
    public int amountOfExperience;

    private void privateMethod(){}
    protected void protectedMethod(){}
    void defaultMethod(){
        privateMethod();
        int number = age;
    }

}
