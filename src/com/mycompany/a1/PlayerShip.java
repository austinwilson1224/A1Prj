package com.mycompany.a1;

public class PlayerShip extends Ship implements ISteerable{
    private SteerableMissileLauncher launcher;



    //constructor
    public PlayerShip(){
        this.setLocation(512,384);
        super.setMissileCount(10);
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
}
