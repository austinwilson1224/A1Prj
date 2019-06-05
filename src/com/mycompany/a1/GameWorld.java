package com.mycompany.a1;


import java.util.ArrayList;


/**
 * This is the GameWorld class
 *
 * controller
 *
 *
 * Austin Wilson & Elianna Sanchez
 */

public class GameWorld {

    private ArrayList<GameObject> objects = new ArrayList<>();
    private PlayerShip playerShip;
    private NonPlayerShip nonPlayerShip;
    private boolean livePlayerShip;
    private int numberOfLives;
    private int liveScore;
    private int numMissiles;




    public void init(){
        //TODO
    }


    public void shootAsteroid(){
        //TODO
    }
    public void increaseShipSpeed(){
        //TODO
    }
    public void decreaseShipSpeed(){
        //TODO
    }
    public void turnShipRight(){
        //TODO
    }
    public void turnShipLeft(){
        //TODO
    }
    public void asteroidCollision(){
        //TODO
    }

    //a
    public void loadNewAsteroid(){
        Asteroid asteroid = new Asteroid();
        objects.add(asteroid);
        System.out.println("New asteroid has been created");
    }

    //s
    public void addPlayerShip(){
        playerShip = new PlayerShip();
        objects.add(playerShip);
        System.out.println("New player ship has been created");
    }

    //y
    public void addNonPlayerShip(){
        NonPlayerShip NPS = new NonPlayerShip();
        objects.add(NPS);
        System.out.println("New non player ship has been created");
    }


    //b
    public void addSpaceStation(){
        SpaceStation s = new SpaceStation();
        objects.add(s);
        System.out.println("New space station has been created");
    }


    //f
    public void fireMissilePS(){
        if(playerShip == null){
            System.out.print("NO SHIP IN GAME");
            return;
        }
        playerShip.fireMissiles();
        System.out.println("Missile fired!");
    }


    //L
    public void fireMissileNPS(){
        if(nonPlayerShip == null){
            System.out.print("NO NON PLAYER SHIP IN GAME");
            return;
        }
        nonPlayerShip.fireMissiles();
        System.out.println("Missile fired!");

    }


    //m
    public void printMap(){
        //TODO

        //traverse through objects and print all information out

        for(int i = 0; i < objects.size();i++){
            System.out.println(objects.get(i).toString());
        }
    }







}
