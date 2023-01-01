import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChumstickShoot extends Actor
{
    public void act()
    {
        // Add your action code here.
        chumStickCollision();
        if (getWorld() != null) {
            hitEnemy();
        }
        move(8);
    }
    
    public void hitEnemy()
    {
        Spongebob mainenemy= (Spongebob) getOneIntersectingObject(Spongebob.class);
        if(mainenemy != null)
        {
            mainenemy.setHealth(-1);
            getWorld().removeObject(this);
        }

    }
    
    
     public void chumStickCollision() {
        if (isTouching(Spongebob.class)) {
            //getWorld().addObject(new Explosion(), getX(), getY());
            
            //removeTouching(Enemy.class);
            //getWorld().removeObject(this);
        }
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}

