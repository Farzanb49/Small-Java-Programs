
/**
 * Write a description of class bottles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bottles
{
    public static void main (String args [])
    {
        new bottles ();
    }
    
    public bottles ()
    {
        for (int i=100; i>0; i--){
            System.out.println (i + "bottles of pop on the wall.");
            System.out.println (i + "bottles of pop.");
            System.out.println ("If one of those bottles should happen to fall.");
            System.out.println ("There would be " + (i-1) + " bottles of pop on the wall.");
    }
}
}