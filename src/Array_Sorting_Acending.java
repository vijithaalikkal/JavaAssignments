import java.util.Scanner;

public class Array_Sorting_Acending
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Numbers");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
						{
						 int temp=a[i];
							 a[i]=a[j];
							 a[j]=temp;
						}
				
			}
			
			
		}
		System.out.println("After Sorting");
		
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}
		
		

	}

}
