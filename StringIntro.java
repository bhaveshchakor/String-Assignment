package week_7_String;

public class StringIntro
{
		public static void main(String[] args)
		{
			String s="Kiran";  // String using Literal
			System.out.println(s);
			
			 s=s.concat(" Gorde"); // after concate it is assigned to same variable so it will be overwright
			System.out.println(s);
			
			String s1=new String("Hello");
			System.out.println(s1); // string using object method
		}
}
