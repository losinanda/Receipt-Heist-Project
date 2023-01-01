import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed   = 2;
    private int count   = 0;

    public void act() {
        
        // Add your action code here.
    }    
    
        protected void enemymove(int time){ 
        if(count < time)
            setLocation(getX() + speed, getY()); 
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count=0;
        }
        count++;
    }
}
