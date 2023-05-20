package sundayOOP;

import java.rmi.server.RMIClassLoaderSpi;

public class MainTestClass {
    String num1;

    public static void main(String[] args) {

        Employees alexAdams = new Employees();
        alexAdams.setFullName("Alex Adams");
        alexAdams.setAge(43);
        alexAdams.setPosition("SDET");
        alexAdams.setPhoneNumber(MyRandomUtil.getPhoneNumber());

        System.out.println(alexAdams.getPhoneNumber());


        Employees patelHarsh = new Employees();
        patelHarsh.setFullName("Patel Harsh");
        patelHarsh.setAge(32);
        patelHarsh.setPosition("QA Analyst");
        patelHarsh.setPhoneNumber(MyRandomUtil.getPhoneNumber());

        System.out.println(patelHarsh.getPhoneNumber());


        Employees johnDoe = new Employees();
        johnDoe.setFullName("John Doe");
        johnDoe.setAge(28);
        johnDoe.setPosition("Java Developer");
        johnDoe.setPhoneNumber(MyRandomUtil.getPhoneNumber());

        System.out.println(johnDoe.getPhoneNumber());
    }
}
