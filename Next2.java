import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next2 extends NextLevel
{
    public Next2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    
    public void Start()
    {
       if(Greenfoot.isKeyDown("ENTER"))
        {
           this.getWorld().removeObject(this);
           Spring spring = new Spring();
           Greenfoot.setWorld(spring);
        }
       if(Greenfoot.isKeyDown("backspace"))
        {
           LandingPage landing = new LandingPage();
           Greenfoot.setWorld(landing);
        }
    }
    
    /**
     * Act - do whatever the Next2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();// Add your action code here.
    }    
}
