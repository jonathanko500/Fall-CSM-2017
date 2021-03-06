import java.util.Scanner;
//Jonathan Ko
//lab 7 
public class Lab7 
{//start of class
	public static void main (String []args)
	{//start of main
		//declare variable
		int price, quantity;
		double subtotal, discount, total;
		String subOutput, disOutput,totOutput;
		//read input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter product price: ");
		price=Integer.parseInt(input.nextLine());
		System.out.print("Enter quantity purchased: ");
		quantity=Integer.parseInt(input.nextLine());
		//calculate subtotal
		subtotal=price*quantity;
		//calculate discount
		if(subtotal<500){
			discount=subtotal*0.03;
		}
		else{
			discount=subtotal*0.05;
		}
		//calculate total
		total=subtotal-discount;
		//display output
		subOutput=String.format("Subtotal: $%5.2f", subtotal);
		disOutput=String.format("Discount: $%6.2f", discount);
		totOutput=String.format("Total:    $%5.2f", total);
		System.out.println(subOutput);
		System.out.println(disOutput);
		System.out.println(totOutput);
		System.out.print("Programmed by Jonathan Ko");
	}//end main
}//end class

/*
 * test 1
 * Enter product price: 20
 * Enter quantity purchased: 10
 * Subtotal: $200.00
 * Discount: $  6.00
 * Total:    $194.00
 * Programmed by Jonathan Ko
 * 
 * test 2
 * Enter product price: 20
 * Enter quantity purchased: 40
 * Subtotal: $800.00
 * Discount: $ 40.00
 * Total:    $760.00
 * Programmed by Jonathan Ko
 * 
 * test 3
 * Enter product price: 5
 * Enter quantity purchased: 100
 * Subtotal: $500.00
 * Discount: $ 25.00
 * Total:    $475.00
 * Programmed by Jonathan Ko
 */

