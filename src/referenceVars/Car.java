package referenceVars;

public class Car {

    // state
    int year;
    String company;
    // constructor

    public Car(){}
    // ass cons accepting 2 params:
    // int year, String company
    public Car (int year, String company){
        this.year = year;
        this.company = company;
    }

    // add cons accepting only 1 param
    // int year

    public Car (int year){
        this.year = year;
    }

}
