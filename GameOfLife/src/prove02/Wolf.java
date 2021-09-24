package prove02;


import java.awt.*;
import java.util.Random;

// Wolf class should be a subclass of Creature
// it should implement the Movable, Aware, and Aggressor interfaces.
public class Wolf extends Creature implements Movable, Aware, Aggressor{
    Random _rand;
    private  WolfDirection wolfDirection;

    public  Wolf(){
        _health = 1;
        _rand = new Random();
        int randDirection = _rand.nextInt(4);
        if (randDirection == 0){
            wolfDirection = WolfDirection.Up;
        }
        else if( randDirection == 1){
            wolfDirection = WolfDirection.Down;
        }
        else if(randDirection == 2){
            wolfDirection = WolfDirection.Left;
        }
        else{
            wolfDirection = WolfDirection.Right;
        }
    }

    @Override
    public void attack(Creature target) {
        if (target instanceof Animal){
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
        if (wolfDirection == WolfDirection.Up){
            _location.y--;
        }
        else if(wolfDirection == WolfDirection.Right){
            _location.x++;
        }
        else if(wolfDirection == WolfDirection.Down) {
            _location.y++;
        }
        else if(wolfDirection == WolfDirection.Left){
            _location.x--;
        }
    }
}
