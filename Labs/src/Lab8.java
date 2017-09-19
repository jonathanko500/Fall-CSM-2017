import java.util.Scanner;
//Jonathan Ko
//lab 8
public class Lab8
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		int years;
		double salary,bonus;
		//read inputs
		Scanner input= new Scanner(System.in);
		System.out.print("Employee salary?  ");
		salary=Double.parseDouble(input.nextLine());
		System.out.print("Years worked? ");
		years=Integer.parseInt(input.nextLine());
		//calculate bonus
		if (years>15) {
			System.out.println("You qualify for a 12.0 percent bonus!");
			bonus=salary*0.12;
		}
		else {
			if(years>=5 && years<=15) {
				System.out.println("You qualify for a 7.0 percent bonus!");
				bonus=salary*0.07;
			}
			else {
				System.out.println("You qualify for a 4.0 percent bonus!");
				bonus=salary*0.04;
			}
		}
		System.out.printf("Your bonus is $%.2f%n",bonus);
	}//end main
}//end class
/*
 *test 1
 *Employee salary?  40000
 *Years worked? 2
 *You qualify for a 4.0 percent bonus!
 *Your bonus is $1600.00
 * 
 * test 2
 * Employee salary?  50000
 * Years worked? 5
 * You qualify for a 7.0 percent bonus!
 * Your bonus is $3500.00
 * 
 * test 3
 * Employee salary?  60000
 * Years worked? 20
 * You qualify for a 12.0 percent bonus!
 * Your bonus is $7200.00
 * 
 * test 4
 * Employee salary?  45000
 * Years worked? 15
 * You qualify for a 7.0 percent bonus!
 * Your bonus is $3150.00
*/
