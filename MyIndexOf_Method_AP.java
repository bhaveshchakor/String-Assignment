package week_7_String;

public class MyIndexOf_Method_AP
{
public static void main(String[] args)
{
	String s1="abcdxyz";
	String s2="cdx";
	
	int result1=s1.indexOf(s2);
	System.out.println("java ans: "+result1);//2
	
	int result2=Myindexofmeth(s1,s2);
	System.out.println("My ans: "+result2);//2'
}

private static int Myindexofmeth(String s1, String s2)
{
	if (s2.length()>s1.length())
	{
		return -1;
	}
	
	for (int i = 0; i < s1.length(); i++)
	{
		if (s1.charAt(i)==s2.charAt(0))
		{
			int j=i;
			int cnt=0;
			int k=0;
			
			while (j<s1.length() && k<s2.length() )
			{
				if (s1.charAt(j)==s2.charAt(k))
				{
					cnt++;
				}
				else
				{
					break;
				}
				j++;
				k++;
			}
			if (cnt==s2.length())
			{
				return i;
			}
			
			
		}
	}
	return -1;

}
}
