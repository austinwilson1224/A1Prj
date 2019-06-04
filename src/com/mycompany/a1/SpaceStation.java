package com.mycompany.a1;


/**
 * Austin Wilson & Elianna Sanchez
 */
public class SpaceStation extends FixedGameObject {
    //fields
    private int blinkRate;
    private boolean blinkerOn;

    //methods
    public int getBlinkRate(){
        return this.blinkRate;
    }
    public boolean isOn(){
        return blinkerOn;
    }
}
