package com.mycompany.a1;

public class PlayerShip extends Ship implements ISteerable{
    private SteerableMissileLauncher launcher;



    //constructor
    public PlayerShip(){
        super();
        this.setLocation(512,384);
        this.setSpeed(0);
        this.setDirection(0);
        this.setMissileCount(10);
    }


    public void increaseSpeed(){
        //TODO
    }
    public void decreaseSpeed(){
        //TODO
    }
    public void turnRight(){
        //TODO
    }
    public void turnLeft(){
        //TODO
    }
    public void reloadMissiles(){
        //TODO
    }







    @Override
    public void move() {

    }

    public void fireMissiles() {
        decrementMissileCount();
    }
    @Override
    public String toString(){
        return ("Player Ship: loc = " + getX() + "," + getY() +
                " color = " + getColor() +
                " speed = " + getSpeed() +
                " dir = " + getDirection() +
                " missile count = " + getMissileCount()
        );
    }
}
