import java.util.Scanner;
//Jonathan Ko
//Lab 9
public final class Lab9 
{//start class
	public static void main(String[] args) 
	{//start main
		// declare variable
		int months;
		int valid=1; //assuming good data
		double rate=1,total=0;
		String choice;
		//read inputs
		System.out.println("Health Club Membership Menu");
		System.out.println("A:  Adult");
		System.out.println("C:  Child");
		System.out.println("S:  Senior");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your choice: ");
		choice=input.nextLine();
		choice=choice.toUpperCase();
		//start switch
		switch (choice)
		{
		case "A":	rate=40;
		break;
		case "C":	rate=15;
		break;
		case "S": 	rate=25;
		break;
		default: 	System.out.println("Invalid letter.");
					valid=0;
		}
		//test for good data
		if(valid==1)
		{
			//enter months
			System.out.print("How many months? ");
			months=Integer.parseInt(input.nextLine());
			//calculate total
			total=months*rate;
			//print output
			System.out.printf(months+" months at $%.2f per month%n",rate);
			System.out.printf("Your total is $%.2f%n",total);
		}
	}//end main
}//end class
/*
 *test 1 
 * Health Club Membership Menu
 * A:  Adult
 * C:  Child
 * S:  Senior
 * Enter your choice: A
 * How many months? 3
 * 3 months at $40.00 per month
 * Your total is $120.00
 * 
 * test 2
 * Health Club Membership Menu
 * A:  Adult
 * C:  Child
 * S:  Senior
 * Enter your choice: c
 * How many months? 2
 * 2 months at $15.00 per month
 * Your total is $30.00
 * 
 * test 3
 * Health Club Membership Menu
 * A:  Adult
 * C:  Child
 * S:  Senior
 * Enter your choice: S
 * How many months? 
 * 6 months at $25.00 per month
 * Your total is $150.00
 * 
 * test 4
 * Health Club Membership Menu
 * A:  Adult
 * C:  Child
 * S:  Senior
 * Enter your choice: w
 * Invalid letter.
 */