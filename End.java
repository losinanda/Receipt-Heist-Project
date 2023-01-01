import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import javax.swing.*;
/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        showPoint();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void showPoint()
    {
        if(Points.countercs>Points.point)
        {
            Points.point=Points.countercs;
        }
       JOptionPane.showMessageDialog(null,"Score: "+Points.countercs,"Congratulation", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"Top Score: "+Points.countercs,"Congratulation", JOptionPane.INFORMATION_MESSAGE);
    }
    private void prepare()
    {
        Back back = new Back();
        addObject(back,412,199);
        back.setLocation(73,44);
    }
}
