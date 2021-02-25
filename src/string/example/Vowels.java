package string.example;

public class Vowels {
	public static void main(String[] args) {
		String[] name = {"vineeth","mukesh","aakash","elango","rajkumar","ishwarya"};
		for(int i=0;i<name.length;i++)
		{
			char[] ch = name[i].toCharArray();
			
			if(ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u')
			{
				System.out.println(ch);
				
			}
			
		}
			
	}

}
