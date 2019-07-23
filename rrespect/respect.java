package rrespect;

public class respect
{
    public static void main (String args [])
    {
        new respect ();
    }
    
    public respect ()
    {
        String name = IBIO.inputString ("Enter a name: ");
        System.out.println(name + " has a capital, you goofball.");
        String verb = IBIO.inputString ("Enter a verb: ");
        name=(char)(name.charAt(0)-32)+name.substring(1);
        System.out.println(name + " can " + verb + " the...");
    }
}