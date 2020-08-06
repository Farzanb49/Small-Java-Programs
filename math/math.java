
/**
 * Write a description of class math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class math
{
    public static void main (String args []){

        new math();
    }

    public math(){
        int a = 9;
        int b = 8;
        int c = 7;
        int d = 23;
        int e = Math.max(a,b);
        int f = Math.max(c,d);
        int g = Math.min(a,b);
        int h = Math.min(c,d); 
        if (e>f){
            if (g>h){
                if (g>f){
                    System.out.println(e + "" + g + "" + f + "" + h);
                }
                else {
                    System.out.println(e + "" + f+ "" + g+ "" + h);

                }
               
                
            }
            else{
                if (h>f){
                    System.out.println(e + "" + h + "" + f + "" + g);
                }
                else {
                    System.out.println(e + "" + f+ "" + h+ "" + g);
                }
        }
        
    }
    else{
            if (g>h){
                if (g>e){
                    System.out.println(f + "" + g + "" + e + "" + h);
                }
                else {
                    System.out.println(f + "" + e+ "" + g+ "" + h);

                }
               
                
            }
            else{
                if (h>e){
                    System.out.println(f + "" + h + "" + e + "" + g);
                }
                else {
                    System.out.println(f + "" + e+ "" + h+ "" + g);
                }
        }
    }
}
}
