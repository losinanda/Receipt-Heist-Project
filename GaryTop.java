import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GaryTop extends Enemy
{
    public GaryTop () {
        super();
    }
    
    public void act() 
    {
        enemymove(100);
        OverGaryTop();// Add your action code here.
    }    
                
    public void OverGaryTop() 
    {
        //Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
        //if(plankton != null)
        //{
            //plankton.setHealth(-1);
        //}
        Actor GaryTop = this.getOneIntersectingObject(Plankton.class);
        Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
        if(GaryTop != null)
        {
            //if (Points.live == 0) {
            plankton.setHealth(1);
               if (plankton.gettingHealth() == 0) {
               World myWorld = getWorld();
               GameOver gameover = new GameOver();
               myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
               
               //myWorld.removeObject(GaryTop);
               
               Retry1 retry1 = new Retry1();
               myWorld.addObject(retry1,727,541);
            }
            
            //}
        //Points.live--;
        
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
}
