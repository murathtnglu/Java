
import java.util.Scanner;
public class Login{

    public boolean checkLogin(Hesap hesap){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if(username.equals(hesap.getUsername()) && password.equals(hesap.getPassword())){return true;}
        else return false;
    }
}