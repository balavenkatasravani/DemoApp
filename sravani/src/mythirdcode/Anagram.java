package mythirdcode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//WAP to implement Anagram Checking least inbuilt methods being used.
		String str="main";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			
			str1=str1+(char)(str.charAt(i)-32);
			}
	
		String str2="MAIN";
	char ch1[]=str1.toCharArray();
	char ch2[]=str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1,ch2))
			{
		System.out.println("it is anagram");
			}
	else
	{
		System.out.println("it  is not anagram");
			}
	}

}
