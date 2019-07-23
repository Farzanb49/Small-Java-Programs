package narrowtarget;

public class target
{
    public static void main (String args [])
    {
        new target ();
    }
    
    public target ()
    {
        int num = (int) (Math.random() *1000);
        int yournum = IBIO.inputInt ("Enter an integer guess for my number: ");
        int yournum2 = IBIO.inputInt ("Enter another integer guess for my number: ");
        Math.min(yournum, num) == yournum;
        System.out.println ("It is true my number is equal to or more than " + Math.min(yournum, num) == yournum);
        System.out.println ("It is true my number is equal to or less than " + Math.max(yournum2, num));
    }
}