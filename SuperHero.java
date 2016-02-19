package com.conor;

public class SuperHero {

    public static void main(String[] args) {
        //Instantiate an Object
	    IronMan tony = new IronMan();
        IronMan stark = new IronMan();
        IronMan civilWar = new IronMan();
        IronMan comics = new IronMan();

        //Create methods
        tony.roar();
        stark.roar();
        civilWar.roar();
        comics.message();
    }
}
