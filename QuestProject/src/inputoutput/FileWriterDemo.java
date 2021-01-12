package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String source="In computing, input/output or I/O (or, informally, io or IO)"
				+"is the communication between an information processing system,"
				+ "such as a computer, and the outside world,"
				+"possibly a human or another information processing system. ";
				char buf[]=new char[source.length()];
				source.getChars(0, source.length(), buf, 0);
	
	try(
		FileWriter fos1=new FileWriter("E:\\quest javaprograms\\txt11.txt");
			FileWriter	fos2=new FileWriter("E:\\quest javaprograms\\txt12.txt");
			FileWriter fos3=new FileWriter("E:\\quest javaprograms\\txt13.txt")){
		for(int incr=0;incr<buf.length;incr+=2) {
			fos1.write((char)buf[incr]);}
			fos2.write(buf);
			fos3.write(buf, buf.length-buf.length/4, buf.length/4);
		
			}catch(IOException e) {
		e.printStackTrace();
	}
	
	}

}
