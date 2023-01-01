import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spatula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spatula extends Actor
{
    private int timer = 200;
    public Spatula()
    {
        GreenfootImage image = getImage();
        image.scale(50, 70);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        move(4);
        
        if (getWorld() != null) {
            hitEnemy();
        }
    }
    
    
    public void hitEnemy()
    {
        //Plankton plankton= (Plankton) getOneObjectAtOffset(0, 0, Plankton.class);
        
        Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
        if(plankton != null)
        {
            plankton.setHealth(1);
            getWorld().removeObject(this);
        }
        else {
            if (isAtEdge()) {
            getWorld().removeObject(this);
            }
        }
        
    }
    
    
     public void spatulaCollision() {
        //Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
        /*if (plankton != null) {
            plankton.setReduceLive(1);
            //getWorld().removeObject(this);
        }*/
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
}
