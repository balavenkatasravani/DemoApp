package mythirdcode;

public class duplicatesfromstring {

	public static void main(String[] args) {
		//WAP to remove Duplicates from a String.(Take any String ex with duplicate	character)
		String str[]={"sravanisravanisravani"};
		String str1="";
		String str2="";
		for(int i=0;i<=str.length-1;i++)
		{
			//char ch=str.charAt[i];
			str1=String.valueOf(i);
			if(str2.contains(str1))
			{
				
			}
			else
			{
				str2=str2+str1;
			}
		}
		System.out.println(str2);
	}

}
