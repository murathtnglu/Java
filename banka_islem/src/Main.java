public class Main {

    public static void main(String args[]){

        ATM atm = new ATM();
        Hesap hesap = new Hesap("murathatunoglu", "123123", 10000);
        atm.execute(hesap);
        System.out.println("Leaving the program...");

    }


}