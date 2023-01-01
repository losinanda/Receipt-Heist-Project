import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winter extends World
{
    public int score;
    public Winter()
    {    
        super(1000, 600, 1);
        
        score = 0;
        prepare();
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
        Plankton plankton = new Plankton(); /** Right **/
        addObject(plankton,43,220);
        plankton.setLocation(53,482);

        Grasss grass = new Grasss(); /** winterland **/
        addObject(grass,510,600);

        /*
        SnowCap3 snowcap3 = new SnowCap3();
        addObject(snowcap3,725,348);
        snowcap3.setLocation(790,358);

        SnowCap1 snowcap1 = new SnowCap1();
        addObject(snowcap1,248,417);
        snowcap1.setLocation(187,449);
        SnowCap2 snowcap2 = new SnowCap2();
        addObject(snowcap2,364,364);
        removeObject(snowcap2);
        SnowCap2 snowcap22 = new SnowCap2();
        addObject(snowcap22,311,407);
        snowcap22.setLocation(370,381);
        SnowCap3 snowcap32 = new SnowCap3();
        addObject(snowcap32,306,225);
        snowcap32.setLocation(198,305);
        snowcap32.setLocation(214,313);
        snowcap32.setLocation(198,312);
        SnowCap1 snowcap12 = new SnowCap1();
        addObject(snowcap12,414,245);
        snowcap12.setLocation(442,252);
        snowcap22.setLocation(378,385);
        SnowCap3 snowcap33 = new SnowCap3();
        addObject(snowcap33,623,185);
        snowcap33.setLocation(666,200);
        snowcap33.setLocation(667,200);
        snowcap33.setLocation(679,200);
        SnowCap3 snowcap34 = new SnowCap3();
        addObject(snowcap34,168,108);
        snowcap34.setLocation(82,127);
        SnowCap1 snowcap13 = new SnowCap1();
        addObject(snowcap13,318,193);
        snowcap13.setLocation(273,179);

        snowcap14.setLocation(555,450);

        removeObject(snowcap34);
        SnowCap3 snowcap35 = new SnowCap3();
        addObject(snowcap35,57,157);
        snowcap35.setLocation(52,126);

        snowcap22.setLocation(403,391);

        SnowCap1 snowcap14 = new SnowCap1();
        addObject(snowcap14,640,461);
        snowcap14.setLocation(640,455);
        snowcap14.setLocation(639,448);
        snowcap14.setLocation(621,447);
        snowcap14.setLocation(620,451);
         */

        Gary gary = new Gary();
        addObject(gary,539,485);

        Chumstick chumstick = new Chumstick();
        addObject(chumstick,104,54);
        chumstick.setLocation(82,76);
        Chumstick chumstick2 = new Chumstick();
        addObject(chumstick2,606,263);
        chumstick2.setLocation(277,138);
        Chumstick chumstick3 = new Chumstick();
        addObject(chumstick3,510,194);
        chumstick3.setLocation(421,209);
        Chumstick chumstick4 = new Chumstick();
        addObject(chumstick4,636,128);
        chumstick4.setLocation(397,352);
        Chumstick chumstick5 = new Chumstick();
        addObject(chumstick5,353,476);
        chumstick5.setLocation(346,490);
        Chumstick chumstick6 = new Chumstick();
        addObject(chumstick6,669,502);
        chumstick6.setLocation(679,488);
        chumstick6.setLocation(681,493);
        chumstick5.setLocation(346,499);
        chumstick6.setLocation(681,500);
        chumstick4.setLocation(398,357);
        chumstick3.setLocation(425,218);
        chumstick2.setLocation(273,143);
        chumstick.setLocation(82,88);
        chumstick.setLocation(82,84);

        Stealth stealth = new Stealth();
        addObject(stealth,827,313);
        GameOver gameover = new GameOver();
        addObject(gameover,479,302);
        gameover.setLocation(465,300);
        removeObject(gameover);

        Stealth stealth2 = new Stealth();
        addObject(stealth2,282,275);
        stealth2.setLocation(276,263);
        stealth2.setLocation(289,268);
        removeObject(stealth2);
        SqwHouse igloo = new SqwHouse();
        addObject(igloo,827,365);
        igloo.setLocation(819,302);

        SnowCap1 snowCap1 = new SnowCap1();
        addObject(snowCap1,421,420);
        SnowCap1 snowCap12 = new SnowCap1();
        addObject(snowCap12,438,262);
        SnowCap1 snowCap13 = new SnowCap1();
        addObject(snowCap13,295,235);

        SnowCap1 snowCap14 = new SnowCap1();
        addObject(snowCap14,119,119);
        snowCap14.setLocation(84,129);
        SnowCap1 snowCap15 = new SnowCap1();
        addObject(snowCap15,133,310);
        snowCap15.setLocation(139,299);
        SnowCap1 snowCap16 = new SnowCap1();
        addObject(snowCap16,232,476);
        snowCap16.setLocation(252,464);
        SnowCap1 snowCap17 = new SnowCap1();
        addObject(snowCap17,665,460);
        snowCap17.setLocation(637,359);
        snowCap17.setLocation(604,368);
        SnowCap1 snowCap18 = new SnowCap1();
        addObject(snowCap18,842,371);
        snowCap18.setLocation(824,341);
        SnowCap1 snowCap19 = new SnowCap1();
        addObject(snowCap19,933,357);
        snowCap19.setLocation(947,341);

        igloo.setLocation(842,180);
        stealth.setLocation(977,304);
        igloo.setLocation(973,298);
        igloo.setLocation(977,291);
        SnowCap1 snowCap110 = new SnowCap1();
        addObject(snowCap110,577,307);
        snowCap110.setLocation(564,308);
        SnowCap1 snowCap111 = new SnowCap1();
        addObject(snowCap111,688,223);
        snowCap111.setLocation(608,224);
        SnowCap1 snowCap112 = new SnowCap1();
        addObject(snowCap112,792,276);
        snowCap112.setLocation(774,272);
        removeObject(snowCap18);
        snowCap110.setLocation(738,280);
        snowCap112.setLocation(794,167);
        snowCap112.setLocation(789,175);
        //SnowCap1 snowCap18 = new SnowCap1();
        addObject(snowCap18,214,192);
        snowCap18.setLocation(209,172);
        chumstick2.setLocation(169,263);
        snowCap13.setLocation(268,264);
        snowCap18.setLocation(257,181);
        snowCap13.setLocation(230,296);
        snowCap18.setLocation(279,184);
        snowCap13.setLocation(281,293);
        SnowCap1 snowCap113 = new SnowCap1();
        addObject(snowCap113,404,223);
        snowCap12.setLocation(320,264);
        snowCap13.setLocation(250,299);
        snowCap113.setLocation(437,239);
        removeObject(snowCap12);
        snowCap113.setLocation(402,231);
        chumstick3.setLocation(421,183);
        chumstick3.setLocation(422,196);
        snowCap113.setLocation(378,250);
        chumstick3.setLocation(420,212);
        snowCap18.setLocation(282,167);
        snowCap13.setLocation(302,284);
        //SnowCap1 snowCap12 = new SnowCap1();
        addObject(snowCap12,287,273);
        snowCap12.setLocation(336,239);
        snowCap113.setLocation(427,239);
        snowCap113.setLocation(436,242);
        snowCap113.setLocation(433,237);
        chumstick3.setLocation(392,191);
        snowCap13.setLocation(256,289);
        snowCap13.setLocation(252,295);
        snowCap14.setLocation(142,131);
        snowCap12.setLocation(290,242);
        removeObject(snowCap12);
        snowCap113.setLocation(343,225);
        snowCap111.setLocation(599,225);
        snowCap113.setLocation(450,218);
        snowCap113.setLocation(404,223);
        SnowCap1 snowCap114 = new SnowCap1();
        addObject(snowCap114,652,466);
        snowCap114.setLocation(652,448);
        snowCap114.setLocation(657,448);
        snowCap112.setLocation(802,193);
        snowCap112.setLocation(883,219);
        removeObject(chumstick2);
        igloo.setLocation(920,500);
        igloo.setLocation(948,476);
        igloo.setLocation(953,460);
        stealth.setLocation(956,506);
        igloo.setLocation(927,409);
        igloo.setLocation(931,488);
        igloo.setLocation(933,472);
        igloo.setLocation(927,396);
        igloo.setLocation(927,405);
        igloo.setLocation(944,306);
        igloo.setLocation(940,303);
        snowCap112.setLocation(808,298);
        snowCap110.setLocation(713,242);
        snowCap111.setLocation(640,227);
        snowCap112.setLocation(852,293);
        snowCap111.setLocation(614,218);
        snowCap110.setLocation(693,287);
        snowCap19.setLocation(919,282);
        igloo.setLocation(938,457);
        snowCap19.setLocation(931,280);
        snowCap112.setLocation(827,284);
        snowCap110.setLocation(746,285);
        snowCap111.setLocation(599,220);
        snowCap17.setLocation(592,340);
        snowCap17.setLocation(541,335);
        snowCap110.setLocation(662,271);
        snowCap111.setLocation(617,204);
        snowCap110.setLocation(736,275);
        snowCap111.setLocation(600,222);
        snowCap110.setLocation(696,281);
        snowCap111.setLocation(591,220);
        Gary gary2 = new Gary();
        addObject(gary2,107,256);
        gary2.setLocation(110,259);
        removeObject(gary2);
        GaryTop garyTop = new GaryTop();
        addObject(garyTop,108,254);
        garyTop.setLocation(112,258);
        Spongebob spongebob = new Spongebob();
        addObject(spongebob,804,461);
        spongebob.setLocation(800,468);
        spongebob.setRotation(180);
        spongebob.getImage().mirrorVertically();
        spongebob.setLocation(828,504);
        Chumstick chumstick7 = new Chumstick();
        addObject(chumstick7,736,223);
        Chumstick chumstick8 = new Chumstick();
        addObject(chumstick8,187,257);
    }
}
