package com.mycompany.a1;


/**
 * Movable Game Object homies!
 *
 * Austin Wilson & Elianna Sanchez ie BAUStin and GirlScout
 */
public abstract class MovableGameObject extends GameObject implements Imovable {
    private int speed;
    private int direction;
    private final int MINSPEED = 0;
    private final int MAXSPEED = 20;
    private final int MINDIRECTION = 0;
    private final int MAXDIRECTION = 359;


    public MovableGameObject(){
        this.speed = R.nextInt(MAXSPEED - MINSPEED + 1) + MINSPEED;
        this.direction = R.nextInt(MAXDIRECTION - MINDIRECTION + 1) + MINDIRECTION;
    }


    public int getSpeed(){
        return this.speed;
    }
    public int getDirection(){
        return this.direction;
    }


    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setDirection(int direction){
        this.direction = direction;
    }


    //move

}
