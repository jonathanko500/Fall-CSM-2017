import java.util.Scanner;
//Jonathan Ko
//assignment 6 problem 1
public class genderGrade 
{//start class
	public static void main(String[] args)
	{//start main
		//declare input
		double gpaM=0,gpaF=0,avgGPAM=0,avgGPAF=0,gpa;
		int valid=0,countF=1,countM=1,correct=1;
		String gender;
		//read input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter gender or x to quit: ");
		gender=input.nextLine();
		gender.toUpperCase();
		while(valid==0)
		{
			System.out.print("Enter gpa: ");
			gpa=Double.parseDouble(input.nextLine());
			switch(gender)
			{
			case "F":	
				gpa=gpaF;
				avgGPAF=(gpaF+avgGPAF)/countF;
				countF++;
				break;
			case "M":
				gpa=gpaM;
				avgGPAM=(gpaM+avgGPAM)/countM;
				countM++;
				break;
			case "X":
				System.out.println("");
				correct=0;
				break;
			}
			System.out.print("Enter gender or x to quit: ");
			gender=input.nextLine();
			gender.toUpperCase();
		}
	}//end main
}//end class
