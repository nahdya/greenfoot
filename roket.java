// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class roket extends Actor
{
    private int score = 0;
    private int kecepatan = 1;

    /**
     * Act - do whatever the roket wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("Score=" + score, 50, 10);
        Belok();
        move(kecepatan);
        Tabrak();
    }

    /**
     * 
     */
    public void Belok()
    {
        if (Greenfoot.isKeyDown("Up")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("Down")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("Left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("Right")) {
            turn(5);
        }
    }

    /**
     * 
     */
    public void Tabrak()
    {
        if (isTouching(balon.class)) {
            removeTouching(balon.class);
            int x = Greenfoot.getRandomNumber(1000);
            int y = Greenfoot.getRandomNumber(600);
            balon baru =  new balon();
            getWorld().addObject(baru, x, y);
            score = score + 1;
            kecepatan = kecepatan + 1;
            if (kecepatan == 10) {
                kecepatan = 10;
            }
        }
        if (isTouching(boom.class)) {
            gameover gameOver =  new gameover();
            getWorld().addObject(gameOver, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
