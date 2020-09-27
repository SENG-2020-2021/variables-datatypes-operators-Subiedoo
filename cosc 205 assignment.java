class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
     int daysdebtordefaulted= 20;
	 int amountdebtortopayperday= 10000;
	 int amountpaid= 85000;
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
  int totalamounttobepaid;
  int daysdebtorpaid;
  int amountdebtorislefttopay;
  int daysdebtornotpaid;

   // calculate and print total amount the debtor is to pay
  totalamounttobepaid= daysdebtordefaulted * amountdebtortopayperday;
  System.out.println( "$" + totalamounttobepaid);
  
   // calculate and print the days the debtor paid for
  daysdebtorpaid= amountpaid / amountdebtortopayperday;
  System.out.println(daysdebtorpaid + "days" );
   
  // calculate and print the amount whose day was not captured because the amount was incomplete
  int amountthatwasntcaptured;
  amountthatwasntcaptured= amountpaid % amountdebtortopayperday;
  System.out.println( "$" + amountthatwasntcaptured);

   // calculate and print amount the debtor is left to pay
  amountdebtorislefttopay= totalamounttobepaid - amountpaid;
  System.out.println( "$" + amountdebtorislefttopay);
  
   // calculate and print days the debtor has not payed for
  daysdebtornotpaid = daysdebtordefaulted - daysdebtorpaid;
  System.out.println(daysdebtornotpaid + "days" );
  


   //kindly remove the statement below when you are done with the assignment
    
  }
}