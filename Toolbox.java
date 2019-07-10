import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toolbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toolbox extends Actor
{
    /**
     * Act - do whatever the Toolbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Gets the image of an object for manipulation
     */
    public void imageDim(){
        GreenfootImage myImage = getImage();
        int myWidth = myImage.getWidth();
        int myHeight = myImage.getHeight();
    }
    
     /**
     * Move forward in the current direction.
     */
    public void move()
    {
       int WALKING_SPEED = 5;
       move(WALKING_SPEED);
    }
    
    /**
     * Test if we are close to one of the edges of the world. Return true if we are.
     */
    public boolean atWorldEdge()
    {
        if (getX() < 20 || getX() > getWorld().getWidth() - 20) {
            return true;
        }
        if (getY() < 20 || getY() > getWorld().getHeight() - 20) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Return true if we can see an object of class 'clss' right where we are. False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }
    
    /**
     * Try to eat an object of class 'clss'. This is only successful if there is such an object where we currently are. Otherwise this method does nothing.
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if (actor != null) {
            getWorld().removeObject(actor);
        }
    }

    /**
     * Return a random number in the specified range.  This method can return negative numbers.
     */
    public int getRandomRange(int rangeMin, int rangeMax)
    {
        int vNumber = 0;
        int vTotalNumbers = rangeMax - rangeMin;
        if (rangeMax <= rangeMin) {
            return 0;
        }
        vNumber = Greenfoot.getRandomNumber(vTotalNumbers);
        vNumber = vNumber + rangeMin;
        return vNumber;
    }


}
