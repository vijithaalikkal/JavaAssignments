import java.util.Scanner;

public class Reverse_String 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		System.out.println("After Reverse String is");
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
			
		}
		
	}

}
