public class bill
{
    public static void main (String args [])
    {
        new bill ();
    }
    
    public bill ()
    {
        int num = IBIO.inputInt("Num here: ");
        for (int i=2;i<100;i++){
        if (num!=i && num%i!=0){
            System.out.println(num + "is a prime number");
        }
    }
    }
}