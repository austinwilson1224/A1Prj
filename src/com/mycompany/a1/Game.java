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


                    //second delivery
                    //June 5th


                    //make a new asteroid...
                    case 'a':
                        gw.loadNewAsteroid();
                        break;

                    //add a non player ship to the GameWorld
                    case 'y':
                        gw.addNonPlayerShip();
                        break;
                    case 'b':
                        gw.addSpaceStation();
                        break;
                    case 's':
                        gw.addPlayerShip();
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




                        //third delivery
                        //June 7th
                    case '>':
                    case 'n':
                    case 'k':
                    case 'e':
                        //gw.eliminate();
                        break;
                    case 'E':
                    case 'c':
                    case 'h':
                    case 'x':
                    case 'l':
                    case 'p':

                }
            }
        });
    }


    private void quit(){
        //code later
    }
}
