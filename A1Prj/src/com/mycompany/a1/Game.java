package com.mycompany.a1;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

/**
 * This is the Game class which is the primary class that encapsulates the whole game
 *
 *
 *
 * Austin Wilson & Elianna Sanchez
 */

public class Game extends Form {

    //fields
    private GameWorld gw;




    //methods
    //constructor
    public Game(){
        gw = new GameWorld();
        gw.init();
        play();
    }
    public void play(){
        //code later
        Label myLabel = new Label("Enter a command:");
        this.addComponent(myLabel);
        final TextField myTextField = new TextField();
        this.addComponent(myTextField);
        this.show();
        myTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String sCommand =  myTextField.getText();
                myTextField.clear();
                switch (sCommand.charAt(0)){





                    //make a new asteroid...
                    case 'a':
                        gw.loadNewAsteroid();
                        break;

                    //add a non player ship to the GameWorld
                    case 'y':
                        gw.addNonPlayerShip();
                        break;
                        
                    //add a space station to the world
                    case 'b':
                        gw.addSpaceStation();
                        break;
                        
                        
                    //add a player ship to the world
                    case 's':
                        gw.addPlayerShip();
                        break;
                        
                    //increase the speed of the PS by a small amount
                    case 'i':
                    	gw.increasePSSpeed();
                    	break;
                    	
                    //decrease the speed of PS by a small amount
                    case 'd':
                    	gw.decreasePSSpeed();
                    	break;
                    	
                    //turn PS left by a small amount (ell)
                    case 'l': 
                    	gw.turnPSLeft();
                    	break;
                    	
                    //turn PS right by a small amount 
                    case 'r':
                    	gw.turnPSRight();
                    	break;
                    //fire a missile out of PS
                    case 'f':
                        gw.fireMissilePS();
                        break;


                    //fire a missile out of NPS
                    case 'L':
                        gw.fireMissileNPS();
                        break;


                    //print a map showing the current world state
                    case 'm':
                        gw.printMap();
                        break;
                        
                    //print the score, missiles in the ship, current time elapsed and number of lives left 
                    case 'p':
                        gw.print();
                        break;




                        //third delivery
                        //June 7th
                        
                    /**
                     * control the direction of the PS's missile launcher
                     * by revolving it around the center of the PS in a clockwise direction
                     * 
                     * PSML stands for Player Ship Missile Launcher
                     * 
                     * finished
                     */
                    case '>':
                    	gw.revolvePSML();
                    	break;
                    	
                    	
                    	
                    /**
                     * load a new supply of missiles into the PS
                     * increased the missile count to maximum 
                     * 
                     * finished 
                     */
                    
                    case 'n':
                    	gw.reloadPS();
                    	break;
                    	
                    	
                    /**
                     * a PS's missile struck and killed an asteroid 
                     * 
                     * finished 
                     */
                    case 'k':
                    	gw.killAsteroid();
                    	break;
                    	
                    /**
                     * PS's missile has struck and eliminated an NPS 
                     * 
                     * finished 
                     */
                    case 'e':
                        gw.eliminateNPS();
                        break;
                        
                    /**
                     * NPS's missile has struck and exploded a PS
                     * 
                     * 
                     * 
                     */
                    case 'E':
                    	gw.eliminatePS();
                    	break;
                    	
                    //PS crashed into an asteroid
                    case 'c':
                    	gw.crashAsteroid();
                    	break;
                    
                    	
                    //PS has hit an NPS				
                    case 'h':
                    	gw.crashNPS();
                    	break;
                    	
                    	
                    //two asteroids have collided
                    case 'x':
                    	gw.asteroidCrash();
                    	break;
                    	
                    //asteroid and NPS crash I (eye) = IMPACTED 
                    case 'I':
                    	gw.asteroidCrashNPS();
                    	break;
                    	
                    //game world game clock has ticked
                    case 't':
                    	gw.tick();
                    	break;
                    	
                    
                    	
                    //jump to hyperspace
                    case 'j':
                    	gw.jump();
                    	break;
                    	
                    //


                }
            }
        });
    }


    private void quit(){
        //code later
    }
}
