package interfaces;
import java.util.*;
import java.io.*;

public class PhoneDirectory{
	
public static void main(String []argh)
{
    Scanner scan = new Scanner(System.in);
    int contacts = scan.nextInt();
    scan.nextLine();
    Map<String, Integer> map = new HashMap<>(contacts);
    for(int i=0; i < contacts; i++)
    {
        String name = scan.nextLine().trim();
        int phone = scan.nextInt();
        scan.nextLine();
        map.put(name, phone);
    }        

while(scan.hasNext())
    {
        String query = scan.nextLine();
        if(map.containsKey(query))
        {
            System.out.println(query + "=" + map.get(query));
        }
        else
        {
            System.out.println("Not found");
        }
    }
    scan.close();
}
    
	
}



