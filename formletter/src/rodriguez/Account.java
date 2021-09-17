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
    // gets and setters for data members
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastPurchase(){
        return lastPurchase ;
    }
    public void setLastPurchase(String lastPurchase){
        this.lastPurchase = lastPurchase;
    }
    public int getDaysSincePurchase(){
        return daysSincePurchase;
    }
    public void setDaysSincePurchase(int daysSincePurchase){
        this.daysSincePurchase = daysSincePurchase;
    }


}
