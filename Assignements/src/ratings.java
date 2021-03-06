import java.util.Scanner;
//Jonathan Ko
//assignment 8 problem 1
public class ratings 
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables
		int[] list=new int[5];
		int rate,pass=0;
		//read input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating (0 to 4) or -1 to quit: ");
		rate=Integer.parseInt(input.nextLine());
		while(pass==0)
		{
			switch(rate)
			{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				//count number of rating occurs
				list[rate]+=1;
				System.out.print("Enter rating (0 to 4) or -1 to quit: ");
				rate=Integer.parseInt(input.nextLine());
				break;
			//quit
			case -1:
				pass=1;
				break;
			//invalid data
			default:
				System.out.print("Invalid, must be 0 to 4.  Re-enter: ");
				rate=Integer.parseInt(input.nextLine());
			}
			
		}
		System.out.println("");
		System.out.println("Ratings Summary");
		System.out.println("Rating   Count");
		for(int i=0;i<list.length;i++)
		{
			System.out.println(i+"         "+list[i]);
		}
		System.out.println("Programmed by Jonathan Ko");
	}//end main
}//end class
/*
test 1
Enter rating (0 to 4) or -1 to quit: 4
Enter rating (0 to 4) or -1 to quit: 2
Enter rating (0 to 4) or -1 to quit: 5
Invalid, must be 0 to 4.  Re-enter: 4
Enter rating (0 to 4) or -1 to quit: 2
Enter rating (0 to 4) or -1 to quit: 0
Enter rating (0 to 4) or -1 to quit: 4
Enter rating (0 to 4) or -1 to quit: -1

Ratings Summary
Rating   Count
0         1
1         0
2         2
3         0
4         3
Programmed by Jonathan Ko

test 2
Enter rating (0 to 4) or -1 to quit: 1
Enter rating (0 to 4) or -1 to quit: 1
Enter rating (0 to 4) or -1 to quit: 1
Enter rating (0 to 4) or -1 to quit: -6
Invalid, must be 0 to 4.  Re-enter: 2
Enter rating (0 to 4) or -1 to quit: 4
Enter rating (0 to 4) or -1 to quit: 2
Enter rating (0 to 4) or -1 to quit: -7
Invalid, must be 0 to 4.  Re-enter: 1
Enter rating (0 to 4) or -1 to quit: 2
Enter rating (0 to 4) or -1 to quit: 3
Enter rating (0 to 4) or -1 to quit: 4
Enter rating (0 to 4) or -1 to quit: -1

Ratings Summary
Rating   Count
0         0
1         4
2         3
3         1
4         2
Programmed by Jonathan Ko
*/
