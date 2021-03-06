import java.util.Scanner;
//Jonathan Ko
//assignment 7 problem 3
public class avgScore 
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		int total,pass=0;
		String again;
		double avg;
		String grade;
		Scanner input= new Scanner(System.in);
		while(pass==0)
		{
			//get scores
			total=getScore();
			//calculates avg
			avg=calcAverage(total);
			System.out.printf("Your average is %.1f%n", avg);
			//calculates letter grade
			grade=calcGrade(avg);
			System.out.println("Your grade is "+grade);
			System.out.print("Another? " );
			again=input.nextLine();
			again=again.toUpperCase();
			switch(again)
			{
			case "N":
				pass=1;
				break;
			case "Y":
				System.out.println("");
			}
		}
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static int getScore()
	{//start method
		//declare variables
		int score,counter=0,total=0;
		//read input
		Scanner input= new Scanner(System.in);
		while(counter<3)
		{
			System.out.print("Enter test score: ");
			score=Integer.parseInt(input.nextLine());
			while(score>100)
			{
				System.out.print("Invalid, please re-enter: ");
				score=Integer.parseInt(input.nextLine());
			}
			counter++;	
			total+=score;
		}
		return total;
	}//end method
	public static double calcAverage(int score)
	{//start method
		double avg;
		avg=(double)score/3;
		return avg;
	}//end method
	public static String calcGrade(double avg)
	{//start method
		String letter=null;
		if(avg<60)
		{
			letter="F";
		}
		else if(avg>90&&avg<=100)
		{
			letter="A";
		}
		else if(avg>=80)
		{
			letter="B";
		}
		else if(avg>=70)
		{
			letter="C";
		}
		else
		{
			letter="D";
		}
		return letter;
	}//end method
}//end class
/*
Enter test score: 70
Enter test score: 80
Enter test score: 110
Invalid, please re-enter: 92
Your average is 80.7
Your grade is B
Another? y

Enter test score: 55
Enter test score: 88
Enter test score: 78
Your average is 73.7
Your grade is C
Another? y

Enter test score: 85
Enter test score: 90
Enter test score: 98
Your average is 91.0
Your grade is A
Another? y

Enter test score: 50
Enter test score: 62
Enter test score: 55
Your average is 55.7
Your grade is F
Another? n
Programmed by Jonathan Ko
*/