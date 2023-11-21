import java.util.Scanner;

public class ATM{

    public void execute(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        int trials = 3;

        while(true){
            if(login.checkLogin(hesap)){
                System.out.println("Succesful Login.");
                break;
            }
            else{
                System.out.println("Wrong username or password, please try again..");
                trials -= 1;
                System.out.println("You have " + trials + " attempts left.");
            }

            if (trials == 0){
                System.out.println("Ypu dont have any more attempts.");
                return;
            }
        }

        System.out.println("******************************************");
        String choice = "1-Show my balance\n" +
                "2-Add Balance\n"+
                "3-Withdraw Money\n"+
                "Press 'q' for leaving the program.";

        System.out.println(choice);
        System.out.println("******************************************");


        while(true){

            System.out.println("Please choose an operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")){break;}
            else if(operation.equals("1")){
                System.out.println(hesap.getBalance());
            }
            else if(operation.equals("2")){
                System.out.println("Please enter the amount you want to add: ");
                int amount = scanner.nextInt();
                hesap.addBalance(amount);
            }
            else if (operation.equals("3")){
                System.out.println("Please enter the amount you want to withdraw: ");
                int amount = scanner.nextInt();
                hesap.withdrawMoney(amount);
            }
            else{
                System.out.println("Invalid operation...");
            }

        }


    }







}