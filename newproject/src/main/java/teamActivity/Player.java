package teamActivity;

public class Player {
    public String name;
    public Integer health;
    public Integer mana;
    public Integer gold;

    public Player(String name, Integer health, Integer mana, Integer gold){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.gold = gold;
    }

    public Player() {

    }

    public void Display(){
        System.out.println(name + " " + health + " " + mana + " " + gold);
    }
}
