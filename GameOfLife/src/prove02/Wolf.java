package prove02;


import java.awt.*;
import java.util.Random;

// Wolf class should be a subclass of Creature
// it should implement the Movable, Aware, and Aggressor interfaces.
public class Wolf extends Creature implements Movable, Aware, Aggressor, Spawner{
    Random _rand;
    private  WolfDirection wolfDirection;

    //it is first created, it's preferred direction should be random.
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
    //senseNeighbors() function is called, the Wolf instance should change its preferred direction
    // to be in the direction of the first Animal instance it sees.
    @Override
    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        //it should first check in the direction it's already moving.
        //it should search in a clockwise pattern starting at the top
        if(wolfDirection == WolfDirection.Up){
            if (above instanceof Animal){
                wolfDirection = WolfDirection.Up;
            } else if(right instanceof Animal){
                wolfDirection = WolfDirection.Right;
            }
            else if(below instanceof  Animal) {
                wolfDirection = WolfDirection.Down;
            }
            else if( left instanceof  Animal){
                wolfDirection = WolfDirection.Left;
            }
        }
        else if(wolfDirection == WolfDirection.Right){
            if(right instanceof Animal){
                wolfDirection = WolfDirection.Right;
            }
            else if(below instanceof  Animal) {
                wolfDirection = WolfDirection.Down;
            }
            else if( left instanceof  Animal){
                wolfDirection = WolfDirection.Left;
            }
            else if (above instanceof Animal){
                wolfDirection = WolfDirection.Up;
            }
        }
        else if (wolfDirection == WolfDirection.Down){
            if(below instanceof  Animal) {
                wolfDirection = WolfDirection.Down;
            }
            else if( left instanceof  Animal){
                wolfDirection = WolfDirection.Left;
            }
            else if (above instanceof Animal){
                wolfDirection = WolfDirection.Up;
            }
            else if(right instanceof Animal){
                wolfDirection = WolfDirection.Right;
            }
        }
        else if(wolfDirection == WolfDirection.Left){
            if(left instanceof  Animal){
                wolfDirection = WolfDirection.Left;
            }
            else if(above instanceof Animal){
                wolfDirection = WolfDirection.Up;
            }
            else if(right instanceof Animal){
                wolfDirection = WolfDirection.Right;
            }
            else if(below instanceof Animal){
                wolfDirection = WolfDirection.Down;
            }
        }
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
    //When the move() function is called on a Wolf instance, it should move in its preferred direction.
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

    @Override
    public Creature SpawnNewCreature() {
        return null;
    }
}
