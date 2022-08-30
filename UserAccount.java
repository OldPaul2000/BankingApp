package bankingApp2;

import bankingApp.User;

public class UserAccount{
	  
	  private User user;
      private int accountNumber;
      private int deletingCode;
      private String currency;
      private double balance;
      
      public UserAccount(User user, int deletingCode, String currency, double balance) {
   	   this.user = user;
   	   this.deletingCode = deletingCode;
   	   this.currency = currency.toUpperCase();
   	   this.balance = balance;
      }
      
      public void setAccountNumber(int number) {
   	   this.accountNumber = number;
      }
      
      public void setDeletingCode(int code) {
   	   this.deletingCode = code;
      }
      
      public void setCurrency(String currency) {
   	   this.currency = currency;
      }
      
      public void setBalance(double balance) {
   	   this.balance = balance;
      }
      
      public String getUserName() {
   	   return user.getFirstName() + " " + user.getLastName();
      }
      
      public int getAccountNumber() {
   	   return accountNumber;
      }
      
      public int getDeletingCode() {
   	   return deletingCode;
      }
      
      public String getCurrency() {
   	   return currency;
      }
      
      public double getBalance() {
   	   return balance;
      }
      
      public String toString() {
   	   return "User complete name:" + user.getFirstName() + " " + user.getLastName() + "\n" +
                 "Account number:" + accountNumber + "\n" + 
                 "Deleting code:" + deletingCode + "\n" +
                 "Currency:" + currency + "\n" +
                 "Balance:" + balance + "\n";
      }

}
