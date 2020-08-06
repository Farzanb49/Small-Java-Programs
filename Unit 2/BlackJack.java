
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack
{
    public static void main(String args[]){
        new BlackJack();
    }

    public BlackJack(){
        int total = 0;
        int card1 = (int)(Math.random()*10 + 1);
        int card2 = (int)(Math.random()*10 + 1);
        total = card1 + card2;
        System.out.println("Card one is: "+card1+"\nYour second card is: "+card2);
        System.out.println("Your total is: "+total);

        if(total == 21)
            System.out.println("BlackJack!");
        else if(total > 21){
            System.out.println("You went over 21 points you have lost!");}
        while(total < 21){
            String cont = IBIO.inputString("Would you like another card?");
            if(cont.toLowerCase().equals("yes")){
                int card3 = (int)(Math.random()*10 + 1);
                total = total + card3;
                System.out.println("Card 3 is: "+card3);
                System.out.println("Your total is: "+total);

                if(total > 21){
                    System.out.println("you have over 21 points, You lose!");
                    break;}
            }
            else
                break;
        }
        int dcard1 = 0;
        int dcard2 = 0;
        int dtotal = 0; 
        if(total<=21){
            dcard1 = (int)(Math.random()*10 +1);
            dcard2 = (int)(Math.random()*10 +1);
            dtotal = card1 + card2; 
            while(dtotal < 16){
                int card3 = (int)(Math.random()*10 + 1);
                dtotal = dtotal + card3;
            }
        }
        if(total <= 21){
            if(dtotal > 21)
                System.out.println("\nDealer went over 21, bust");
            else if(total > dtotal){
                System.out.println("\nDealer has: "+dtotal);
                System.out.println("You win!");}
            else if(total < dtotal){
                System.out.println("\nDealer has: "+dtotal);
                System.out.println("Dealer wins!");}
            else
                System.out.println("\nYou tied");}
        String redo = IBIO.inputString("\nWould you like to try again?");
        if(!(redo.equals("yes") || redo.equals("y")))
            System.out.println("\nOK, See you next time!");
        else
            while(redo.equals("yes") || redo.equals("y")){
                 total = 0;
                 card1 = (int)(Math.random()*10 + 1);
                 card2 = (int)(Math.random()*10 + 1);
                total = card1 + card2;
                System.out.println("Card one is: "+card1+"\nYour second card is: "+card2);
                System.out.println("Your total is: "+total);

                if(total == 21)
                    System.out.println("\nBlackJack!");
                else if(total > 21){
                    System.out.println("\nYou went over 21 points you have lost!");}
                while(total < 21){
                    String cont = IBIO.inputString("\nWould you like another card?");
                    if(cont.toLowerCase().equals("yes")){
                        int card3 = (int)(Math.random()*10 + 1);
                        total = total + card3;
                        System.out.println("Card 3 is: "+card3);
                        System.out.println("Your total is: "+total);

                        if(total > 21){
                            System.out.println("you have over 21 points, You lose!");
                            break;}
                    }
                    else
                        break;
                }
                dcard1 = 0;
                dcard2 = 0;
                dtotal = 0; 
                if(total<=21){
                    dcard1 = (int)(Math.random()*10 +1);
                    dcard2 = (int)(Math.random()*10 +1);
                    dtotal = card1 + card2; 
                    while(dtotal < 16){
                        int card3 = (int)(Math.random()*10 + 1);
                        dtotal = dtotal + card3;
                    }
                }
                if(total <= 21){
                    if(dtotal > 21)
                        System.out.println("\nDealer went over 21, bust");
                    else if(total > dtotal){
                        System.out.println("\nDealer has: "+dtotal);
                        System.out.println("You win!");}
                    else if(total < dtotal){
                        System.out.println("\nDealer has: "+dtotal);
                        System.out.println("Dealer wins!");}
                    else
                        System.out.println("\nYou tied");}
                redo = IBIO.inputString("\nWould you like to try again?");
                if(!(redo.equals("yes") || redo.equals("y"))){
                    System.out.println("\nOK, See you next time!");
                break;}

            }
    }
}