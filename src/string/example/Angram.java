package string.example;
import java.util.*;
public class Angram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name1");
		String name1 = sc.nextLine();
		System.out.println("enter the name2");
		String name2 = sc.nextLine();
		int count=0;
		for(int i=0;i<name1.length();i++)
		{
			for(int j=0;j<name2.length();j++)
			{
				if(name1.charAt(i)==name2.charAt(j))
				{
					count++;
				}
			}
		}
		if(count==name1.length())
		{
			System.out.println("given name is anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}
		
	}

}
