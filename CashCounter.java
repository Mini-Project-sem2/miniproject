package OOP;

import java.util.Scanner;

public class CashCounter  {
  
  //fill notes or coin in cash counter
  public int OneCount=0,FiveCount=0,TenCount=0,FiftyCount=0,HundredCount=0,TwoHundredCount=0,FiveHundredCount=0,TwoHousandCount=0;

  public int[] fillCounter(){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter-1 to stop");
    System.out.println("Enter the no of notes to be filled");
    
    int option=0;
    while (option!=-1) {
      System.out.println("\nEnter amount");
      option=sc.nextInt(); 
      if(option==-1) break;//to get out of loop
      switch (option) {
        case 2000: //value of currency
          System.out.println("Enter Quantity:"); //no of notes to be added
          TwoHousandCount +=sc.nextInt();//total note availabe in cash counter
          break;
        case 500:
          System.out.println("Enter Quantity:");
          FiveHundredCount +=sc.nextInt();
          break;
        case 200:
          System.out.println("Enter Quantity:");
          TwoHundredCount +=sc.nextInt();
          break;
        case 100:
          System.out.println("Enter Quantity:");
          HundredCount +=sc.nextInt();
          break;
        case 50:
          System.out.println("Enter Quantity:");
          FiftyCount +=sc.nextInt();
          break;
        case 10:
          System.out.println("Enter Quantity:");
          TenCount +=sc.nextInt();
          break;
        case 5:
          System.out.println("Enter Quantity:");
          FiveCount +=sc.nextInt();
          break;
        case 1:
          System.out.println("Enter Quantity:");
          OneCount +=sc.nextInt();
          break;
        default:
          System.out.println("Invalid amount");
          break;
      }
    }

    sc.close();
    
    //array of available quantity of currenct to pass value
    int a[]={TwoHousandCount,FiveHundredCount,TwoHundredCount,HundredCount,FiftyCount,TenCount,FiveCount,OneCount};

    return a;

  }
}
