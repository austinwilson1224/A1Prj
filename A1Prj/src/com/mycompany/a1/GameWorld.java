package com.mycompany.a1;


import com.codename1.ui.geom.Point2D;
import java.util.ArrayList;



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


    /**
     *
     * the time that the program has been running is equal to
     * the current time minus the time that the program was created
     */


    //long PROGRAM_CREATION = System.nanoTime();








    private int numberOfLives;
    private int playerScore;
    private int numMissiles;
    private int timeElapsed;



    private final static int MAX_MISSILES = 10;




    public void init(){
        numberOfLives = 3;
        playerScore = 0;
        numMissiles = MAX_MISSILES;
    }


    public void increasePSSpeed(){
        //TODO
    }
    public void decreasePSSpeed(){
        //TODO
    }
    public void turnPSRight(){
        //TODO
    }
    public void turnPSLeft(){
        //TODO
    }


    //a
    public void loadNewAsteroid(){
        Asteroid asteroid = new Asteroid();
        objects.add(asteroid);
        System.out.println("New ASTEROID has been created");
        System.out.println(asteroid);
    }

    //s
    public void addPlayerShip(){
        playerShip = new PlayerShip();
        objects.add(playerShip);
        System.out.println("New PLAYER SHIP has been created");
        System.out.println(playerShip);
    }

    //y
    public void addNonPlayerShip(){
        nonPlayerShip = new NonPlayerShip();
        objects.add(nonPlayerShip);
        System.out.println("New NON PLAYER SHIP has been created");
        System.out.println(nonPlayerShip);
    }


    //b
    public void addSpaceStation(){
        SpaceStation spaceStation = new SpaceStation();
        objects.add(spaceStation);
        System.out.println("New BLINKING SPACE STATION has been created");
        System.out.println(spaceStation);
    }


    //f
    public void fireMissilePS(){


        //precondition is to check that the playerShip is in GameWorld
        if(playerShip == null){
            System.out.print("NO SHIP IN GAME");
            return;
        }
        
        //this will only return true if the ship has missiles available to fire
        if (playerShip.fireMissiles()){

            /**
             * compute missile location, speed, and heading
             */
            Point2D missileLocation = playerShip.getLocation();
            //ship speed plus constant value is 5
            double missileSpeed = playerShip.getSpeed() + 5.0;
            int missileHeading = playerShip.getLauncher().getDirection();
            Missile missile = new Missile(missileSpeed,missileHeading,missileLocation);
            objects.add(missile);
            System.out.println("New missile added to the world");
            System.out.println(missile);
        }
    }


    //L
    
    
    /**
     * first check to see that there is a NPS in the game
     * if so then we will fire the missiles, since that method already checks to see that the ship has missiles available to fire
     * then create a new missile to add to the game world 
     */
    public void fireMissileNPS(){
        if(nonPlayerShip == null){
            System.out.print("NO NON PLAYER SHIP IN GAME");
            return;
        }
        //will only return true if the player ship has missiles available to fire 
        if(nonPlayerShip.fireMissiles()) {
        	//System.out.println("Missile fired!");
        	Point2D missileLocation = nonPlayerShip.getLocation();
        	//ship speed plus constant value is 5
        	double missileSpeed = nonPlayerShip.getSpeed() + 5;
        	int missileHeading = nonPlayerShip.getDirection();
        	Missile missile = new Missile(missileSpeed,missileHeading,missileLocation);
        	objects.add(missile);
        	System.out.println("New missile added to the world");
        	System.out.println(missile);
        }



    }


    //m
    public void printMap(){
    	System.out.println("\nWorld Map");
        for(int i = 0;i < objects.size();i++){
            System.out.println(objects.get(i).toString());
        }
    }

    public void print(){
        System.out.println("Player Score: " + playerScore);
        if(playerShip != null){
            System.out.println("Number of missiles: " + playerShip.getMissileCount());
        }else System.out.println("Number of missiles: No ships..");
        //long timeElapsed = System.nanoTime() - PROGRAM_CREATION;
        //System.out.println("Current time elapsed: " + timeElapsed);
        System.out.println("Number of lives: " + numberOfLives);
    }


    
    /**
     * from the case where user input is g
     * this will cause the location to be reset to the center of the map
     * which is located at (512,384)
     */
	public void jump() {
		if(playerShip != null) {
			playerShip.setLocation(512, 384);
		}
		else System.out.println("No player ship in game");
		
	}


	
	/**
	 * user input is >
	 * this method causes the player ships missile launcher to revolve around the center
	 * in a clockwise direction 
	 * 
	 * each time the player hits the > button the ship will change direction by one degree
	 * so I will just update playerShip direction to be increment by one
	 * 
	 */
	public void revolvePSML() {
		//first check that the player ship exists in game 
		if(playerShip != null) {
			playerShip.setDirection(playerShip.getDirection() + 1);
		}
		else System.out.println("No player ship in the game");
		
	}


	public void reloadPS() {
		if(playerShip != null) {
			playerShip.setMissileCount(MAX_MISSILES);
		}
		else System.out.println("NO player ship in game");
		
	}


	
	/**
	 * this method comes from case 'k' in game
	 * this is when an asteroid and a missile collide, the asteroid and the missile would be destroyed
	 * 
	 * first check that 
	 * 
	 * 
	 *  The program is not required to have any code that actually checks for collisions between objects; 
	 *  that’s something we’ll be adding later. 
	 *  For now, the program simply relies on the user to say when such events have occurred, 
	 *  using for example the ‘k’ and ‘c’ commands.
	 * 
	 * 
	
	 */
	public void killAsteroid() {
		Missile missile = null;
		Asteroid asteroid = null;
		
		for(GameObject i : objects) {
			if(i instanceof Missile) {
				missile = (Missile)i;
			}
		}
		for(GameObject i : objects) {
			if (i instanceof Asteroid) {
				asteroid = (Asteroid)i;
			}
		}
		//make sure the for loop instanciated missile and asteroid 
		//then check that they have the same location --- unnecessary 
		if( (missile != null && asteroid != null)) {
			objects.remove(asteroid);
			objects.remove(missile);
		}
	}

	
	/**
	 * this is the method that will kill and NPS
	 * if a missile is fired from a player ship 
	 * and it hit a NPS in game world then both instances of
	 * missile and NPS will be removed from objects
	 * 
	 * not sure if its necessary to search through the list of objects in the world f
	 * for both objects 
	 * shold just search for the correct NPS and then eliminate both objects
	 */

	public void eliminateNPS() {
		
		//declaring these here so we have access
		NonPlayerShip NPS = null;
		Missile missile = null;
		//find the NPS in question and assign it to NPS
		for(GameObject i : objects) {
			if(i instanceof NonPlayerShip) {
				NPS = (NonPlayerShip) i;
			}
		}
		//find the missile in question and assign it to missile
		for(GameObject i : objects) {
			if(i instanceof Missile) {
				missile = (Missile) i;
			}
		}
		
		if(missile != null && NPS != null) {
			objects.remove(missile);
			objects.remove(NPS);
		}
		
	}
	
	
	
	/**
	 * this method will be synonymous with eliminateNPS
	 * instead of NPS we will have a PlayerShip (PS)
	 * 
	 * 
	 */
	public void eliminatePS() {
		//declaring these here so we have access
		PlayerShip PS = null;
		Missile missile = null;
		//find the NPS in question and assign it to NPS
		for(GameObject i : objects) {
			if(i instanceof PlayerShip) {
				PS = (PlayerShip) i;
			}
		}
		//find the missile in question and assign it to missile
		for(GameObject i : objects) {
			if(i instanceof Missile) {
				missile = (Missile) i;
			}
		}
				
		if(missile != null && PS != null) {
			objects.remove(missile);
			objects.remove(PS);
		}
	}
	
	public void crashAsteroid() {
		//TODO
	}
	
	public void crashNPS() {
		//TODO
	}
	public void asteroidCrash() {
		//TODO
	}
	public void asteroidCrashNPS() {
		//TODO
	}
	public void tick() {
		//TODO
	}

}
