
/**
 * Write a description of class daisy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class daisy
{
    public static void main(String args[]){
        new daisy();}

    public daisy(){
        int num = (int)(Math.random() * 10 + 15);
        for(num = num ; num < 26 ; num++){
            if(num % 2 == 0){
                System.out.println("she loves me");}
            else
                System.out.println("She loves me not");
            try
            {
                Thread.sleep(400);
            }
            catch(InterruptedException m)
            {
                ;
            }
        }
    }
}
