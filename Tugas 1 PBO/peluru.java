import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends rocket
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World w = getWorld();
        move(7);
        
        if (isTouching(death.class)){
            setImage("skull.png");
            Greenfoot.delay(1);
            Greenfoot.setWorld(new over());
        }
        
        removeTouching(balon.class);
        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }
    public peluru()
    {
        GreenfootImage myImage = getImage();
        setRotation(-90);
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
