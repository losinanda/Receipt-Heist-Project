import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stealth extends Ending
{
    public void OverStealth()
    {
        Actor Stealth = this.getOneIntersectingObject(Plankton.class);
        if( Stealth != null)
        {
          this.getWorld().removeObject(Stealth);
          World myWorld = getWorld();
          Complete complete = new Complete();
          Next2 next2 = new Next2();
          Back back = new Back();
          myWorld.addObject(complete,myWorld.getWidth()/2, myWorld.getHeight()/2);
          myWorld.addObject(next2,727,541);
          myWorld.addObject(back,74,48);
        }
    }

    public void EndGame()
    {
       if (getWorld().getObjects(Chumstick.class).isEmpty())
       {
           OverStealth();
       } 
    }
    /**
     * Act - do whatever the Stealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();// Add your action code here.
    }    
}
