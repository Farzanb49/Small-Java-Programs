public class muffins{
    public static void main (String args []){
        System.out.println ("Welcome to Millie's Marvelous Muffins!\n\n**If you like muffins, ours are marvelous!**");
        int numofmuffins = IBIO.inputInt ("How many muffins would you like? ");
        int price = 1;
        if (numofmuffins < 10)price = 5;
            else if (numofmuffins < 20)price = 3;
            else if (numofmuffins < 40)price = 2;
        System.out.println ("The cost per muffin is $" + price + ".\nThe total cost is $" + price * numofmuffins+ ".");    
    }}