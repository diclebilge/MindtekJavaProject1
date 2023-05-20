package abstractionIntro;

public class Radio implements RadioFunctions, ChangeVolume {
     String model;
     double price;

    @Override
    public void play() {
        System.out.println("Playing logic will be here");
    }

    @Override
    public void stop() {
        System.out.println("Stopping logic...");

    }

    @Override
    public void changeChannel() {
        System.out.println("Change the channel logic...");

    }

    @Override
    public void increaseVolume(int num) {
        System.out.println("The volume increased by " + num);
    }

    @Override
    public void decreaseVolume(int num) {
        System.out.println("The volume decreased by " + num);

    }
    public void turnOn(){
        System.out.println("Turning on");
    }
    // increase volume
    // decrease volume
    // play
    // stop
    // changeChannel

}
