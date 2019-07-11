
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
    GreenfootImage Message3 = new GreenfootImage ("This is the last message" , 45, Color.GREEN, Color.YELLOW);
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
        /*
        try
        {
        Thread.sleep(2000);
        setImage(Message2);
        Thread.sleep(3000);
        setImage(Message3);
        }
        catch(InterruptedException ex)
        {
        Thread.currentThread().interrupt();

        }
        */
       
    public void callMessage(){
        Thread t1 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                if(run){
                try
                { 
                    printMessage(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            }} 
        }); 
        
        t1.start();
    }
       
    public void printMessage()throws InterruptedException 
        { 
            // this makes the produce thread to run first. 
            Thread.sleep(1000); 
  
            // synchronized block ensures only one thread 
            // running at a time. 
            synchronized(this) 
            { 
                setImage(Message2);
  
                // notifies the produce thread that it 
                // can wake up. 
                
  
                // Sleep 
                Thread.sleep(2000);
                notify(); 
            } 
            
            setImage(Message3);
            run = false;
        } 

}

