public class Madlib 
{
    public static void main (String args [])
    {
        new Madlib ();
    }
    
    public Madlib ()
    {
        String adj = IBIO.inputString ("Enter an adjective here: ");
        String noun = IBIO.inputString ("Enter a noun here: ");
        String noun2 = IBIO.inputString ("Enter a noun here: ");
        String adj2 = IBIO.inputString ("Enter an adjective here: ");
        String animal = IBIO.inputString ("Enter an animal here: ");
        int weight = IBIO.inputInt ("Enter an integer here: ");
        String animal2 = IBIO.inputString ("Enter an animal here: ");
        String adj3 = IBIO.inputString ("Enter another adjective here: ");
        adj3 = (char)(adj.charAt(0)-32) + adj3.substring(1);
        noun2 = (char)(adj.charAt(0)-32) + noun2.substring(2);
        System.out.println ("\nI was walking along a " + adj + " road called");
        System.out.println (noun + " Rd. when it suddenly started raining " + noun2 + "s");
        System.out.println ("Suddenly a " + adj2 + " " + animal + " came flying in, only to be joined by more!"); 
        System.out.println ("It was now raining " + animal + " as well. They were enormous,");
        System.out.println ("Weighing in at " + weight + " pounds!");
        System.out.println ("Seeking shelter, I jumped into a " + animal2 + "'s hole,");
        System.out.println ("to find Alice and her " + adj3 + " friends!");
        System.out.println ("I was safe from the raining " + noun2 + "s and " + animal + "s at last!");
        
    }
}