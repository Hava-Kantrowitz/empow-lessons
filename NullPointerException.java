
/**
 * Write a description of class NullPointerException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NullPointerException
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class NullPointerException
     */
    public NullPointerException()
    {
        // initialise instance variables
        x = 0;
    }

   static public void main(String[] args) throws Exception
    {
        String error = null;
        System.out.println(error.length());
    }
}
