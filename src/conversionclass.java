import java.util.Scanner;

public class conversionclass 
{

	public static void main(String[] args) 
	{
		double feet=0;
		double miles=0;
		double yards=0;
		double pounds=0;
		boolean program=true; 
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the conversion calculator!");
		System.out.println("You can convert many things with this easy-to-use program!");
	
		while(program)
		{
			System.out.println("Press 1 for: Feet to inches,\nPress 2 for miles to feet\nPress 3 for yards to meters\n and press 4 for Pounds to kilograms: ");
			int numberSelection= scan.nextInt();
			while(numberSelection !=1&&numberSelection!=2&&numberSelection!=3&&numberSelection!=4)
			{
				System.out.println("Please enter in a valid number: ");
				numberSelection=scan.nextInt();
			}
			if(numberSelection==1)
			{
				System.out.println("Enter in the amount of feet: ");
				feet= scan.nextDouble();
				System.out.print("\n"+feet+" feet is equal to "+feetToInches(feet)+ " inches.");
				
			}
			if(numberSelection==2)
			{
				System.out.println("Enter in the amount of miles: ");
				miles= scan.nextDouble();
				System.out.print("\n"+miles+" miles is equal to "+milesToFeet(miles)+ " feet.");
			}
			if(numberSelection==3)
			{
				System.out.println("Enter in the amount of yards: ");
				yards= scan.nextDouble();
				System.out.print("\n"+yards+" yards is equal to "+yardsToMeters(yards)+ " meters.");
			}
			if(numberSelection==4)
			{
				System.out.println("Enter in the amount of pounds: ");
				pounds= scan.nextDouble();
				System.out.print("\n"+pounds+" pounds is equal to "+poundsToKilograms(pounds)+ " kilograms.");
			}
			scan.nextLine();
			System.out.print("\nWould you link to run this again?(y/n): ");
			String yorn= scan.nextLine();
			while(!(yorn.equals("y"))&&!(yorn.equals("n")))
			{
				System.out.print("\nPlease enter in y or n: ");
				yorn=scan.nextLine();
			}
			if(yorn.equals("n"))
			{
				program=false;
			}
		}
		
	}
	
	public static double feetToInches(double feetconv)
	{
		feetconv=feetconv*12;
		return feetconv;
	}
	public static double milesToFeet(double milesconv)
	{
		milesconv=milesconv*5280;
		return milesconv;
	}
	public static double yardsToMeters(double yardsconv)
	{
		yardsconv=yardsconv/1.094;
		return yardsconv;
	}
	public static double poundsToKilograms(double poundsconv)
	{
		poundsconv=poundsconv/2.205;
		return poundsconv;
	}
	
	
	
	

}
