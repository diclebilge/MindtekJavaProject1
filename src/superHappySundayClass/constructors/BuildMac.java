package superHappySundayClass.constructors;

public class BuildMac {

    // This class has to have 4 fields:

    /*
    cpu in String
    gpu in String
    unifiedMemory in String
    macModel in String

     */

    // Create a constructor with all of the fields and init them
    // Create one method with void return type call this method shipLaptop():
    // ths method print out "Your {MacBook Pro 14} inches with {32 GB} CPU, {10 CORE} GPU, {512 GB} unifiedMemory is ready to pick up

    public String cpu;
    public String gpu;
    public String unifiedmemory;
    public String macModel;

    public BuildMac(String cpu, String gpu, String unifiedmemory, String macModel){
        this.cpu = cpu;
        this.gpu = gpu;
        this.unifiedmemory = unifiedmemory;
        this.macModel = macModel;

    }
    public void shipMyLaptop(){
        System.out.println("You" + macModel + "with" + cpu +"GB CPU," + unifiedmemory +
                "GB Unified memory is ready to be shipped");


        }
    }



