package swapnumbers;

import java.util.Scanner;

public class SwapTwoNumbers {

	int temp;
	
	public void SwapWithoutVariable(int x,int y)
	{
		System.out.println("Before swap:"+"x="+x+","+"y="+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After swap:"+"x="+x+","+"y="+y);
	}
	
	public void SwapWithVariable(int a,int b)
	{
		System.out.println("Before swap:"+"a="+a+","+"b="+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap:"+"a="+a+","+"b="+b);
	}
	public static void main(String[] args) 
	{
		SwapTwoNumbers sn = new SwapTwoNumbers();
		System.out.println("Calling method: Swap without variable");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value od x:");
		int x= sc.nextInt();
		System.out.println("Enter the value of y:");
		int y = sc.nextInt();
		sn.SwapWithoutVariable(x, y);
		sc.close();
		
		System.out.println("Now calling method: Swap using third variable");
		sn.SwapWithVariable(1, 2);
	}
}