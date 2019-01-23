import java.util.Scanner;

/**
 * 
 * @author Hady Diab, Function practice: get 3 numbers from user  and return smallest of the three
 *
 */
public class FunctionIntegerReturn
{

	public static void main(String[] args) 
	{
		//do this
		Scanner scan=new Scanner(System.in);
		boolean continuerunning=true;
		while(continuerunning)
		{

			System.out.println("Please enter in a number: ");
			int scannum1= scan.nextInt();
			System.out.println("Please enter in another number: ");
			int scannum2= scan.nextInt();
			System.out.println("Please enter in another number: ");
			int scannum3= scan.nextInt();
			scan.nextLine();
			System.out.println(integerreturn(scannum1, scannum2, scannum3)+" is the smallest value.");
			System.out.print("\nTry again?(y/n): ");
			String answer= scan.nextLine();
			while(!(answer.equals("y"))&& (!(answer.equals("n"))))
			{
				System.out.print("\nTry again?(y/n): ");
			}
			if (answer.equals("n"))
			{
				continuerunning=false;
			}
		}
		
	}

	//println's are not in methods, f
	public  static int integerreturn(int num1, int num2, int num3)
	{
		int numreturn=0;
		if(num1 <= num2 && num1 <= num3)
		{
			
			return num1;
		}
		else if(num2 <= num3 && num2 <= num1)
		{
			
			return num2;
		}
		// dont need this else if(num3 <= num1 && num3 <= num2)
		//{
			//System.out.println(num3+" is the smallest of the three numbers.");
			
		//}
		return num3;
		
	}
}
