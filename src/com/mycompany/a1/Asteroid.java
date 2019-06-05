package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Asteroid extends MovableGameObject {
    private int size;
    private final int SIZE_MIN = 6;
    private final int SIZE_MAX = 30;
    private final int MIN = 0;
    private final int MAX_SPEED = 15;


    public Asteroid(){

        //size  = random value between 6 and 30
        this.size = GameObject.R.nextInt(SIZE_MAX - SIZE_MIN + 1) + SIZE_MIN;
        super.setColor(ColorUtil.BLACK);
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
        return ("Asteroid: loc = " + getX() + "," + getY() +
                " color = " + getColor() +
                " speed = " + getSpeed() +
                " dir = " + getDirection() +
                " size = " + getSize()
        );
    }
}
