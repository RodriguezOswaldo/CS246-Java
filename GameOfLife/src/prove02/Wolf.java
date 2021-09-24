package prove02;


import java.awt.*;
import java.util.Random;

// Wolf class should be a subclass of Creature
// it should implement the Movable, Aware, and Aggressor interfaces.
public class Wolf extends Creature implements Movable, Aware, Aggressor{
    Random _rand;

    public  Wolf(){
        _health = 1;
        _rand = new Random();
    }

    @Override
    public void attack(Creature target) {
        if (target != null && !(target instanceof Plant) || !(target instanceof Zombie)){
            target.takeDamage(5);
        }
    }

    @Override
    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

    }
    //Instances of the Wolf class should be represented as gray squares.
    @Override
    Shape getShape() {
        return Shape.Square;
    }

    @Override
    Color getColor() {
        return Color.darkGray;
    }

    @Override
    Boolean isAlive() {
        return _health > 0;
    }

    @Override
    public void move() {

    }
}
