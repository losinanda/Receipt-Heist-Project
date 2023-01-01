import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry1 extends NextLevel
{
    public void act() 
    {
        Start();
    }    
    
    public Retry1()
    {
        
    } 
    
    public void Start()
    {
       if(Greenfoot.isKeyDown("ENTER"))
        {
           this.getWorld().removeObject(this);
           Winter myworld = new Winter();
           Greenfoot.setWorld(myworld);
           Points.countercs=0;
        }
    }
}
