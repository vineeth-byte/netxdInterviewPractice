package fileHand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingOne {
public static void main(String[] args) throws IOException {
	File ff = new File("E:\\netxdFolder\\subFolder\\vineeth.txt");
	boolean flag = ff.exists();
	System.out.println(flag);
	 FileInputStream fip = new FileInputStream(ff);
	 int len = (int)ff.length();
	 System.out.println(len);
	 byte[] ar = new byte[len];
	 System.out.println(fip.read(ar));
	 String file1 = new String(ar);
	 System.out.println(file1);
	 FileOutputStream fop = new FileOutputStream("E:\\copying\\sample.txt");
	 for(int i=0;i<len;i++)
	 {
		 fop.write(ar[i]);
	 }
	 
	 
	
}
}
