import java.util.Scanner;

public class company
{//start class

	public static void main(String[] args)
	{//start main
		String name,register;
		int numbPpl,totalPpl=0,valid=0,totalCompanies=1;
		double avg,totalChargePpl,chargeRate,totalPrice=0;
		//Read input
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.print("Enter company name: ");
			name=input.nextLine();
			System.out.print("How many registrants? ");
			numbPpl=Integer.parseInt(input.nextLine());
			totalPpl+=numbPpl;
			System.out.println("");
			System.out.println("INVOICE");
			System.out.println("Company: "+name);
			if(numbPpl>9)
			{
				chargeRate=90;
			}
			else if(numbPpl>0&&numbPpl<4)
			{
				chargeRate=150;
			}
			else
			{
				chargeRate=100;
			}
			totalChargePpl=chargeRate*numbPpl;
			totalPrice+=totalChargePpl;
			System.out.printf("Cost per registrant: $%.2f%n",chargeRate);
			System.out.printf("Total for "+numbPpl+" people is $%.2f%n",totalChargePpl);
			System.out.println("");
			System.out.print("Another registration? (Y/N) ");
			register=input.nextLine();
			register.toUpperCase();
		}while(register!="Y");
		//print output
		System.out.println("REGISTRATION SUMMARY");
		avg=(double)totalPrice/(double)totalPpl;
		System.out.println(totalCompanies);
		System.out.println(totalPpl);
		System.out.println(totalPrice);
		System.out.println(avg);
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
