 




 

public class binarytodec
{
    public static void main (String args[])
    {
        new binarytodec ();
    }

    public binarytodec ()
    {
        int bin=IBIO.inputInt("Please enter a binary number (max 8 bits): ");
        int b1=bin%10;
        int b2=((bin%100)/10)*2;
        int b3=((bin%1000)/100)*4;
        int b4=((bin%10000)/1000)*8;
        int b5=((bin%100000)/10000)*16;
        int b6=((bin%1000000)/100000)*32;
        int b7=((bin%10000000)/1000000)*64;
        int b8=((bin%100000000)/10000000)*128;
        int dec= b1+b2+b3+b4+b5+b6+b7+b8;

        System.out.println ("Okay, that's "+dec+" in decimal");

        int num=IBIO.inputInt ("Please enter an integer between 0-255: ");
        int dec1=num/2;
        int dec2=dec1/2;
        int dec3=dec2/2;
        int dec4=dec3/2;
        int dec5=dec4/2;
        int dec6=dec5/2;
        int dec7=dec6/2;

        int d1=num%2;
        int d2=dec1%2;
        int d3=dec2%2;
        int d4=dec3%2;
        int d5=dec4%2;
        int d6=dec5%2;
        int d7=dec6%2;
        int d8=dec7%2;

        System.out.println ("Cool, that's "+d8+""+d7+""+d6+""+d5+""+d4+""+d3+""+d2+""+d1+" in binary");
        int lastdig = num%10;
        System.out.println ("The last digits are " + lastdig + " and " + b1);
        System.out.println ("Adding 5 to each gives " + (5 + lastdig) + " and " + (5 + b1));
        System.out.println (lastdig + 5 + " * " + (b1 + 5) + " is " + (lastdig + 5)*(b1 + 5));
        System.out.println ("The square root of " + (lastdig + 5)*(b1 + 5) + " is " + Math.sqrt ((lastdig + 5)*(b1 + 5)));
    }
}