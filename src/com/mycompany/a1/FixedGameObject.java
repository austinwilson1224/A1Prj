package com.mycompany.a1;


/**
 * Fixed Game Objects and such
 *
 * THIS IS A TEST
 *
 * Austin Wilson & Elianna Sanchez
 */
public abstract class FixedGameObject extends GameObject{
    //fields
    private static int id;

    //methods

    public int getNextID(){
        return this.id;
    }
}
