
/**
 * Write a description of class Series here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Series
{
    public static void main(String args[]){
        new Series();
    }
    
    public Series(){
        System.out.println("\nGroup A Counting");
        for(int i = 0; i <= 12; i++){
            System.out.print(i + "");
    }
         System.out.println("\nGroup B Backwatds");
        for(int i = 12; i >= 0; i--){
            System.out.print(i + "");
    }
            System.out.println("\nGroup C Skip Counting");
        for(int i = 0; i <= 12; i+=2){
            System.out.print(i + "");
    }
            System.out.println("\nGroup D One Thing, Repeated");
        for(int i = 0; i <= 13; i++){
            System.out.print("*");
    }
            System.out.println("\nGroup E Powers");
        for(int i = 0; i <= 12; i++){
            System.out.print(i * i);
    }
            System.out.println("\nBonus");
        for(int i = 0; i <= 12; i++){
            System.out.print(i+"/"+ (i+1));
    }
}
}