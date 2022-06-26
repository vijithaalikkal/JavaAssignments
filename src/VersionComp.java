import java.util.Scanner;
public class VersionComp
{
	public static int compareVersion(String version1, String version2)
		{
			String[] s1= version1.split("\\.");
			String[] s2= version2.split("\\.");
			int maxLength = Math.max(s1.length,s2.length);
			for(int i=0;i<maxLength;i++)
				{
					Integer v1 = i<s1.length ? Integer.parseInt(s1[i]):0;
					Integer v2 = i<s2.length ? Integer.parseInt(s2[i]):0;
					int compare = v1.compareTo(v2);
					if(compare !=0)
						return compare;
				}
			return 0;
		}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Version");
		String version1 = sc.nextLine();
		System.out.println("Enter Se1cond Version"); 
		String version2 = sc.nextLine(); 
		//String version1 = "1.0.3";
		//String version2 = "1.0.7";
		 if (compareVersion(version1, version2) > 0)
	         System.out.println(version1 + " is a old version");
	     else if (compareVersion(version1, version2) < 0)
	         System.out.println(version2 + " is a latest version");
	     else
	         System.out.println("Both version are equal");
	}
}
