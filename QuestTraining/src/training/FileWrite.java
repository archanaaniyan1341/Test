package training;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;

public class FileWrite {

	static JSONObject jsonObject = new JSONObject();
	static String output;

	public static void main(String[] args) throws IOException {

	    read("E:\\Test.txt");
	    write(".\\Test.json");

	}
	public static String read(String filenameIn) throws IOException {

	    BufferedReader bufferedReader = new BufferedReader(new FileReader(filenameIn));
	    String s ;
        int count=0;
	    while ( (s = bufferedReader.readLine() ) != null)
	    {
	    	if(s.contains("INSERT")) {
	    	count=count+1;
	        String[] stringsArr = s.split(" ");
	        jsonObject.put("id", count);  
	        jsonObject.put( "appName" , stringsArr[5].replace(',', ' '));
	        jsonObject.put("timeStamp" , stringsArr[1]);
	    }
	    } 
	    s= bufferedReader.readLine();
	    bufferedReader.close();
	    return output=jsonObject.toJSONString();    
	}
	public static String write(String filenameOut) throws FileNotFoundException {

	    PrintWriter printWriter = new PrintWriter(filenameOut);
	    printWriter.write(jsonObject.toJSONString());
	    printWriter.close();
	    String se = "yaaayyy :|";
	    return se;

	}



	}

