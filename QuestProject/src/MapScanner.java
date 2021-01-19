import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class MapScanner{

        public static void main(String[] args) throws IOException{
        
                HashMap studentRecord = new HashMap();
                String name;
                String time;
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter the filename to read from: ");
                String filename = keyboard.nextLine();
                
                File file = new File(filename);
                Scanner inputFile = new Scanner(file);
                
                while (inputFile.hasNext())
                {
                        String line=inputFile.nextLine();
                       if(line.contains("INSERT")) {
                    	   String words[]=line.trim().split(" ");
                    	   name=words[5].replace(',', ' ');
                    	   time=words[1];
                    	   studentRecord.put(name, time);
                       }
                }
                
                inputFile.close();
                System.out.println(studentRecord.values());
                System.out.println(studentRecord.keySet());
                
                System.out.print("Enter key: ");
                name = keyboard.next();
                if (studentRecord.containsKey(name)){
                       time = (String) studentRecord.get(name);
                        System.out.println(name + "\t" + time  + "  found");
                }
                else
                        System.out.println(name+ " not found");
        }         

}

