package training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class JSONWriteEx {

		public static void main(String[] args) {
		int incr;
		FileInputStream fis=null;
		FileOutputStream fos=null;
	try {
		fis=new FileInputStream("E:\\Test.txt");
		fos=new FileOutputStream(".\\Test.json");
		do{
			incr=fis.read();
			if(incr!=-1) {
				
				fos.write(incr);
			}
		}while(incr!=-1);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		return;
	}catch(IOException e) {
		e.printStackTrace();
		return;
	}finally {
		try{
			if(fis!=null) {fis.close();}
		}catch(IOException e) {
			e.printStackTrace();
		}
		try{
			if(fos!=null) {fos.close();}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		}

	}

	


