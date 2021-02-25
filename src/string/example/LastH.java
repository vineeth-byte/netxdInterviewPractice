package string.example;

public class LastH {
	public static void main(String[] args) {
		String[] ar = {"vineeth","aakash","naresh","ashok","mukesh","ishwarya"};
		for(int i=0;i<ar.length;i++)
		{
			String name = ar[i];
			int last = name.length()-1;
			if(name.charAt(last)=='h')
			{
				System.out.println(name);
			}
		}
	}

}
