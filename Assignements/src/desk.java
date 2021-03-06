import java.util.Scanner;
//problem 2
public class desk 
{//start class
	public static void main(String[] args) 
	{//start main
		// declare variables
		int length, width,drawers,area,drawersPrice;
		double total,tax,price;
		//read variable
		Scanner input=new Scanner(System.in);
		System.out.print("What is the length of the desk? ");
		length=Integer.parseInt(input.nextLine());
		System.out.print("What is the width of the desk? ");
		width=Integer.parseInt(input.nextLine());
		System.out.print("How many drawers? ");
		drawers=Integer.parseInt(input.nextLine());
		//calculate price
		area=length*width;
		drawersPrice=drawers*30;
		if(area<750)
		{
			price=200+drawersPrice;
		}
		else
		{
			price=250+drawersPrice;
		}
		//calculate tax
		tax=price*0.08;
		//calculate total
		total=price+tax;
		//display output
		System.out.println("Price Quote:");
		System.out.printf("Desk price      $  %.2f%n",price);
		System.out.printf("Tax             $   %.2f%n",tax);
		System.out.printf("Total due       $  %.2f%n",total);
	}//end main
}//start class
/*
 * test 1
 * What is the length of the desk? 30
 * What is the width of the desk? 20
 * How many drawers?  
 * Price Quote:
 * Desk price      $  260.00
 * Tax             $   20.80
 * Total due       $  280.80
 * 
 * Test 2
 * What is the length of the desk? 40
 * What is the width of the desk? 25
 * How many drawers? 4
 * Price Quote:
 * Desk price      $  370.00
 * Tax             $   29.60
 * Total due       $  399.60
 * 
 * Test 3
 * What is the length of the desk? 30
 * What is the width of the desk? 25
 * How many drawers? 5
 * Price Quote:
 * Desk price      $  400.00
 * Tax             $   32.00
 * Total due       $  432.00
 */