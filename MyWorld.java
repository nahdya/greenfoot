// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1000, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        roket roket =  new roket();
        addObject(roket, 303, 55);
        roket.setLocation(98, 79);
        balon balon =  new balon();
        addObject(balon, 504, 101);
        balon balon2 =  new balon();
        addObject(balon2, 792, 302);
        balon balon3 =  new balon();
        addObject(balon3, 526, 411);
        balon balon4 =  new balon();
        addObject(balon4, 317, 294);
        boom boom =  new boom();
        addObject(boom, 773, 143);
        boom boom2 =  new boom();
        addObject(boom2, 308, 442);
    }
}
