package com.mycompany.a1;


import java.util.ArrayList;
import java.util.Iterator;


/**
 * This is the GameWorld class
 *
 *
 *
 * Austin Wilson & Elianna Sanchez
 */

public class GameWorld {

    public final static double HEIGHT = 1024.0;
    public final static double WIDTH = 768.0;
    private ArrayList<GameObject> objects = new ArrayList<>();


    private static PlayerShip playerShip;

    private static NonPlayerShip nonPlayerShip;


    //private boolean livePlayerShip;


    private int numberOfLives;
    private int playerScore;
    private int numMissiles;


    private final static int MAX_MISSILES = 10;




    public void init(){
        numberOfLives = 3;
        playerScore = 0;
        numMissiles = MAX_MISSILES;
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
        nonPlayerShip = new NonPlayerShip();
        objects.add(nonPlayerShip);
        System.out.println("New non-player ship has been created");
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
        if(playerShip.getMissileCount()>0){
            playerShip.fireMissiles();
            System.out.println("Missile fired!");
        }
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
        Iterator<GameObject> iterator = this.objects.iterator();

/**
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/






        for(int i = 0;i < objects.size();i++){
            System.out.println(objects.get(i).toString());
        }





        //System.out.println(objects.size());
        //traverse through objects and print all information out



    }







}
