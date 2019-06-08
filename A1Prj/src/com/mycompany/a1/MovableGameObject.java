package com.mycompany.a1;


/**
 * Movable Game Object
 *
 *
 *
 * Austin Wilson & Elianna Sanchez
 */
public abstract class MovableGameObject extends GameObject implements Imovable {
    private double speed;
    private int direction;
    private final int MIN_SPEED = 0;
    private final int MAX_SPEED = 20;
    private final int MIN_DIRECTION = 0;
    private final int MAX_DIRECTION = 359;


    public MovableGameObject(){
        this.speed = R.nextInt(MAX_SPEED - MIN_SPEED + 1) + MIN_SPEED;
        this.direction = R.nextInt(MAX_DIRECTION - MIN_DIRECTION + 1) + MIN_DIRECTION;
    }


    public double getSpeed(){
        return this.speed;
    }
    public int getDirection(){
        return this.direction;
    }


    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void setDirection(int direction){
        this.direction = direction;
    }

    @Override
    public String toString() {
    	return super.toString() + 
    			" Speed = " + speed + 
    			" dir = " + direction;
    }


}
