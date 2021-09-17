package rodriguez;

public class Account {
    private String name;
    private String lastPurchase;
    private int daysSincePurchase;

    public Account(String name, String lastPurchase, int daysSincePurchase){
        this.name = name;
        this.lastPurchase = lastPurchase;
        this.daysSincePurchase = daysSincePurchase;
    }
}
