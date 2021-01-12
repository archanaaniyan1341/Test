package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
	char ch= ' ';
	//InputStreamReader is=new InputStreamReader(System.in);
	//BufferedReader br= new BufferedReader(is);
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter characters,q to quit..");
	do {
		try {
			ch=(char) br.read();
			System.out.println(ch);
		}catch(IOException i) {
			i.printStackTrace();
		}
	}while(ch!='q');

	}

}
