package target;

public class target
{
    public static void main (String args [])
    {
        new target ();
    }
    
    public target ()
    {
        int magic = 459;
        int num = IBIO.inputInt ("Pick a number: ");
        int num2 = IBIO.inputInt ("Pick another number: ");
        
        boolean num > magic = true;
        System.out.println ("It is true that the " + num + " is greater or equal to " + magic);
    }
}
