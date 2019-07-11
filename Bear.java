
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor 
{
    GreenfootImage Message1 = new GreenfootImage ("Hi" , 100, Color.BLUE, Color.RED);
    GreenfootImage Message2 = new GreenfootImage ("This is cool, right?" , 50, Color.BLACK, Color.WHITE);
    GreenfootImage Message3 = new GreenfootImage ("I will take that as a yes" , 45, Color.ORANGE, Color.BLACK);
    GreenfootImage Message4 = new GreenfootImage ("This is the last message" , 45, Color.GREEN, Color.YELLOW);
    boolean run = true;

    public Bear (){
        setImage(Message1);
    }

    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

        if(run == true){
            callMessage();

        }

    }

    public void callMessage(){
        Thread t1 = new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        if(run){
                            try
                            {
                                Printer();

                            }
                            catch(InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }}
                });

        t1.start();
    }

    public void Printer ()throws InterruptedException{

        synchronized(this)
        {
            
            wait(2000);
            setImage(Message2);

            wait(3000);
            
            synchronized(this){
                setImage(Message3);
                wait(3000);
                notifyAll();
            }

            notifyAll();
        }

        setImage(Message4);
        this.run = false;
    }

}
