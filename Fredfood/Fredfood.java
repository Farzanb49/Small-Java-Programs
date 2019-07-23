package Fredfood;

/**
 * You are shopping at Fred's Food! This program will ask you what you want to buy and will print you a bill
 * Farzan Bhuiyan
 */
public class Fredfood
{
    public static void main (String args [])
    {
        new Fredfood ();
    }

    public Fredfood ()
    {
        System.out.println("**************************");
        System.out.println("* Welcome to Fred's Food *");
        System.out.println("**************************");
        System.out.println("\nEnter the amount of each thing you would like to buy.");
        int egg = IBIO.inputInt ("How many eggs would you like? ");
        int lettuce = IBIO.inputInt ("How many lettuce would you like? ");
        int milk = IBIO.inputInt ("How many cartons of milk would you like? ");
        int cookies = IBIO.inputInt ("How many boxes of cookies would you like? ");
        int apple = IBIO.inputInt ("How many apples would you like? "); 
        System.out.println("\n**************************");
        System.out.println("*    Fred's Food Bill    *");
        System.out.println("**************************");
        System.out.println("\n" + egg + " egg @ $0.30 = $" + (egg*0.30));
        System.out.println(lettuce + " lettuce @ $1.02 = $" + (lettuce*1.02));
        System.out.println(milk + " milk @ $1.25 = $" + (milk*1.25));
        System.out.println(cookies + " cookie @ $3.00 = $" + (cookies*3.00));
        System.out.println(apple + " apple @ $0.50 = $" + (apple*0.50));
        double subtotal = Math.round((apple*0.50+cookies*3.00+milk*1.25+lettuce*1.02+egg*0.30)*100);
        System.out.println("\nSubtotal: $" + subtotal/100);
        double tax = Math.round((0.15*(subtotal/100))*100);
        System.out.println("Tax: $" + (tax/100));
        double total = Math.round (((subtotal/100)*1.15)*100);
        System.out.println("Total: $" + (total/100));
        double pay = IBIO.inputDouble ("\nEnter the amount of money paid: $");
        if (pay<total/100)
            System.out.println ("That is not enough, you need an additional $" + (total/100-pay));
        else
            System.out.println ("Your change is $" + (pay-total/100));       
    }
}