package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
	int size ;
	try(FileInputStream fin=new FileInputStream("C:\\Users\\hp\\Documents\\Phase 2 training.docx")){
		System.out.println("total available bytes= "+(size=fin.available()));
		int no=size/40;
		System.out.println("no of byes on one go"+no);
		for(int incr=0;incr<no;incr++) {
			System.out.println((char)fin.read());
		}
			System.out.println("available bytes"+fin.available());
			System.out.println("reading next"+no+"bytes");
			byte b[]=new byte[no];
			if(fin.read(b)!=no) {
				System.err.println("couldn;t read"+no+"bytes");
			}
				System.out.println(new String(b,0,no));
				System.out.println("still available"+(size=fin.available()));
				System.out.println("Skipping half of remaining bytes with skip()");
				fin.skip(size/2);
				System.out.println("still available"+fin.available());
				System.out.println("reading"+no/2+"into end of array");
				if(fin.read(b, no/2, no/2)!=no/2) {
					System.out.println("couln't read"+no/2+"bytes");
				}
					System.out.println(new String(b,0,b.length));
					System.out.println("available bytes"+fin.available());
				
			
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

}
