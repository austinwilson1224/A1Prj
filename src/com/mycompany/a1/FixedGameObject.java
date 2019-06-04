package com.mycompany.a1;


/**
 * Fixed Game Objects and such
 *
 * Austin Wilson & Elianna Sanchez
 */
public abstract class FixedGameObject extends GameObject{
    //fields
    private int id;

    //methods

    public int getNextID(){
        return this.id;
    }
}
