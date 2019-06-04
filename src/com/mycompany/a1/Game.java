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
                String sCommand =  myTextField.getText().toString();
                myTextField.clear();
                switch (sCommand.charAt(0)){


                    //second delivery
                    //June
                    case 'a':
                    case 'y':
                    case 'b':
                    case 's':
                    case 'f':
                    case 'L':
                    case 'm':




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
