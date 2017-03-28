//William Borum
//CS 220
//Exercise 11.3

public class SavingsAccount extends Account {
  private double overdraftWarning = 0;
  
  SavingsAccount() {
    
  }
  
  SavingsAccount(double overdraftWarning) {
    this.overdraftWarning = overdraftWarning;
  }
  
  public double getOverdraftWarning() {
    return overdraftWarning;
  }
  
  //Withdraw money from the account, warn customer of fees
  @Override
  public void withdraw(double amount) {
    double balance = super.getBalance();
    if(balance - amount < -overdraftWarning) System.out.println("Overdrafted, may be subject to fees.");
    super.setBalance(balance - amount);
  }
  
  
  public String toString() {
    return super.toString() + ", and it has a " + getOverdraftWarning() + " dollar overdraft limit.";
  }
  
  
  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount(100);
    
    savingsAccount.setID(56);
    savingsAccount.setBalance(45);
    System.out.println(savingsAccount.toString());
    savingsAccount.withdraw(150);
    System.out.println(savingsAccount.toString());
    savingsAccount.withdraw(65);
    System.out.println(savingsAccount.toString());
  }
}