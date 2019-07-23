
/**
 * This program will promp the user to input specifications for a trident, which 
 * will then be outputted. The program will accept the parameters for tine length,
 * spacing, and handle length, and will print out the appropriate trident. Enjoy!
 *
 * Farzan Bhuiyan
 * April 4, 2019
 */
public class trident
{
  public static void main (String args [])
  {
      new trident ();
    }
    
    public trident ()
    {
        //prompt user input for trident specifications
        int prongs = IBIO.inputInt ("Enter the number of prongs: ");
        int tinelength = IBIO.inputInt ("Enter tine length: ");
        int tinespacing = IBIO.inputInt ("Enter tine spacing: ");
        int handlelength = IBIO.inputInt ("Enter handle length: ");
        //print out number of tines (prongs) and length of tines
        for (int i=1; i<=tinelength; i++){
            for (int j=1; j<=prongs-1; j++){
                System.out.print ("*");
                for (int n = 1; n<=tinespacing; n++){
                    System.out.print (" ");
                }   
            }
            System.out.print ("* \n");
        }
        //print out the bar below the prongs
        for (int i = 1; i<= (tinespacing*(prongs-1)) +prongs; i++){
            System.out.print ("*");
        }
        System.out.println (" ");
        //print out the handle of the trident
            for (int j=1 ; j<= handlelength; j++){
                for (int i = 1; i <= ((tinespacing*(prongs-1))+prongs)/2; i++){
                    System.out.print (" ");
                }
                System.out.println ("*");
            }
        }
    }
                
        
        
