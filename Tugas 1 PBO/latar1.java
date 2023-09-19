import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar1 extends World
{

    /**
     * Constructor for objects of class latar1.
     * 
     */
    public latar1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        rocket rocket = new rocket();
        addObject(rocket,286,327);
        rocket.setLocation(281,357);
        rocket.setLocation(126,194);
        rocket.setLocation(56,197);
        rocket.setLocation(54,212);
        rocket.setLocation(54,219);
        rocket.setLocation(338,353);
        rocket.setLocation(304,372);
        rocket.setRotation(-90);
    }

    public void act(){
    if(Greenfoot.getRandomNumber(600)<3){
    addObject(new balon(),Greenfoot.getRandomNumber(500),1);
    }
    if(Greenfoot.getRandomNumber(600)<3){
    addObject(new death(),Greenfoot.getRandomNumber(500),1);
    }
    }
}
