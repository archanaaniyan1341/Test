package inputoutput;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		    try {
		      FileReader input = new FileReader("C:\\Users\\hp\\Documents\\Phase 2 training.docx");
		      int count;
		     while(( count=input.read())!=-1) {
		      System.out.println("Data in the file: ");
		      System.out.println((char)count);  
		     }//end of while
		    }//end of catch
		    catch(Exception e) {
		      e.getStackTrace();
		    }
	}
}
