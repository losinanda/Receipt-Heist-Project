import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gary extends Enemy
{
    public Gary () {
        super();
    }
    public void act() 
    {
        enemymove(240);
        OverGary();
    }    
                     
    public void OverGary() 
    {
        Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
        Actor Gary = this.getOneIntersectingObject(Plankton.class);
        if(Gary != null)
        {
           plankton.setHealth(1);
            //plankton.setHealth(-1);
           if (plankton.gettingHealth() == 0) {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           
           //myWorld.removeObject(Gary);
           
           Retry1 retry1 = new Retry1();
           myWorld.addObject(retry1,727,541);
           
        } 
        /*
        Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
        if(plankton != null)
        {
            plankton.setHealth(-1);
        }
        */
        
    }   
}
}
