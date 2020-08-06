public class series
{
    public static void main (String args [])
    {
        new series ();
    }
    
    public series ()
    {
        for (int i=0; i<13; i++)
        {
            System.out.print (i+ " ");
        }
        System.out.println (" ");
        for (int i=1; i<20; i++)
        {
            
            System.out.print (i+ " ");
        }
        System.out.println (" ");
        for (int i=0; i<1001; i/=10)
        {
            System.out.print ("-1+1");
        }
    }
}