public class Hesap{

    private String username;
    private String password;
    private int balance;
    
    //default constructor
     public Hesap(){
         this.username = "";
         this.password = "";
         this.balance = 0;
     }

    public Hesap(String username,String password,int balance){
         this.username = username;
         this.password = password;
         this.balance = balance;
    }

    //getter-setters
    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public int getBalance() {return balance;}

    public void setBalance(int balance) {this.balance = balance;}

    public void addBalance(int amount){
         balance += amount;
        System.out.println("New balance is : " + balance);
    }

    public void withdrawMoney(int amount){
         if(amount > balance){
             System.out.println("Your balance is not enough!!");
         }
         else{
             balance -= amount;
             System.out.println("Your new balance is: " + balance);
         }
    }




}