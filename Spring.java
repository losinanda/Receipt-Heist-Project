import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spring extends World
{
    public int score;
    /**
     * Constructor for objects of class Spring.
     * 
     */
    public Spring()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        score = 0;
    }
    
        private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }
    
    public void addScore(int points)
    {
        score = score + 20; 
        showScore();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Land2 land2 = new Land2();
        addObject(land2,507,567);
        land2.setLocation(497,560);

        Plankton pinguin = new Plankton();
        addObject(pinguin,72,461);

        KrustyKrabs KrustyKrabs2 = new KrustyKrabs();
        addObject(KrustyKrabs2,743,161);
        KrustyKrabs2.setLocation(833,227);
        Bush1 bush1 = new Bush1();
        addObject(bush1,848,314);
        //KrustyKrabs.setLocation(808,309);
        Bush1 bush12 = new Bush1();
        addObject(bush12,647,302);
        bush12.setLocation(700,303);
        Bush1 bush13 = new Bush1();
        addObject(bush13,728,423);
        bush13.setLocation(604,416);
        bush13.setLocation(428,376);
        Bush1 bush14 = new Bush1();
        addObject(bush14,691,351);
        bush14.setLocation(508,205);
        bush14.setLocation(518,220);
        Bush1 bush15 = new Bush1();
        addObject(bush15,352,262);
        bush15.setLocation(314,271);
        Bush1 bush16 = new Bush1();
        addObject(bush16,216,391);
        bush16.setLocation(248,406);
        Bush1 bush17 = new Bush1();
        addObject(bush17,252,332);
        bush17.setLocation(135,319);
        bush14.setLocation(505,221);
        bush14.setLocation(505,221);
        bush14.setLocation(538,295);
        Spongebob spongebob = new Spongebob();
        addObject(spongebob,682,180);
        spongebob.setLocation(688,234);
        spongebob.setLocation(702,219);
        spongebob.setLocation(692,238);
        spongebob.setLocation(692,238);

        Chumstick chumstick = new Chumstick();
        addObject(chumstick,535,235);
        Chumstick chumstick2 = new Chumstick();
        addObject(chumstick2,132,264);
        Chumstick chumstick3 = new Chumstick();
        addObject(chumstick3,423,343);
        Chumstick chumstick4 = new Chumstick();
        addObject(chumstick4,324,227);
        Chumstick chumstick5 = new Chumstick();
        addObject(chumstick5,276,362);
        Bush1 bush18 = new Bush1();
        addObject(bush18,493,446);
        bush18.setLocation(340,485);
        bush18.setLocation(360,473);
        removeObject(spongebob);
        Crabs crabs = new Crabs();
        addObject(crabs,620,223);
        crabs.setLocation(734,231);
        Bush1 bush19 = new Bush1();
        addObject(bush19,724,387);
        bush19.setLocation(800,451);
        bush19.setLocation(815,463);
        Chumstick chumstick6 = new Chumstick();
        addObject(chumstick6,806,413);
        Chumstick chumstick7 = new Chumstick();
        addObject(chumstick7,681,375);
        chumstick7.setLocation(677,367);

        Spongebob spongebob2 = new Spongebob();
        addObject(spongebob2,716,219);

        removeObject(crabs);
        spongebob2.setLocation(715,248);
        spongebob2.getImage().mirrorHorizontally();
        //spongebob2.getImage().mirrorVertically();
        Gary gary = new Gary();
        addObject(gary,505,488);
        GaryTop garyTop = new GaryTop();
        addObject(garyTop,367,329);
        Bush1 bush110 = new Bush1();
        addObject(bush110,476,417);
        bush110.setLocation(557,372);
        //krustyKrabs.setLocation(880,270);
        Stealth stealth = new Stealth();
        addObject(stealth,880,270);
    }
}