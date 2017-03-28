//William Borum
//CS 220
//Exercise 9.7
import java.util.Date;

public class Account {
  private int id = 0;
  private double balance = 0;
  private double annualInterestRate = 0;
  private Date dateCreated = new Date();
  
  //Create Account object
  Account() {
  }
  //Create Account object
  Account(int newID, double newBalance) {
    id = newID;
    balance = newBalance;
  }
  //Returns ID
  public int getID() {
    return id;
  }
  //Returns balance
  public double getBalance() {
    return balance;
  }
  //Returns annual interest rate
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }
  //Sets ID
  public void setID(int newID) {
    id = newID;
  }
  //Sets balance
  public void setBalance(double newBalance) {
    balance = newBalance;
  }
  //Sets annual interest rate
  public void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate/100.0;
  }
  //Gets the date the account was created
  public Date getDateCreated() {
    return dateCreated;
  }
  //Gets the monthly interest rate
  public double getMonthlyInterestRate() {
    return annualInterestRate/12.0;
  }
  //Gets the monthly interest
  public double getMonthlyInterest() {
    return (annualInterestRate/12.0) * balance;
  }
  //Withdraw money from the account
  public void withdraw(double amount) {
    balance -= amount;
  }
  //Deposit money into the account
  public void deposit(double amount) {
    balance += amount;
  }
  
  public String toString() {
    return "The balance in the account is " + getBalance() + ", the monthly interest is " + 
           getMonthlyInterest() + ", and the date it was created is " + getDateCreated();
  }
  
  public static void main(String[] args) {
    //Create account object with ID 1122 and initial balance of $20,000
    Account a = new Account(1122, 20000);
    //Set the annual interest to 4.5%
    a.setAnnualInterestRate(4.5);
    //Withdraw $2,500
    a.withdraw(2500);
    //Deposit $3,000
    a.deposit(3000);
    //Display results
    System.out.println(a.toString());
  }
}
