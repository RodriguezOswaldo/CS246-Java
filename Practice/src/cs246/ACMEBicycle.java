package cs246;

public class ACMEBicycle implements Practice{
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    int newValue = 1;

    public void changeCadence(int cadence){
        cadence += newValue;
    }
    public void changeGear(int gear){
        gear += newValue;

    }
    public void speedUp(int gear){
        gear += speed;

    }
    public void applyBrakes(int speed){
        speed -= newValue;
    }

}
