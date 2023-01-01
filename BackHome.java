import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackHome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackHome extends Actor
{
    public BackHome()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /15, image.getHeight() /15);
        setImage(image);
    }
    public void home()
    {
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.setWorld(new LandingPage());
        //((ControllerTab)getWorld()).backgroundMusics.stop();
        }
    }
    /**
     * Act - do whatever the BackHome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        home();
    }    
}
