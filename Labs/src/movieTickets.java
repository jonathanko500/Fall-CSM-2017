import java.util.Scanner;

//Jonathan Ko
//Lab 4 problem 1
public class movieTickets 
{//start class

	public static void main(String[] args) 
	{//start main
		//declare variables
		int adultTicket,childTicket,totalTickets;
		int adultSales,childSales,totalSales;
		//read inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of adult tickets: ");
		adultTicket=Integer.parseInt(input.nextLine());
		System.out.print("Enter the number of child tickets: ");
		childTicket=Integer.parseInt(input.nextLine());
		//calculate total tickets and total sales
		totalTickets=adultTicket+childTicket;
		adultSales = adultTicket * 9;
		childSales = childTicket *5;
		totalSales = adultSales + childSales;
		//Print sales and total tickets
		System.out.println("Tickets sold: "+totalTickets);
		System.out.print("Total sales: $" +totalSales);
	}//end main
	
	/*
	 * test case 1
	 * 	Enter the number of adult tickets: 20
	 * 	Enter the number of child tickets: 10
	 * 	Tickets sold: 30
		Total sales: $230
		
		test case 2
		Enter the number of adult tickets: 5
		Enter the number of child tickets: 2
		Tickets sold: 7
		Total sales: $55
		
		test case 3
		Enter the number of adult tickets: 2
		Enter the number of child tickets: 0
		Tickets sold: 2
		Total sales: $18
		

	 */

}// end class



