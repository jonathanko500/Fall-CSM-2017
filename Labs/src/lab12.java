import java.util.Scanner;

public class lab12
{//start class

	public static void main(String[] args)
	{//start main
		//declare input
		int total, total1=0, total2=0,sale1, sale2;
		//region 1
		//read input
		Scanner input= new Scanner(System.in);
		System.out.print("Enter region 1 sales or -1 to exit: ");
		sale1=Integer.parseInt(input.nextLine());
		while(sale1!=-1)
		{
			total1=total1+sale1;
			System.out.print("Enter region 1 sales or -1 to exit; ");
			sale1=Integer.parseInt(input.nextLine());
		}
		System.out.printf("Region 1 total sales: $%.2f%n",(double)total1);
	}

}
