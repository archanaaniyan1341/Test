package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderLines {

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=" ";
		System.out.println("Enter lines of text");
		System.out.println("Enter stop to exit");
		do {
			try {
				str=(String) br.readLine();
				System.out.println(str);
			}catch(IOException i) {
				i.printStackTrace();
			}
		}while(!str.equals("stop"));


	}

}
