//William Borum
//CS 220
//Exercise 11.3

public class CheckingAccount extends Account {
  private double overdraftLimit = 0;
  
  CheckingAccount() {
    
  }
  
  CheckingAccount(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }
  
  public double getOverdraftLimit() {
    return overdraftLimit;
  }
  
  //Withdraw money from the account, account for overdraft
  @Override
  public void withdraw(double amount) {
    double balance = super.getBalance();
    if(balance - amount >= -overdraftLimit) super.setBalance(balance - amount);
    else System.out.println("Withdrawal failed, hit overdraft limit.");
  }
  
  
  public String toString() {
    return super.toString() + ", and it has a " + getOverdraftLimit() + " dollar overdraft limit.";
  }
  
  
  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount(100);
    
    checkingAccount.setID(56);
    checkingAccount.setBalance(45);
    System.out.println(checkingAccount.toString());
    checkingAccount.withdraw(150);
    System.out.println(checkingAccount.toString());
    checkingAccount.withdraw(65);
    System.out.println(checkingAccount.toString());
  }
}