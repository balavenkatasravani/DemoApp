package mythirdcode;

public class convowelsspcl {

	public static void main(String[] args) {
		//WAP to count the number of consonants, vowels, special characters in a String.
		String str="srav@$eiou";
		int count=0,count1=0,count2=0;
		String str1="";
		String str2="";
		String str3="";
		char ch1;
		int i=0;
				for(i=0;i<=str.length()-1;i++) {
					 ch1=str.charAt(i);
				
		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
		{
			str1=str1+String.valueOf(ch1);
			count++;
			
		}
		else if(ch1>'a'&&ch1<'z')
		{
			str2=str2+String.valueOf(ch1);
			count1++;
			}
		else {
			str3=str3+String.valueOf(ch1);
			count2++;
			}
			}
				System.out.println("vowels  "+str1+count);
				System.out.println("consonants  "+str2+count1);
				System.out.println("spcl  "+str3+count2);
	}

}
