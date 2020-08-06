
/**
 * Write a description of class fixx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fizz
{
    public static void main (String args[]){
       new fizz();
    }
    
    public fizz(){
        for(int i = 1 ; i < 21 ; i++){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");}
            else if(i % 3 == 0){
                System.out.println("fizz");}
            else if (i % 5 == 0){
                System.out.println("buzz");}
            else
                System.out.println(i);
}  
}
}
