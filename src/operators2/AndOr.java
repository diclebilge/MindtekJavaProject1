package operators2;

public class AndOr {
    public static void main(String[] args) {
        //and  -> &&
        //or ->||

        boolean isGreen = true;
        boolean noOneIsCrossing = true;

        boolean canContinueDriving = isGreen && noOneIsCrossing ;

        System.out.println(canContinueDriving);

        //And operations:
        // T && T => T
        // F && T => F
        // F && F => F
        // T && F => F
        System.out.println("-------------");
        boolean noTrafficLights =  false;
        boolean canDrive = isGreen || noTrafficLights;
        System.out.println(canDrive);
        // Or operations:
        // T || T => T
        // T || F => T
        // F || T => T
        // F || F => F










    }
}
