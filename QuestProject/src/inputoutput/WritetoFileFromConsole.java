package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class WritetoFileFromConsole {

	public static void main(String[] args) {
		BufferedWriter bufferedWriter=null;
		BufferedReader br=null;
		try {
			System.out.println("Enter string to be stored");
			br=new BufferedReader(new InputStreamReader(System.in));
			String strContent=br.readLine();
			File myFile=new File("E:\\quest javaprograms\\txt22.txt");
			if(!myFile.exists()) {
				myFile.createNewFile();
			}
			Writer writer=new FileWriter(myFile);
			bufferedWriter=new BufferedWriter(writer);
			bufferedWriter.write(strContent);
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
