package cs246;

public class Cruise implements Expense {
    Destination _dest;

    public Cruise(Destination dest){
        _dest = dest;
    }

    @Override
    public float getCost() {
        switch (_dest){
            case Mexico:
                return 1000.00f;
            case  Europe:
                return 2000.00f;
            case Japan:
                return 3000.00f;
            default:
                return 0.00f;
        }

    }
    // constructor

}



