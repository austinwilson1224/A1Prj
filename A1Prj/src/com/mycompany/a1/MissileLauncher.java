package com.mycompany.a1;

public class MissileLauncher extends MovableGameObject {
    private int missileCount;
    
    public MissileLauncher() {
    	//TODO
    }



    public int getMissileCount(){
        return missileCount;
    }

    

    public void decrementMissileCount(){
        this.missileCount--;
    }
 



    @Override
    public void move() {
        //TODO
    }
}
