package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;
/**
 * Austin Wilson & Elianna Sanchez
 */
public class Missile extends MovableGameObject {
    private int fuelLevel;


    public Missile(int missileSpeed, int missileDirection, Point2D missileLocation){
        super.setSpeed(missileSpeed);
        super.setDirection(missileDirection);
        super.setLocation(missileLocation.getX(),missileLocation.getY());
        fuelLevel = 15;
    }


    public void decrementFuelLevel(){
        fuelLevel--;
    }

    @Override
    public void move() {
        //TODO
    }
}
