import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandingPage extends World
{
    GreenfootSound themeSong = new GreenfootSound("spongebob-squarepants-closing-theme-song.mp3");
    
    public LandingPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
    }
    
    public void act()
    {
        Start();
    }
    
    public void Start()
    {
       if (Greenfoot.isKeyDown("space")) 
       {
           Greenfoot.setWorld(new Winter());
           themeSong.play();
           Points.countercs=0;
       }
    }
    
    private void prepare()
    {
        PSpace pspace = new PSpace();
        addObject(pspace,460,555);
        pspace.setLocation(450,568);
        Next2 next2 = new Next2();
        addObject(next2,770,479);
        next2.setLocation(627,533);
        next2.setLocation(727,541);
        removeObject(next2);
    }
}
