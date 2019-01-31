package doubleLoops;

import java.util.Scanner;

public class Shapes 
{
	public void IncrementOfNumbers() 
	{		
		int i=0,j=0,n=5,k=1;
		for(i=1; i<n+1; i++)
		{
			for(j=0; j<i; j++)
		    {
				System.out.print(" " + k++);
		    }
            System.out.println("");
		}
	}
	
	public void IncrementRowNumbers()
	{
		int rows = 5;
        for(int i=1; i<=rows; ++i) 
        {
            for(int j=1; j<=i; ++j)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
	
	public void ReverseRightTriangle()
	{
		int rows = 5;
        for(int i=rows; i>=1; --i) 
        {
            for(int col=1; col<=i; ++col) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	public void SpaceTriangle()
	{
		int n=5,i, j; 
		  
        // outer loop to handle number of rows
        for(i=0; i<n; i++) 
        { 
            // inner loop to handle number spaces 
            for(j=2*(n-i); j>=0; j--) 
            { 
                System.out.print(" "); 
            } 
            //  inner loop to handle number of columns
            for(j=0; j<=i; j++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
	}
	
	public void Triangle()
	{
	
	}
	
	public static void main(String[] args) 
	{
		Shapes s = new Shapes();
		System.out.println("Press 1 to print Increment of Numbers");
		System.out.println("Press 2 to print Increment Number");
		System.out.println("Press 3 to print Reverse Right Triangle");
		System.out.println("Press 4 to print Space Triangle");
		System.out.println("Press 5 to print Triangle");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			s.IncrementOfNumbers();
			break;

		case 2:
			s.IncrementRowNumbers();
			break;
			
		case 3:
			s.ReverseRightTriangle();
			break;
			
		case 4:
			s.SpaceTriangle();
			break;
			
		case 5:
			s.Triangle();
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();
	}
}