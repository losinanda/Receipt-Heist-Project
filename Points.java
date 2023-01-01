import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends World
{
    
    static int countercs=0;
    static int point=0; 
    static int live=3;
    
    public Points()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void setLive () {
        this.live--;
    }
    public int getLive() {
        return this.live;
    }
}
