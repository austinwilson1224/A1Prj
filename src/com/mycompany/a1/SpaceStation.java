package com.mycompany.a1;


/**
 * Austin Wilson & Elianna Sanchez
 */
public class SpaceStation extends FixedGameObject {
    //fields
    private int blinkRate;
    private boolean blinkerOn;
    private final int MINBLINKRATE = 0;
    private final int MAXBLINKRATE = 6;

    //constructor
    public SpaceStation(){
        this.blinkRate = GameObject.R.nextInt(MAXBLINKRATE - MINBLINKRATE );
    }

    //methods
    public int getBlinkRate(){
        return this.blinkRate;
    }
    public boolean isOn(){
        return blinkerOn;
    }

    @Override
    public String toString(){
        if(blinkerOn) {


            return (" Non Player Ship: loc = " + getX() + "," + getY() +
                    " color = " + getColor() +
                    " blink rate = " + blinkRate
            );
        }
        return (" Non Player Ship: loc = " + getX() + "," + getY() +
                " color = " + getColor()
        );
    }
}
