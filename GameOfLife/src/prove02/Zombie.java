package prove02;

import java.awt.*;
import java.util.Random;

// The Zombie class should be a subclass of Creature and should implement the Movable and Aggressor interfaces.
public class Zombie extends Creature implements Movable, Aggressor{
    Random _rand;
    int animalEaten;

    public Zombie(){
        _health = 1;
        _rand = new Random();
        animalEaten = 1;
    }
// Instances of the Zombie class should attack any creature they land on, as long as it isn't an instance of the Plant class.
// They should inflict 10 points of damage when they attack.
    @Override
    public void attack(Creature target) {
        if (target != null && !(target instanceof Plant)){
            target.takeDamage(10);
            animalEaten++;
            System.out.println("Animal eaten by Zombie #" + animalEaten);
        }
    }

    @Override
    Shape getShape() {
        return Shape.Square;
    }
    //Instances of the Zombie class should be represented as blue squares.
    @Override
    Color getColor() {
        return Color.BLUE;
    }

    @Override
    Boolean isAlive(){ return _health > 0; }

    // My zombies move right to left and up to down.
    @Override
    public void move(){
        switch (_rand.nextInt(2)){
            case 0:
                _location.x++;
            case 1:
                _location.y++;
            default:
                break;
        }
    }
}
