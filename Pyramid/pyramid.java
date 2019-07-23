public class pyramid
{
    public static void main (String args [])
    {
        new pyramid ();
    }
    
    public pyramid ()
    {
        int i, j, k;
        int height = IBIO.inputInt ("Enter height of pyramid here: ");
        System.out.println ("Pyramid of height " + height);
        for (i=0; i<height; i++)
        {
            for (j=0; j<5-i;j++)
            {
                System.out.print (" ");
            }
            for (k=1; k <= 2*i-1 ; k++)
            {
                System.out.print ("*");
            }
            System.out.println();
        }
            
        
        
        
    }
}
