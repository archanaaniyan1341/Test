package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class WritetoFileFromConsole2 {

	public static void main(String[] args) {
		BufferedWriter bufferedWriter=null;
		BufferedReader br=null;
		String str=" ";
		try {
			System.out.println("Enter string to be stored");
			br=new BufferedReader(new InputStreamReader(System.in));
			File myFile=new File("E:\\quest javaprograms\\txt23.txt");
			if(!myFile.exists()) {
				myFile.createNewFile();
			}
			Writer writer=new FileWriter(myFile,true);
			bufferedWriter=new BufferedWriter(writer);
			while(!str.equals("end")) {
				str=br.readLine();
				if(!str.equals("end")) {
					bufferedWriter.write(str);
				}
			}
		
		}catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(bufferedWriter!=null) {
					bufferedWriter.close();
				}
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		}


	}

}
