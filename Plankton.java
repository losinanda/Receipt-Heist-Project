import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Plankton extends Actor
{
    private int health = 3;
    private int gravity = 1;
    private int speed;
    int score=0;
    //GreenfootSound eating = new GreenfootSound("Eat.mp3");
      
    public void setHealth () {
        this.health = health;
    }
    public int gettingHealth () {
        return health;
    }
    
    public void act(){
        fall();
        walk(); 
        checkCollision();
        getChumstick();
        getLive();
        shootChumStick();
        collisionWithMainEnemy();
        getHealth();
    }
    
    public void getChumstick(){
        getWorld().showText("Chumstick: "+Points.countercs,826,48);
    }
    
    public void getLive(){
        getWorld().showText("Live: "+ health,56,48);
    }
    
    public void fall(){
        setLocation(getX(), getY()+ speed);
        if(isTouchLand()){
            speed = 0;
            while (isTouchLand())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else 
            speed += gravity;
    }
    
    public void jump(){
        speed = -11;
    }
    
    public void walk(){
        int y= getY();
        int x= getX();
        
        if(Greenfoot.isKeyDown("RIGHT")){
            x+=3;
            setImage("plankton.png"); 
            setRotation(0); 
            move(x);
        }
        
        if(Greenfoot.isKeyDown("LEFT")){
            x-=3;
            setImage("plankton.png"); 
            setRotation (180); 
            getImage().mirrorVertically();
            move(x);
        }
        
        if(Greenfoot.isKeyDown("UP") && isTouchLand()) 
            jump();
        
        setLocation(x, y);
    }
    
    public boolean isTouchLand(){
        boolean TouchLand= false;
        
        if (getY() > getWorld().getHeight())
            TouchLand=true;
            
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/2,SnowCap1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/2,SnowCap1.class) !=null)
            TouchLand=true;
            
        // if (getOneObjectAtOffset(imageWidth/1, imageHeight/1,Land1.class)!=null ||
            // getOneObjectAtOffset(imageWidth/-1, imageHeight/1,Land1.class) !=null)
            // TouchLand=true;
            
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/2,Gary.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/2,Gary.class) !=null){
                //TouchLand=true;
                removeTouching(Gary.class);
            }
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/2,GaryTop.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/2,GaryTop.class) !=null){
                //TouchLand=true;
                removeTouching(GaryTop.class);
            }
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/2,Bush1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/2,Bush1.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/2,BushN.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/2,BushN.class) !=null)
            TouchLand=true;

        if (getY() > getWorld().getHeight() - 120)
            TouchLand=true;
            
        return TouchLand;
    }
    
    private void checkCollision(){
        if (isTouching(Chumstick.class)){
            removeTouching(Chumstick.class);
            Points.countercs+=1;
            //eating.play();
        }
    }
    
    MouseInfo mouseInfo = Greenfoot.getMouseInfo();
    //private int live = 3;
    public void shootChumStick() {
        if(Greenfoot.mouseClicked(null))
        {
            if (Points.countercs != 0) {
                ChumstickShoot temp = new ChumstickShoot();
                getWorld().addObject(temp, getX() + 50, getY());
                Points.countercs--;
            }
        }
    }

    public void collisionWithMainEnemy() {
        if (this.isTouching(MainEnemy.class)) {
            setLocation(100,200);
        }
    }
    
    /*public void setHealth (int points)
    {
        health += points;
    }
    */
    public void setHealth (int live) {
        health--;
        setLocation(53,482);
    }

    
    public int getHealth()
    {
    
        if (health <=0 ) {
            
               World myWorld = getWorld();
               GameOver gameover = new GameOver();
               myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
               
               getWorld().removeObject(this);
               
               Retry1 retry1 = new Retry1();
               myWorld.addObject(retry1,727,541);
            
        }
        return health;
    }
}