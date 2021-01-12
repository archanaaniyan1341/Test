package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleWriteFile {

	public static void main(String[] args) {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	 int incr;
	try {
		FileOutputStream	fos=new FileOutputStream("E:\\quest javaprograms\\txt21.txt",true);
		do{
			incr=in.read();
			if(incr!=-1) {
			fos.write(incr);
			}
		}while(incr!=-1);
	} catch(FileNotFoundException e) {
		e.printStackTrace();
		return;
	}catch (IOException e) {
		
		e.printStackTrace();
	}

	}

}
