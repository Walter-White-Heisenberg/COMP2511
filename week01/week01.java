public class Account {
  // instance variable
  // if we dont assign value to variables, java would assign initial value to the variables
  // e.g. String=NULL, int=0, float=0.0
  String name;
  int accountNo;
  float balance;
  
  // instance method
  // any method/behaviours that are created inside of the class is called instance method
  public void deposit(float amt) {
    this.balance += amt;
  }
  
  // constructor
  // constructor eliminate default values
  public Account(String aname, int acctno, float bal) {
    this.name = aname;
    this.accountNo = acctNo;
    this.balance = bal;
  }
  
  public static void main(String[] args) {
    Account a1 = new Account("John", 1089023, 250);
  }
}
