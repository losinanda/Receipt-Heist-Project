import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry2 extends NextLevel
{
    public Retry2()
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
           Points.countercs=0;
        }
    }
    /**
     * Act - do whatever the Retry2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();// Add your action code here.
    }    
}
