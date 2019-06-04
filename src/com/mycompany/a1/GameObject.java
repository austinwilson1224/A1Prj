package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;

/**
 * Austin Wilson & Elianna Sanchez
 */

public abstract class GameObject {
    private Point2D location;
    private int color;


    //methods

    //getters
    public String getLocation(){
        return location.toString();
    }

    public double getLocationX(){
        return location.getX();
    }
    public double getLocationY(){
        return location.getY();
    }
    public int getColor(){
        //code this later
        return this.color;
    }


    //setters
    public void setLocation(double x, double y){
        location.setX(x);
        location.setY(y);
    }
    public void setColor(int color){
        this.color = color;
    }



}
