package com.mycompany.a1;

public class SteerableMissileLauncher extends MissileLauncher implements ISteerable{

	private int launcherDirection;
	
	public SteerableMissileLauncher() {
		launcherDirection = super.getDirection();
	}
    public void turnLeft() {
        //TODO
    }

    public void turnRight() {
        //TODO
    }
   
    
    
    //getters
    public int getLauncherDirection() {
    	return this.launcherDirection;
    }


}
