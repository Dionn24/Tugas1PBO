import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balon extends Actor
{
    /**
     * Act - do whatever the balon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+2);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
    public balon()
    {
        GreenfootImage img = this.getImage();
        img.scale(40,40);
        this.setImage(img);
    }
}
