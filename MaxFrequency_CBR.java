package week_7_String;
// need changes
public class MaxFrequency_CBR
{
public static void main(String[] args)
{
	String s = "abacbacdba";
	int max=Integer.MIN_VALUE;
	char ch=0;
	for (int i = 0; i < s.length(); i++)
	{
		int cnt=0;
		for (int j = 0; j < s.length(); j++)
		{
			if (s.charAt(i)==s.charAt(j))
			{
				cnt++;
			}
		}
		if (cnt>max)
		{
			max=cnt;
			ch=s.charAt(i);
		}
	}
	System.out.println(ch+" "+(max));//a 4
}
}
