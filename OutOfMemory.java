
/**
 * Write a description of class OutOfMemory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OutOfMemory
{
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class OutOfMemory
     */
    public OutOfMemory()
    {
        // initialise instance variables
        x = 0;
    }

    static public void main(String[] args) throws Exception
    {
        int Num = 1;
        int Num2 = 1;
        while(Num == 1){
            Num2++;
            System.out.println(Num2);
        }
    }
}
