package BufferWriter;

import java.io.*;

public class TestTransForm1 {
	public static void main(String[] args){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f:/Test/data1.txt"));
			osw.write("mircosoft ibmsunappleph");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("f:/Test/data1.txt"),"ISO8859_1");
			osw.write("mircosoft ibmsunappleph");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
