
/**
 * Write a description of class ArrayIndexOutOfBoundsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayIndexOutOfBoundsException
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ArrayIndexOutOfBoundsException
     */
    public ArrayIndexOutOfBoundsException()
    {
        // initialise instance variables
        x = 0;
    }

    static public void main(String[] args) throws Exception
    {
        int a[] = new int [7];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        a[6] = 6;
        for (int i = 0; i < 8; i++){
            System.out.println(a[i]);
        }
    }
}
