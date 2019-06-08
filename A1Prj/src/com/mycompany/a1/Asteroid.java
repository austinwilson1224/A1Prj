package com.mycompany.a1;

public class Asteroid extends MovableGameObject {
    private int size;
    private final int SIZE_MIN = 6;
    private final int SIZE_MAX = 30;
    private final int MAX_SPEED = 15;


    public Asteroid(){

        //size  = random value between 6 and 30
        super();
        this.size = GameObject.R.nextInt(SIZE_MAX - SIZE_MIN + 1) + SIZE_MIN;
        super.setLocation(R.nextDouble() * GameWorld.WIDTH ,R.nextDouble() * GameWorld.HEIGHT);
        super.setColor(0,0,0);
    }
    @Override
    public void move() {
        //TODO
    }

    public int getSize() {
        return this.size;
    }


    @Override
    public String toString(){
        return ("Asteroid: " +
                super.toString() +
                " size = " + size
        );
    }
}
