import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cupcake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cupcake extends Actor
{
    int sprinkles;
    int time;
    
    public Cupcake(){
        sprinkles = 10;
        time = 0;
    }
    /**
     * Act - do whatever the Cookie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int cookieSize = 10;
       int numExtraSprinkles = 10;
       
       int biteSize = 10;
       
       int bakeTime = 10;
       
       if (time <= bakeTime){
           bake(cookieSize, numExtraSprinkles);
        }
       else{
           eat(biteSize, numExtraSprinkles);
        }
     
       
    } 
    
    public void bake(int cookieSize, int numExtraSprinkles){
        GreenfootImage myImage = getImage();
        int myWidth = myImage.getWidth();
        int myHeight = myImage.getHeight();
        myImage.scale(myWidth + cookieSize, myHeight + cookieSize);//grow the cookie
        
        time++;
        sprinkles = sprinkles + numExtraSprinkles;
    }
    
    public void eat(int sizeOfBite, int eatenSprinkles){
        
        GreenfootImage myImage = getImage();
        int myWidth = myImage.getWidth();
        int myHeight = myImage.getHeight();
        myImage.scale(myWidth - sizeOfBite, myHeight - sizeOfBite);
        sprinkles = sprinkles - eatenSprinkles;
    }
}
