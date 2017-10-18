import java.util.Scanner;
//Jonathan Ko
//assignment 6 problem 2
public class companies
{//start class
	public static void main(String[] args)
	{//start class
		//declare input
			String name,again;
			int numbPpl,rate,totalPpl=0,numbCompany=1;
			int pass=0;
			double price,totalPrice=0,avg;
			//read input
			do
			{
				Scanner input = new Scanner(System.in);
				System.out.print("Enter company name: ");
				name=input.nextLine();
				System.out.print("How many registrants? ");
				numbPpl=Integer.parseInt(input.nextLine());
				totalPpl+=numbPpl;
				System.out.println("");
				//figure out rate
				if(numbPpl>9)
				{
					rate=90;
				}
				else if(numbPpl>0&&numbPpl<4)
				{
					rate=150;
				}
				else
				{
					rate=100;
				}
				//calculate price per person
				price=numbPpl*rate;
				totalPrice+=price;
				//print output of loop
				System.out.println("INVOICE");
				System.out.println("Company name: "+name);
				System.out.printf("Cost per registrant: %.2f%n",(double)rate);
				System.out.printf("Total for "+numbPpl+" people is $%.2f%n",price);
				System.out.println("");
				//ask again
				System.out.print("Another registration? (Y/N) ");
				again=input.nextLine();
				again=again.toUpperCase();
				switch(again)
				{
				case "Y":
					numbCompany++;
					pass=1;
					break;
				case "N":
					pass=0;
					break;
				}
				System.out.println("");
			}while(pass!=0);
			avg=(double)totalPrice/(double)totalPpl;
			System.out.println("REGISTRATION SUMMARY");
			System.out.println("Number of compaines registered: "+numbCompany);
			System.out.println("Total number of people registered "+totalPpl);
			System.out.printf("Total charge $%.2f%n", totalPrice);
			System.out.printf("Average charge per person: $%.2f%n", avg);
			System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
/*
test 1
Enter company name: Xerox
How many registrants? 4

INVOICE
Company name: Xerox
Cost per registrant: 100.00
Total for 4 people is $400.00

Another registration? (Y/N) y

Enter company name: Cisco
How many registrants? 2

INVOICE
Company name: Cisco
Cost per registrant: 150.00
Total for 2 people is $300.00

Another registration? (Y/N) n

REGISTRATION SUMMARY
Number of compaines registered: 2
Total number of people registered 6
Total charge $700.00
Average charge per person: $116.67
Programmed by Jonathan Ko

test 2
Enter company name: akljsdhfa
How many registrants? 10

INVOICE
Company name: akljsdhfa
Cost per registrant: 90.00
Total for 10 people is $900.00

Another registration? (Y/N) y

Enter company name: jashdfjasdf
How many registrants? 3

INVOICE
Company name: jashdfjasdf
Cost per registrant: 150.00
Total for 3 people is $450.00

Another registration? (Y/N) y

Enter company name: kajshdfajsdhf
How many registrants? 5

INVOICE
Company name: kajshdfajsdhf
Cost per registrant: 100.00
Total for 5 people is $500.00

Another registration? (Y/N) y

Enter company name: kjsdfaskjfdsdfh
How many registrants? 9

INVOICE
Company name: kjsdfaskjfdsdfh
Cost per registrant: 100.00
Total for 9 people is $900.00

Another registration? (Y/N) n

REGISTRATION SUMMARY
Number of compaines registered: 4
Total number of people registered 27
Total charge $2750.00
Average charge per person: $101.85
Programmed by Jonathan Ko
*/