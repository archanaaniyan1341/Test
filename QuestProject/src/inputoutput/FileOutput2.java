package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput2 {
	public static void main(String[] args) {
	String source="In computing, input/output or I/O (or, informally, io or IO)"
			+"is the communication between an information processing system,"
			+ "such as a computer, and the outside world,"
			+"possibly a human or another information processing system. ";
			byte buf[]=source.getBytes() ;

try (FileOutputStream fos1=new FileOutputStream("E:\\quest javaprograms\\txt4.txt");
		FileOutputStream fos2=new FileOutputStream("E:\\quest javaprograms\\txt5.txt");
		FileOutputStream fos3=new FileOutputStream("E:\\quest javaprograms\\txt6.txt")){
	for(int incr=0;incr<buf.length;incr++) {
		fos1.write(buf);
		fos2.write((char)buf[incr]);
		fos3.write(buf, 3, 10);
	}
		}catch(IOException e) {
	e.printStackTrace();

	}
}
}


