package mythirdcode;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		//WAP to implement Pangram Checking with least inbuilt methods being used.
		String str6="the quick brown fox jumps over lazy dog";
		String str7="abcdefghijklmnopqrstuvwxyz";
	str6=str6.replace(" ", "");
	String str=str6;
	String str1="";
	String str2="";
	for(int i=0;i<=str.length()-1;i++)
	{
		char ch=str.charAt(i);
		str1=String.valueOf(ch);
		if(str2.contains(str1))
		{
			
		}
		else
		{
			str2=str2+str1;
		}
	}
	//System.out.println(str2);
	char ch1[]=str2.toCharArray();
	char ch2[]=str7.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	//System.out.println(Arrays.toString(ch1));
	if(Arrays.equals(ch1,ch2))
	{
System.out.println("it is panagram");
	}
else
{
System.out.println("it  is not panagram");
	}

	}

}
