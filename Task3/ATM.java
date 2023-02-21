//ATM

import java.util.* ;

public class ATM
{
	public static void main(String [] array) 
	{
		
		System.out.println("\n\t\t\tATM Management System\n------------------------------") ;
		Scanner sc = new Scanner(System.in) ;
		
		while(true)
		{
			int pin = 1234 ;
			int balance = 10000 ;
			int depositAmount = 0 ;
			int withdrawAmount = 0 ;
			String customerName ;
		
			System.out.print("Enter your pin number :\t") ;
			int enteredPin = sc.nextInt() ;
		
			if(enteredPin == pin)
			{
				System.out.print("\nEnter your name :\t") ;
				customerName = sc.next() ;
				System.out.println("\nWelcome " + customerName) ;
				while(true)
				{
					System.out.print("1 : Check your balance\n2 : Deposit Amount\n3 : Withdraw Amount\n4 : Get Receipt\n5 : Exit\nEnter your choice of action :\t") ;
					int userChoice = sc.nextInt() ;
				
					switch(userChoice)
					{
						case 1 :
							System.out.println("\nYour current balance :\t" + balance + "\n--------------------\n") ;
							break ;
						case 2 :
							System.out.print("\nEnter the Deposit amount :\t") ;
							depositAmount = sc.nextInt();
							balance += depositAmount ;
							System.out.println("\nStatus : Success\nSuccessfully Deposited the amount to your account.\nAvailable Balance : " + balance + "\n--------------------\n") ;
							break ;
						case 3 :
							System.out.print("\nEnter Withdraw Amount :\t") ;
							withdrawAmount = sc.nextInt() ;
							if(withdrawAmount > balance)
							{
								System.out.println("\nInsufficient Account Balance\nAvailable balance is " + balance + " only\n--------------------\n") ;
							}
							else
							{
								balance -= withdrawAmount ;
								System.out.println("\nStatus : Success\nSuccessfully Withdrawn the amount from your account.\nAvailable Balance :\t" + balance + "\n--------------------\n") ;
							}
							break ;
						case 4 :
							System.out.println("\nWelcome to our ATM\nAvailable Balance :\t" + balance + "\nTotal Amount Deposited :\t" + depositAmount + "\nTotal Withdraw Amount :\t" + withdrawAmount + "\nThank You !!!\n--------------------\n") ;
							break ;
						case 5 :
							System.out.println("\n--------------------\nThank You !!!\n--------------------\n") ;
							break ;
						default :
							System.out.println("\n--------------------\nInvalid Choice\n--------------------\n") ;
					}
					if(userChoice == 5)
					{
						break ;
					}
				}
			}
			else
			{
				System.out.println("\n--------------------\nIncorrect PIN number\nPlease Enter a valid PIN number\n--------------------\n") ;
			}
			System.out.println("\n--------------------\nDo you want to do another transaction? then press 1 else press any other number to exit") ;
			int continueChoice = sc.nextInt() ;
			if(continueChoice != 1)
			{
				System.out.println("\n--------------------\nThank You !!!\n--------------------\n") ;
				break ;
			}
		}
		System.out.println("------------------------------") ;
		sc.next() ;
	}
}
