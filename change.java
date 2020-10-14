package OOP;

class change extends CashCounter{
 
  public void Change(int amount,int[] quantity){
    
   //total notes available in cash counter
    int OneCount=quantity[7],FiveCount=quantity[6],TenCount=quantity[5],FiftyCount=quantity[4],
        HundredCount=quantity[3],TwoHundredCount=quantity[2],FiveHundredCount=quantity[1],
        TwoHousandCount=quantity[0];
   
    int One=0;
    int five=0;
    int ten=0;
    int fifty=0; 
    int Hundred=0;
    int TwoHundred=0;
    int FiveHundred=0;
    int TwoThousand=0;
   
    //algo for change Amount=MoneyPaid-bill
    while(amount!=0){
      if((amount >= 2000)  && TwoHousandCount!=0){ //if amount has more value than 2000 and there is note of 2000 in cash counter
        amount -= 2000; //amount is decreased by 2000
        TwoHousandCount--; //note available in cash counter is decreased by 1
        TwoThousand++; // 2000rps note paid to customer
      }else if(amount >= 500 && FiveHundredCount!=0){
        amount -= 500;
        FiveHundredCount--;
        FiveHundred++;
      }else if(amount >= 200 && TwoHundredCount!=0){
        amount -= 200;
        TwoHundredCount--;
        TwoHundred++;
      }else if(amount >= 100  && HundredCount!=0){
        amount -= 100;
        HundredCount--;
        Hundred++;
      }else if(amount >= 50  && FiftyCount!=0){
        amount -= 50;
        FiftyCount--;
        fifty++;
      }else if(amount >= 10  && TenCount!=0){
        amount -= 10;
        TenCount--;
        ten++;
      }else if(amount >= 5 && FiveCount!=0){
        amount -= 5;
        FiveCount--;
        five++;
      }else {
        if (OneCount==0) {
          System.out.println("\nbalance="+(amount)); //if cash counter don't have change for the remaing amount then it is balance and here amount is remaing amount
          break;
        }
        amount -= 1;
        OneCount--;
        One++;
      }
    }
   //end of loops
    System.out.println("**paid**"); //amount given to customer
    if(TwoThousand!=0) System.out.println("2000 x"+TwoThousand);//if there is no note for this value then is is not displayed
    if(FiveHundred!=0) System.out.println(" 500 x"+FiveHundred);
    if(TwoHundred!=0)  System.out.println(" 200 x"+TwoHundred);
    if(Hundred!=0)     System.out.println(" 100 x"+Hundred);
    if(fifty!=0)       System.out.println("  50 x"+fifty);
    if(ten!=0)         System.out.println("  10 x"+ten);
    if(five!=0)        System.out.println("   5 x"+five);
    if(One!=0)         System.out.println("   1 x"+One);
  }  
}
