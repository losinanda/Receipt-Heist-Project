import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crabs extends MainEnemy
{
    /**
     * Act - do whatever the MainEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health = 7;
    
    public Crabs()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /6, image.getHeight() /8);
        setImage(image);
    }

    
    public void act()
    {
        // Add your action code here.
        //if (!(getWorld().getObjects(Crabs.class).isEmpty())) {
    
        shootSpatula();
        getHealth();
        OverSpongebob();
        //}
    }

    
    public void setHealth (int points)
    {
        health += points;
    }
    
    public int getHealth()
    {
        if (health <= 0) {
            getWorld().removeObject(this);
        }
        return health;
    }
    
    int laserTimer = 0; 
    public void shootSpatula() {
        if (laserTimer == 240) {
            Spatula bullet = new Spatula();
            getWorld().addObject(bullet, getX() - 70, getY());
            bullet.setRotation(180);
            laserTimer = 0;
        }
        else {
            laserTimer++;
        }
    }

   public void OverSpongebob() 
    {
        if (getWorld() != null) {
            Actor Crabs = this.getOneObjectAtOffset(0,0, Plankton.class);
            Plankton plankton= (Plankton) getOneIntersectingObject(Plankton.class);
            if(Crabs != null)
            {
               plankton.setHealth(1);
               if (plankton.getHealth() == 0) {
                World myWorld = getWorld();
               GameOver gameover = new GameOver();
               myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
               plankton.setHealth(1);
               //myWorld.removeObject(Crabs);
               
               Retry1 retry1 = new Retry1();
               myWorld.addObject(retry1,727,541);
            }
            } 
        }
    }  

}
