package sundayOOP;

public abstract class MyRequirements {

    public abstract void canadianStyle();
    public abstract void tenRooms();
    public abstract void kitchen();
    public abstract void sleepRoom();
    public abstract void style();
    public abstract int costOfTheProject();
    public abstract String estimateEndDate();

    public void commentAndNotes(){
        System.out.println("Hey, please use my requirements to building.");
    }
}
