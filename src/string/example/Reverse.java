package string.example;

public class Reverse {
public static void main(String[] args) {
	String name = "vineeth";
	char[] ch =name.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
	}
	System.out.println(ch);
	 
}
}
