package loopsandconditionsassignment;

import java.util.Scanner;

public class AllAssignmentPrograms 
{	
	public void Palindrome()
	{
		int reverseNo=0, remainder, origNo;
		System.out.println("You are in Palindrome method:");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome:");
		int num = s.nextInt();

		origNo = num;
		
		while (num != 0)
		{
			remainder = num % 10;
			reverseNo = reverseNo * 10 + remainder;
			num = num/10;
		}
		
		if (origNo == reverseNo)
			System.out.println(origNo + " is Palindrome");
		else 
			System.out.println(origNo + " is not a Palindrome");
		
		s.close();
	}
	
	public void Fibonacci()
	{
		System.out.println("You are in Fibonacci method");
		
		int n = 10, temp1 = 0, temp2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(temp1 + " + ");

            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
	}
	
	public void Prime()
	{
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	}
	
	public void Armstrong()
	{
		int num = 370, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
	}
	
	public void Factorial()
	{
		int fact=1;
		System.out.println("Enter a number to get factorial:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i=1;i<=a;i++)
		{
			fact = fact*i;
		}
		System.out.printf("Factorial of "+ a + "is:"+fact);
		s.close();
	}
	
	public void ListofPrime()
	{
		int i=0;
	    int num=0;
	       
	    String primeNumbers = "";
 
	    for (i = 5; i <= 50; i++)         
	    { 		  	  
	    	int counter=0; 	  
	        for(num = i; num>=1; num--)
	        {
	        	if(i%num==0)
	        	{
	        		counter = counter + 1;
	        	}
	        }
	        if (counter==2)
	        {
	        	primeNumbers = primeNumbers + i + " ";
	        }	
	    }	
	    
	    System.out.println("Prime numbers from 5 to 50 are :");
	    System.out.println(primeNumbers);
	}
	
	public void PrintTable()
	{
		System.out.println("Please enter the number to print table:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			int temp = a*i;
			System.out.println(a + "*" + i + "=" + temp);
			s.close();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Press 1 for Palindrome");
		System.out.println("Press 2 for Fibonacci");
		System.out.println("Press 3 for Prime");
		System.out.println("Press 4 for Armstrong");
		System.out.println("Press 5 for Factorial");
		System.out.println("Press 6 for List of Prime Numbers");
		System.out.println("Press 7 to Print Table");
		AllAssignmentPrograms ap = new AllAssignmentPrograms();
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			ap.Palindrome();
			break;
		
		case 2:
			ap.Fibonacci();
			break;
		
		case 3:
			ap.Prime();
			break;
			
		case 4:
			ap.Armstrong();
			break;
		
		case 5:
			ap.Factorial();
			break;
			
		case 6:
			ap.ListofPrime();
			break;
			
		case 7:
			ap.PrintTable();
			break;
			
		default:
			System.out.println("Invalid value");
			break;
		}
	}
}