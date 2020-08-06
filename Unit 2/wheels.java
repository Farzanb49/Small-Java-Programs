
/**
 * Write a description of class wheels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wheels
{  public static void main(String args[]){
        new wheels();
    }

    public wheels(){
        String word = IBIO.inputString("Insert a word");
        String word2 = IBIO.inputString("insert another word");
        song(word , word2);
    }   

    public void song (String a, String b){
        System.out.println("The "+a+" on the bus goes "+b+" and "+b);
        System.out.println(b+" and " +b+ " and "+b);
        System.out.println("The "+a+" on the bus goes "+b+" and "+b);
        System.out.println(b+" and "+b + b + " and "+b);
    }
}
