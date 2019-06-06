package com.mycompany.a1;

import java.util.ArrayList;
import java.util.Collections;

public class NonPlayerShip extends Ship {
    private MissileLauncher missileLauncher;
    private int size;
    private static final int SMALLSIZE = 15;
    private static final int LARGESIZE = 25;
    private ArrayList<Integer> sizeList = new ArrayList<>();


    public void NonPlayerShip(){
        super.setMissileCount(4);

        //I am adding the two sizes to an arrayList, shuffling it and then assigning size to the first element
        sizeList.add(SMALLSIZE);
        sizeList.add(LARGESIZE);
        Collections.shuffle(sizeList);
        this.size = sizeList.get(0);


    }


    public void fireMissiles(){
        decrementMissileCount();
    }

    @Override
    public void move() {
        //TODO
    }


    @Override
    public String toString(){
        return (" Non Player Ship: loc = " + getX() + "," + getY() +
                " color = " + getColor() +
                " speed = " + getSpeed() +
                " dir = " + getDirection() +
                " missile count = " + getMissileCount()
        );
    }
}
