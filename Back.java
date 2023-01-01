import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    public Back()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3);
        setImage(image);
    }
    public void control()
    {
        if(Greenfoot.mouseClicked(this))
        {
         Greenfoot.setWorld(new LandingPage());
         //((Winter)getWorld()).backgroundSummer.stop();
        }
    }
    
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        control();// Add your action code here.
    }    
}
