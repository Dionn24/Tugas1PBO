import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shooter();
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
    }
    
    public void shooter()
    {
        World w = getWorld();
        if (isTouching(death.class)){
            setImage("skull.png");
            Greenfoot.delay(1);
            Greenfoot.setWorld(new over());
        }
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new peluru(),getX(), getY());
        }
    }
}
