
/**
 * Write a description of class txt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class txt
{
    public static void main(String args[]){
        new txt();
    }

    public txt(){
        String msg = IBIO.inputString("Enter phrase: ");
        if(msg.equals("cu"))
            System.out.println("see you");
        else if(msg.equals(":-)"))
            System.out.println("I'm happy");
        else if(msg.equals(":-("))
            System.out.println("I'm unhappy");
        else if(msg.equals(";-)"))
            System.out.println("Wink");
        else if(msg.equals(":-P"))
            System.out.println("stick out my tongue");
        else if(msg.equals("(~.~)"))
            System.out.println("Sleepy");
        else if(msg.equals("ta"))
            System.out.println("totally awesome");
        else if(msg.equals("cuz"))
            System.out.println("Because");
        else if(msg.equals("ty"))
            System.out.println("thank-you");
        else if(msg.equals("yw"))
            System.out.println("you're welcome");
        else if(msg.equals("ttyl"))
            System.out.println("talk to you later");
        char cont = IBIO.inputChar("again? (y/n)");
        if(cont == 'y'){
            while(cont == 'y'){
                msg = IBIO.inputString("Enter phrase: ");
                if(msg.equals("cu"))
                    System.out.println("see you");
                else if(msg.equals(":-)"))
                    System.out.println("I'm happy");
                else if(msg.equals(":-("))
                    System.out.println("I'm unhappy");
                else if(msg.equals(";-)"))
                    System.out.println("Wink");
                else if(msg.equals(":-P"))
                    System.out.println("stick out my tongue");
                else if(msg.equals("(~.~)"))
                    System.out.println("Sleepy");
                else if(msg.equals("ta"))
                    System.out.println("totally awesome");
                else if(msg.equals("cuz"))
                    System.out.println("Because");
                else if(msg.equals("ty"))
                    System.out.println("thank-you");
                else if(msg.equals("yw"))
                    System.out.println("you're welcome");
                else if(msg.equals("ttyl"))
                    System.out.println("talk to you later");
                cont = IBIO.inputChar("again? (y/n)");
                if(cont == 'n')
                    break;
            }

        }
    }
}

