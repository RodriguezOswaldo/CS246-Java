package cs246;

public class Lodging  implements Expense{
    Destination _dest;
    int _totalNights;

    public Lodging(Destination dest, int nights){
        _dest = dest;
        _totalNights = nights;
    }

    @Override
    public float getCost() {
        switch (_dest){
            case Mexico:
                return 100.00f * _totalNights;
            case Japan:
                return 300.00f * _totalNights;
            case Europe:
                return 200.00f * _totalNights;
            default:
                return 0.00f;
        }
    }
}
