package week_7_String;

public class StringSortAscending
{

	public static void main(String[] args)
	{
		String s="54321";
		char[] ca=s.toCharArray();
		
		for (int i = 0; i < ca.length; i++)
		{
			for (int j = i+1; j < ca.length; j++)
			{
				if (ca[i]>ca[j])
				{
					char temp=ca[i];
					ca[i]=ca[j];
					ca[j]=temp;
				}
			}
		}
		String s1=new String(ca);
		System.out.println(s1);
		//12345


	}

}
