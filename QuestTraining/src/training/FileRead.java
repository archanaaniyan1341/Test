package training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
	try {	BufferedReader in = new BufferedReader(new FileReader("E:\\test.txt"));
		String line = in.readLine();
		int count=0;
		while(line != null)
		{
			if(line.contains("INSERT")) {
				count=count+1;
		 String insert=  line.substring(line.indexOf(": ") + 1, line.indexOf(','));
		 String[] substring=line.split(" ");
		 String modified=substring[1];
		 System.out.println(count+" "+insert+" "+modified);
			}
		  line = in.readLine();
		}
		in.close();
	}catch(FileNotFoundException fn) {
		System.out.println("File not found");
	}catch(IOException io) {
		System.out.println("IO Exception");
	}
	}
}
