package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		String source="In computing, input/output or I/O (or, informally, io or IO)"
				+"is the communication between an information processing system,"
				+ "such as a computer, and the outside world,"
				+"possibly a human or another information processing system. ";
				byte buf[]=source.getBytes();
	FileOutputStream fos1=null;		
	FileOutputStream fos2=null;	
	FileOutputStream fos3=null;	
	try{
		fos1=new FileOutputStream("E:\\quest javaprograms\\txt1.txt");
		fos2=new FileOutputStream("E:\\quest javaprograms\\txt2.txt");
		fos3=new FileOutputStream("E:\\quest javaprograms\\txt3.txt");
		for(int incr=0;incr<buf.length;incr++) {
			fos1.write(buf);
			fos2.write((char)buf[incr]);
			fos3.write(buf, 3, 10);
		}
			}catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {if(fos1!=null) {
			fos1.close();
		}
		}catch(IOException e) {
		System.out.println("error closing file");
		}
		try {if(fos2!=null) {
			fos2.close();
		}
		}catch(IOException e) {
		System.out.println("error closing file");
		}
		try {if(fos3!=null) {
			fos3.close();
		}
		}catch(IOException e) {
		System.out.println("error closing file");
		}
		}
	}
	}


