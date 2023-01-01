import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    public void Start()
    {
       if(Greenfoot.isKeyDown("backspace"))
        {
           LandingPage winter = new LandingPage();
           Greenfoot.setWorld(winter);
           //((MyWorld)getWorld()).StopMusic();
        }
    }
    
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();
    }    
}
 