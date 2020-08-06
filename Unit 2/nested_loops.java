
public class nested_loops
{
    public static void main(String args[]){
        new nested_loops();
    }

    public nested_loops(){
        String method = IBIO.inputString("which task would you like to access");
        if(method.equals("suits"))
            nested();
        else if(method.equals("table"))
            table();
        else if(method.equals("tape"))
            tape();
        else
            pyramid();
    }

    public void nested(){
        for(int i = 1 ; i <=4 ; i++){
            if(i == 1){
                for(int j=1 ; j<=13 ;j++){
                    if(j == 1)
                        System.out.println("Ace of clubs");
                    else if(j == 11)
                        System.out.println("Jack of clubs");
                    else if(j == 12)
                        System.out.println("Queen of clubs");
                    else if(j == 13)
                        System.out.println("King of clubs");
                    else
                        System.out.println(j + " of clubs");
                }
            }
            else if(i == 2){
                for(int n=1 ; n<=13 ; n++){
                    if(n == 1)
                        System.out.println("Ace of Hearts");
                    else if(n == 11)
                        System.out.println("Jack of Hearts");
                    else if(n == 12)
                        System.out.println("Queen of Hearts");
                    else if(n == 13)
                        System.out.println("King of Hearts");
                    else
                        System.out.println(n + " of Hearts");
                }
            }
            else if(i == 3){
                for(int l=1 ; l<=13 ; l++){
                    if(l == 1)
                        System.out.println("Ace of Diamonds");
                    else if(l == 11)
                        System.out.println("Jack of Diamonds");
                    else if(l == 12)
                        System.out.println("Queen of Diamonds");
                    else if(l == 13)
                        System.out.println("King of Diamonds");
                    else
                        System.out.println(l + " of Diamonds");
                }
            }
            else{
                for(int m=1 ; m<=13 ; m++){
                    if(m == 1)
                        System.out.println("Ace of Spades");
                    else if(m == 11)
                        System.out.println("Jack of Spades");
                    else if(m == 12)
                        System.out.println("Queen of Spades");
                    else if(m == 13)
                        System.out.println("King of Spades");
                    else
                        System.out.println(m + " of Spades");
                }
            }
        }
    }

    public void table(){
        for(int i = 1 ; i<=10 ; i++){
            for(int j = 1 ; j<=10 ; j++){
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("");
        }
    }

    public void tape(){
        for(int i = 1 ; i <=7 ; i++){
            System.out.println("+/\\/\\/\\/\\/\\+");
            for(int j = 1 ; j <= 8 - i ; j++){
                System.out.println("|          |");
            }
            System.out.println("+\\/\\/\\/\\/\\/+");
            System.out.println("");
        }
    }

    public void pyramid(){
        for(int i = 1 ; i<=4 ; i++){
               for(int j = 0 ; j < 4 - i ; j++){
                System.out.print(" ");
            }
            for(int n = 1 ; n<= i + i - 1 ; n++){
                System.out.print("*");
            }
            System.out.println ("");
                    }
    }
}
