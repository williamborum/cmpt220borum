//William Borum
//CS 220
//Exercise 11.3

public class SavingsAccount extends Account {
  private double overdraftLimit = 0;
  
  SavingsAccount() {
    
  }
  
  SavingsAccount(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }
  
  public double getOverdraftLimit() {
    return overdraftLimit;
  }
  
  //Withdraw money from the account, warn customer of fees
  @Override
  public void withdraw(double amount) {
    double balance = super.getBalance();
    if(balance - amount < -overdraftLimit) System.out.println("Overdrafted, may be subject to fees.");
    super.setBalance(balance - amount);
  }
  
  
  public String toString() {
    return super.toString() + ", and it has a " + getOverdraftLimit() + " dollar overdraft limit.";
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