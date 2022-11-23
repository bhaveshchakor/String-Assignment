package week_8;
public class SecondMaxFreq
{
	public static void main(String[] args)
	{
		String s = "dbacbacaba";
		int size = 0;
		for (int i = 0; i < s.length(); i++)
		{
			int cnt = 0;
			for (int j = 0; j < i; j++)
			{
				if (s.charAt(i) == s.charAt(j))
				{
					cnt++;
				}
			}
			if (cnt == 0)
			{
				size++;

			}
		}
		int index = 0;
		char[] ca = new char[size];
		int[] fa = new int[size];
		for (int i = 0; i < s.length(); i++)
		{
			int cnt = 0;
			for (int j = 0; j < i; j++)
			{
				if (s.charAt(i) == s.charAt(j))
				{
					cnt++;
					break;
				}
			}
			if (cnt==0)
			{
				int freq=0;
				for (int j = 0; j < s.length(); j++)
				{
					if (s.charAt(i)==s.charAt(j))
					{
						freq++;
					}
				}
				
				ca[index]=s.charAt(i);
				fa[index]=freq;
				index++;
			}
		}
		for (int i = 0; i < fa.length; i++)
		{
			for (int j = i+1; j < fa.length; j++)
			{
				if (fa[i]>fa[j])
				{
					int temp=fa[i];
					fa[i]=fa[j];
					fa[j]=temp;
					
					char ch=ca[i];
					ca[i]=ca[j];
					ca[j]=ch;
				}
			}
		}
		System.out.println(ca[ca.length-2]+" "+fa[fa.length-2]);
	}
}
