package tyzden42;

public class du {
    public static void main(String[] args) {
        ParneNeparne( 2000);
    }
    static void ParneNeparne(int x){
        if(x % 2==0)
        {
            System.out.println("Cislo"+ x +"je parne");
        }
         else
        {
            System.out.println("Cislo je neparne");
        }
    }
}
