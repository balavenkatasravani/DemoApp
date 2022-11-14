package mythirdcode;

public class Duplicatechar {

	public static void main(String[] args) {
		//WAP to print Duplicates characters from the String.
		String str="sravanisv";
		String str1="";
		String str3="";
		String str2="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			str1=String.valueOf(ch);
			if(str2.contains(str1))
			{
				str3=str3+str1;
			}
			else
			{
				str2=str2+str1;
			}
		}	
		
		System.out.println(str3);

	}

}
