package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Asteroid extends MovableGameObject {
    private int size;
    private final int SIZEMIN = 6;
    private final int SIZEMAX = 30;


    public Asteroid(){

        //size  = random value between 6 and 30
        this.size = GameObject.R.nextInt(SIZEMAX - SIZEMIN + 1) + SIZEMIN;
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
