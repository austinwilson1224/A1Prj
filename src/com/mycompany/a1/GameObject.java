package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;


/**
 * Austin Wilson & Elianna Sanchez
 */

public abstract class GameObject {
    protected static final java.util.Random R = new java.util.Random(); //Random value used by child class
    private Point2D location = new Point2D(0.0, 0.0);
    private int color;


    //constructor
    public GameObject(){
        location = new Point2D(GameWorld.WIDTH/2F,GameWorld.HEIGHT/2F);
    }


    //methods

    //getters
    public String getLocation(){
        return location.toString();
    }



    public double getX(){
        return location.getX();
    }
    public double getY(){
        return location.getY();
    }


    public int getColor(){
        //code this later
        return this.color;
    }


    //setters
    public void setLocation(double x, double y){
        location = new Point2D(x,y);
    }
    public void setColor(int color){
        this.color = color;
    }



}
