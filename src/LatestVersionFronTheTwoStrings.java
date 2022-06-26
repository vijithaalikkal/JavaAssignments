import java.util.Scanner;

public class LatestVersionFronTheTwoStrings 
{
	static int VersionCompare(String v1,String v2)
	{
		int vnum1 = 0, vnum2 = 0;
		for(int i=0,j=0;(i<v1.length()||j<v2.length());)
		{
			while(i<v1.length() && v1.charAt(i)!='.')
			{
				vnum1 = vnum1*10 +(v1.charAt(i)-'0');
				i++;
			}
			while(j<v2.length() && v2.charAt(j)!='.')
			{
				vnum2 = vnum2 * 10 +(v2.charAt(j)-'0');
				j++;
			}
			if(vnum1>vnum2)
				return 1;
			if(vnum2>vnum1)
				return -1;
			vnum1=vnum2=0;
			i++;
			j++;
		}
		return 0;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Version");
		 String version1 = sc.nextLine();
		 System.out.println("Enter Second Version");
		 String version2 = sc.nextLine(); 
		//String version1 = "1.0.3";
		//String version2 = "1.0.7";
		 
		 if (VersionCompare(version1, version2) > 0)
	            System.out.println(version1 + " is a old version");
	        else if (VersionCompare(version1, version2) < 0)
	            System.out.println(version2 + " is a latest version");
	        else
	            System.out.println("Both version are equal");

	}

}
