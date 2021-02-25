package string.example;

public class NextSmae {
	public static void main(String[] args) {
		String name = "vineeth sivasankaran";
		for(int i=0;i<name.length();i++)
		{
			 
				if(name.charAt(i)==name.charAt(i+1))
				{
					System.out.println(name.charAt(i));
				}
			} 
		 
	}

}
