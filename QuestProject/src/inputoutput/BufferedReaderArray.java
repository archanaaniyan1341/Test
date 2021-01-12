                                                                                                                              package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderArray {

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[100];
		System.out.println("Enter lines of text");
		System.out.println("Enter"+"stop"+"to exit");
		for(int incr=0;incr<str.length;incr++) {
		try {
			str[incr]=br.readLine();
			if(str[incr].equals("stop")) {
				break;
			}
			
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
		System.out.println("Here are the details..");
		for(int incr=0;incr<100;incr++) {
				if(str[incr].equals("stop")) {
					break;
				}System.out.println(str[incr]);
		}
	}
}
