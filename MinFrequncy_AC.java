package week_7_String;

public class MinFrequncy_AC
{
public static void main(String[] args)
{
	String s = "abacbacdba";
	int min=Integer.MAX_VALUE;
	char ch=0;
	for (int i = 0; i < s.length(); i++)
	{
		int cnt = 0;
		for (int j = 0; j <i; j++)
		{
			if (s.charAt(i)==s.charAt(j))
			{
				cnt++;
			}
		}
		if (cnt==0)
		{
			int Freq=0;
			for (int j = 0; j < s.length(); j++)
			{
				if (s.charAt(i)==s.charAt(j))
				{
					Freq++;
				}
			}
			if (Freq<min)
			{
				min=Freq;
				ch=s.charAt(i);
			}
		}
	}
	System.out.println(ch+" "+min);
}
}
