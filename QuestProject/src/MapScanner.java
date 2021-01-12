import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class MapScanner{

        public static void main(String[] args) throws IOException{
        
                HashMap studentRecord = new HashMap();
                Integer id;
                String name;
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter the filename to read from: ");
                String filename = keyboard.nextLine();
                
                File file = new File(filename);
                Scanner inputFile = new Scanner(file);
                
                while (inputFile.hasNext())
                {
                        id = Integer.parseInt(inputFile.next());
                        name = inputFile.nextLine();
                        studentRecord.put(id, name);
                }
                
                inputFile.close();
                System.out.println(studentRecord.values());
                System.out.println(studentRecord.keySet());
                
                System.out.print("Enter key: ");
                id = keyboard.nextInt();
                if (studentRecord.containsKey(id)){
                        name = (String) studentRecord.get(id);
                        System.out.println(id + "\t" + name  + "  found");
                }
                else
                        System.out.println(id + " not found");
        }         

}
/*23450 Jack
10398 Amar
10009 Boris
51430 Amy
69087 Brenda
68700 Zirui
67568 Xu
22222 Nick
17171 Chandra
10245 James*/
