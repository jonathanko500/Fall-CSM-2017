import java.util.Scanner;
//problem 1
public class Disketts 
{//start class
	public static void main(String[] args) 
	{//start main
		// declare variables
		int disks;
		double total,rate;
		String centValue;
		//read variable
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Diskettes R Us");
		System.out.println("Order 25 or more and save!");
		System.out.print("How many diskettes do you want to buy? ");
		disks=Integer.parseInt(input.nextLine());
		//calculate total
		if(disks<25)
		{
			rate=0.5;
			total=disks*rate;
		}
		else
		{
			rate=0.3;
			total=disks*rate;
		}
		//display output
		centValue=String.format(" disketts at $%.2f",rate);
		System.out.println(disks+centValue+" each");
		System.out.printf("Your total is $%.2f",total);
		}//end main
}//end class


/*test 1
 * Welcome to Diskettes R Us
 * Order 25 or more and save!
 * How many diskettes do you want to buy? 10
 * 10 disketts at $0.50 each
 * Your total is $5.00
 * 
 * test 2
 * Welcome to Diskettes R Us
 * Order 25 or more and save
 * How many diskettes do you want to buy? 45
 * 45 disketts at $0.30 each
 * Your total is $13.50
 * 
 * test 3
 * Welcome to Diskettes R Us
 * Order 25 or more and save!
 * How many diskettes do you want to buy? 25
 * 25 disketts at $0.30 each
 * Your total is $7.50
 * 
 */
