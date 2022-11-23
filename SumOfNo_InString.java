package week_7_String;

public class SumOfNo_InString
{
	public static void main(String[] args)
	{
		String s1 = "2c4h6e8t5an";
		int sum = 0;

		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
			{
				int num = s1.charAt(i) - 48;
				sum += num;

			}
		}

		if (sum == 0)
		{
			System.out.println("No digits present");
		}
		else
		{
			System.out.println("Addition of digits in string: " + sum);
			//Addition of digits in string: 25

		}
	}
}
