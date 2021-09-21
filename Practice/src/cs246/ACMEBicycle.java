package cs246;

public abstract class ACMEBicycle implements Practice{
    private static int cadence = 0;
    private static int speed = 0;
    private static int gear = 1;
    private static int newValue = 0;


    public void changeCadence(int newValue){
        cadence = newValue;
    }
    public void changeGear(int newValue){
        gear = newValue;

    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public static void printStates(){
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
    public static void main(String[] args) {
        ACMEBicycle.printStates();

    }
}

