
/**
 * Write a description of class ifsandloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ifsandloops
{
    public static void main (String args [])
    {
        new ifsandloops ();
    }
    
    public ifsandloops ()
    {
        System.out.println ("Unscramble this word. It is a form of shelter.");
        String ans = IBIO.inputString ("ntte >>");
        int counter = 1;
        while (!ans.equals ("tent"))
        {
            System.out.println ("\tIncorrect, try again!");
            ans = IBIO.inputString ("ntte >>");
            counter++;
        }
        System.out.println ("\tCorrect, it is a tent!");
        System.out.println ("\tYou got it in " + counter + " guesses.");
    }
}
