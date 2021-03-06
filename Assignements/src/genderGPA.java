import java.util.Scanner;
//Jonathan Ko
//assignment 6 problem 1
public class genderGPA 
{//start class
	public static void main(String[] args)
	{//start main
		// declare input
		String gender;
		double avgGpaM=0,avgGpaF=0,gpaF,gpaM,totalGpaF=0,totalGpaM=0;
		int valid=0,counterM=0,counterF=0;
		//read input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter gender or x to quit: ");
		gender=input.nextLine();
		gender=gender.toUpperCase();
		while(valid==0)
		{
			switch(gender)
			{
			case "F":
				System.out.print("Enter GPA: ");
				gpaF=Double.parseDouble(input.nextLine());
				avgGpaF=gpaF+avgGpaF;
				counterF++;
				totalGpaF=avgGpaF/counterF;
				break;
			case "M":
				System.out.print("Enter GPA: ");
				gpaM=Double.parseDouble(input.nextLine());
				avgGpaM=gpaM+avgGpaM;
				counterM++;
				totalGpaM=avgGpaM/counterM;
				break;
			case "X":
				valid=1;
				break;
			}
			if(valid==0)
			{
				System.out.print("Enter gender or x to quit: ");
				gender=input.nextLine();
				gender=gender.toUpperCase();
			}
		}
		
		System.out.println("");
		System.out.println("Average Male GPA: "+totalGpaF);
		System.out.println("Average Male GPA: "+totalGpaM);
	}//end main
}//end class
/*
test 1
Enter gender or x to quit: f
Enter gpa: 2.5
Enter gender or x to quit: f
Enter gpa: 3.2
Enter gender or x to quit: m
Enter gpa: 2.8
Enter gender or x to quit: f
Enter gpa: 3.0
Enter gender or x to quit: m
Enter gpa: 2.2
Enter gender or x to quit: x

Average Male GPA: 2.5
Average Female GPA: 2.9
Programmed by Jonathan Ko

test 2
Enter gender or x to quit: F
Enter gpa: 3.3
Enter gender or x to quit: F
Enter gpa: 3.5
Enter gender or x to quit: F
Enter gpa: 2.5
Enter gender or x to quit: x

Average Male GPA: NaN
Average Female GPA: 3.1
Programmed by Jonathan Ko

test 3
Enter gender or x to quit: m
Enter gpa: 3
Enter gender or x to quit: m
Enter gpa: 3.2
Enter gender or x to quit: m
Enter gpa: 2.2
Enter gender or x to quit: m
Enter gpa: 2.5
Enter gender or x to quit: F
Enter gpa: 2.8
Enter gender or x to quit: M
Enter gpa: 4
Enter gender or x to quit: x

Average Male GPA: 2.98
Average Female GPA: 2.8
Programmed by Jonathan Ko
*/