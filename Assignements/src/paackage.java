import java.util.Scanner;
//problem 2
public class paackage
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		double weight,cost = 0,total;
		int valid=1;
		//read inputs
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the weight of the package in kg: ");
		weight=Double.parseDouble(input.nextLine());
		//determine cost per kg
		if (weight>5)
		{
			cost=2.45;
		}
		else if(weight<2.5&&weight>0)
		{
			cost=3.5;
		}
		else if(weight<0)
		{
			valid=0;
		}
		else
		{
			cost=2.85;
		}//end if
		//if valid data
		if(valid==1){
			//calculate total
			total=cost*weight;
			//display outputs
			System.out.println("");
			System.out.printf("For a package weighing %.2f kg%n", weight);
			System.out.printf("Cost per kg is $%.2f%n", cost);
			System.out.printf("Total shipping cost: $%.2f%n",total);
		}
		else
		{
			System.out.println("Invalid weight.");
		}
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class

/*test 1
 *Enter the weight of the package in kg: 2
 *
 *For a package weighing 2.00 kg
 *Cost per kg is $3.5
 *Total shipping cost: $7.00
 *Programmed by Jonathan Ko 
 * 
 * test 2
 * Enter the weight of the package in kg: 5
 * 
 * For a package weighing 5.00 kg
 * Cost per kg is $2.85
 * Total shipping cost: $14.25
 * Programmed by Jonathan Ko
 * 
 * test 3
 * Enter the weight of the package in kg: 6
 * 
 * For a package weighing 6.00 kg
 * Cost per kg is $2.45
 * Total shipping cost: $14.70
 * Programmed by Jonathan Ko
 * 
 *  test 4
 *  Enter the weight of the package in kg: -4
 *  Invalid weight.
 *  Programmed by Jonathan Ko
 */