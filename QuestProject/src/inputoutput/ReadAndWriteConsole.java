package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ReadAndWriteConsole {

	public static void main(String[] args) {
		int incr;
		FileInputStream fis=null;
		FileOutputStream fos=null;
	try {
		fis=new FileInputStream("E:\\quest javaprograms\\txt11.txt");
	
		do{
			incr=fis.read();
			if(incr!=-1) {
			System.out.print((char)incr);
			}
		}while(incr!=-1);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		return;
	}catch(IOException e) {
		e.printStackTrace();
		return;
	}finally {
		try{
			if(fis!=null) {fis.close();}
		}catch(IOException e) {
			e.printStackTrace();
		}
		try{
			if(fos!=null) {fos.close();}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		

	}

}
