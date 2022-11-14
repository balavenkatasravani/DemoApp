package mythirdcode;

public class Palindrome {

	public static void main(String[] args) {
		//WAP to check if “2552” is palindrome or not.
		int a =2552;
		String str=Integer.toString(a);
		String str1="";
		String str2=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			str1=str1+String.valueOf(ch);
		}
			if(str2.equalsIgnoreCase(str1))
			{
				System.out.println("palindrome");
		}
			else {
				System.out.println(" not palindrome");
			}
		
	}

}
