package collectionsIntro;

import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {

        this.fName = fName;
        this.lName = lName;
        this.age = age;

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && fName.equals(person.fName) && lName.equals(person.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }
}

