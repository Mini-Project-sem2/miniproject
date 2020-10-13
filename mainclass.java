package OOP;


public class mainclass {
  
  public static void main(String[] args) {
    CashCounter cash = new CashCounter();
    int quantity[]=cash.fillCounter();
    change bill = new change();
    bill.Change(2001,quantity);  
  }
}