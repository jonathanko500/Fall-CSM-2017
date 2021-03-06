import java.util.Scanner;
//problem 1
public class sevice 
{//start class
	public static void main(String[] args) 
	{//start main
		// declare variable
		double salary, service, sales,serviceBonus,serviceBonusPay;
		double salesBonus,total;
		//String totalSalary,totalService,totalBonus,totalPay;
		//read inputs
		Scanner input=new Scanner(System.in);
		System.out.print("Enter monthly base salary:  ");
		salary=Double.parseDouble(input.nextLine());
		System.out.print("Enter years of service:  ");
		service=Double.parseDouble(input.nextLine());
		System.out.print("Enter monthly sales:  ");
		sales=Double.parseDouble(input.nextLine());
		//calculate serviceBonus
		if (service>5)
		{
			serviceBonus=20;
		}
		else
		{
			serviceBonus=10;
		}
		//calaculate salesBonus
		if (sales>=10000)
		{
			salesBonus=sales*0.06;
		}
		else if (sales<5000)
		{
			salesBonus=0;
		}
		else
		{
			salesBonus=sales*0.03;
		}
		//calculate service bonus pay
		serviceBonusPay=service*serviceBonus;
		//calcutlate total
		total=salary+serviceBonusPay+salesBonus;
		//display outputs
		System.out.printf("Base pay         $% .2f%n",salary);
		System.out.printf("Service bonus    $  %.2f%n", serviceBonusPay);
		System.out.printf("Sales bonus      $ %.2f%n", salesBonus);
		System.out.printf("Total pay        $ %.2f%n",total);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
/*
 *test 1
 *Enter monthly base salary:  700
 *Enter years of service:  2
 *Enter monthly sales:  6000
 *Base pay         $ 700.00
 *Service bonus    $  20.00
 *Sales bonus      $ 180.00
 *Total pay        $ 900.00
 *Programmed by Jonathan Ko
 * 
 * Enter monthly base salary:  800
 * Enter years of service:  7
 * Enter monthly sales:  10000
 * Base pay         $ 800.00
 * Service bonus    $  140.00
 * Sales bonus      $ 600.00
 * Total pay        $ 1540.00
 * Programmed by Jonathan Ko
 * 
 * test 3
 * Enter monthly base salary:  500
 * Enter years of service:  3
 * Enter monthly sales:  3000
 * Base pay         $ 500.00
 * Service bonus    $  30.00
 * Sales bonus      $ 0.00
 * Total pay        $ 530.00
 * Programmed by Jonathan Ko 
*/