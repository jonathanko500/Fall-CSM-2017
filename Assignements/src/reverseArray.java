import java.util.Random;
//jonathan ko
//assignment 8 problem 3
public class reverseArray
{//start class
	public static void main(String[] args)
	{//start main
		final int maxnums = 50;
		int max,min;
		double avg;
		//declare two 1D array
		int[] origin = new int[maxnums];
		int[] oppisote = new int[maxnums];
		//call initArray to store numbers in array
		initArray(origin);
		System.out.println("The numbers are:");
		//call printArray to print with 5 numbers per row
		printArray(origin,5);
		//call findMax to determine max
		max=findMax(origin);
		//call findMin to determine min
		min=findMin(origin);
		//call findAvg to determine average
		avg=findAvg(origin);
		//print minimum, maximum, average
		System.out.println("");
		System.out.println("The largest number is "+max);
		System.out.println("The smallest number is "+min);
		System.out.printf("The average is %.1f%n", avg);
		System.out.println("");
		System.out.println("The reversed numbers are:");
		//call reverseArray to store numbers in second array
		//in reverse order
		oppisote=reverseArraY(origin,oppisote);
		//call printArray to print the reversed array with 7 numbers per
		printArray(oppisote,7);
		System.out.println("");
		System.out.println("Programmed by Jonathan Ko");
	}//end main
	public static void initArray(int[] list)
	{//stat method
		Random rand = new Random();
		for(int i=0;i<list.length;i++)
		{
			list[i]=1+rand.nextInt(999);;
		}
	}//end method
	public static void printArray (int[] list, int numb)
	{//start method
		//declare counter
		int counter=0;
		for(int i=0;i<list.length;i++)
		{
			System.out.print(" "+ list[i]+" ");
			counter++;
			if((counter%numb)==0)
			{
				//makes new line
				System.out.println();
			}
		}
	}//end method
	public static int findMax (int[] list)
	{//start method
		int max=0;
		for(int i=0;i<list.length;i++)
		{
			if(max<list[i])
			{
				max=list[i];
			}
		}
		return max;
	}//end method
	public static int findMin (int [] list)
	{
		int min=1000;
		for(int i=0;i<list.length;i++)
		{
			if(min>list[i])
			{
				min=list[i];
			}
		}
		return min;
	}
	public static double findAvg (int[] list)
	{//start method
		double avg,top=0;
		//denominator
		double bottom=list.length;
		for(int i=0;i<list.length;i++)
		{
			//numerator
			top+=list[i];
		}
		avg=top/bottom;
		return avg;
	}//end method
	public static int[] reverseArraY(int [] list, int[] oppisote)
	{
		int start=list.length-1;
		for(int i=0;i<list.length;i++)
		{
			oppisote[i]=list[start-i];
		}
		return oppisote;
	}
}//end class
/*
test 1
The numbers are:
 431  155  919  531  193 
 100  745  132  683  475 
 626  659  887  997  579 
 534  7  437  143  997 
 229  568  792  281  159 
 495  586  213  412  322 

The largest number is 997
The smallest number is 7
The average is 476.2

The reversed numbers are:
 322  412  213  586  495  159  281 
 792  568  229  997  143  437  7 
 534  579  997  887  659  626  475 
 683  132  745  100  193  531  919 
 155  431 
Programmed by Jonathan Ko

test 2
The numbers are:
 710  115  978  239  816 
 569  68  935  638  484 
 489  678  143  24  485 
 432  52  880  921  776 
 106  490  771  550  405 
 400  455  166  781  381 

The largest number is 978
The smallest number is 24
The average is 497.9

The reversed numbers are:
 381  781  166  455  400  405  550 
 771  490  106  776  921  880  52 
 432  485  24  143  678  489  484 
 638  935  68  569  816  239  978 
 115  710 
Programmed by Jonathan Ko
 test 3
 The numbers are:
 292  30  123  645  323 
 548  288  753  110  805 
 260  600  91  94  940 
 477  684  144  231  381 
 167  622  940  488  304 
 11  700  548  119  85 
 144  101  267  630  14 
 242  721  229  710  973 
 192  876  228  700  925 
 662  778  563  122  302 

The largest number is 973
The smallest number is 11
The average is 423.6

The reversed numbers are:
 302  122  563  778  662  925  700 
 228  876  192  973  710  229  721 
 242  14  630  267  101  144  85 
 119  548  700  11  304  488  940 
 622  167  381  231  144  684  477 
 940  94  91  600  260  805  110 
 753  288  548  323  645  123  30 
 292 
Programmed by Jonathan Ko

*/