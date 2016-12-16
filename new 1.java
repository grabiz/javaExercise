package exercise;

import java.util.Scanner;

public class Exercise
{
	
	public static void main(String[] args)
	{
	     Scanner sc = new Scanner(System.in);
         System.out.println("Enter an integer :");
         int decimalNumber = sc.nextInt();
         System.out.println("HEX value is : " +ConvertToHex(decimalNumber));
         System.out.println("Enter Math Score :");	
       	 float mathScore = sc.nextFloat();
		 System.out.println("Enter Math Score :");	
       	 float mathScore = sc.nextFloat();
		 System.out.println("Enter Physics Score :");	
       	 float physicScore = sc.nextFloat();
		 System.out.println("Enter Chemistry Score :");	
       	 float chemistryScore = sc.nextFloat();
		 System.out.println("Average score is : " +ClassRanking(mathScore,physicScore,chemistryScore));	
		 System.out.println("Enter an integer :");
         int number = sc.nextInt();
		 System.out.println(+IsPrimeNumber(number));
		 System.out.println("Enter first integer :");
         int firstNumber = sc.nextInt();
		 System.out.println("Enter second integer :");
         int secondNumber = sc.nextInt();
		 System.out.println("Lowest common multiple :"+LowestCommonMultiple(firstNumber,secondNumber));
        
	}
	public static String HexSymbol(int n)
	{
		switch(n)
		{
			case 0 : return "0";
			         break;
			case 1 : return "1";
			         break;
			case 2 : return "2";
			         break;
			case 3 : return "3";
			         break;
			case 4 : return "4";
			         break;
			case 5 : return "5";
			         break;
			case 6 : return "6";
			         break;
			case 7 : return "7";
			         break;
			case 8 : return "8";
			         break;
			case 9 : return "9";
			         break;
			case 10 : return "A";
			         break;
			case 11 : return "B";
			         break;
			case 12 : return "C";
			         break;
			case 13 : return "D";
			         break;
			case 14 : return "E";
			         break;
			case 15 : return "F";
			         break;
					 
		}
		
	}
	public static String ConvertToHex (int n)
	{
		String hexNumber="";
		while (n>0)
		{
			hexNumber=HexSymbol(n%16)+hexNumber;
			n=n/16;
		}
		return hexNumber;
	}
	public static void ClassRanking (float mathScore, float physicScore, float chemistryScore)
	{
		float avgScore = (mathScore + physicScore +chemistryScore)/3;
		if (avgScore >=8)
			System.out.println("Average Score is :" +avgScore +"Good");
		else if (avgScore >=7)
			System.out.println("Average Score is :" +avgScore +"Good");
	    else if (avgScore >=5)
			System.out.println("Average Score is :" +avgScore +"Good");
		else 
			System.out.println("Average Score is :" +avgScore +"Bad");
	}
	public static void IsPrimeNumber(int n)
	{
		
	}
	public static int LowestCommonMultiple(int n, int m)
	{
		
	}
	
	
}