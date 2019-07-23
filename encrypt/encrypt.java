package encrypt;

public class encrypt
{
    public static void main (String args [])
    {
        new encrypt ();
    }
    
    public encrypt ()
    {
        System.out.println("I need a polite four letter word one letter at a time.");
        char let1 = IBIO.inputChar ("Enter the first letter: ");
        char let2 = IBIO.inputChar ("Enter the second letter: ");
        char let3 = IBIO.inputChar ("Enter the third letter: ");
        char let4 = IBIO.inputChar ("Enter the fourth letter: ");
        char lett1 = (char)('A'+ (Math.random()*26));
        char lett2 = (char)('A'+ (Math.random()*26));
        char lett3 = (char)('A'+ (Math.random()*26));
        char lett4 = (char)('A'+ (Math.random()*26));
        System.out.println (lett1 + lett2 + lett3 + lett4);
    }
}