package hackerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

	    static boolean isAnagram(String a, String b) {
	    	 Boolean retValue = false;
	    	   if(a != null && b != null) {
	    	       char [] arrayA = a.toLowerCase().toCharArray();
	    	       char [] arrayB = b.toLowerCase().toCharArray();
	    	       Arrays.sort(arrayA);
	    	       Arrays.sort(arrayB);
	    	       retValue = Arrays.equals(arrayA, arrayB);
	    	   }
	    	   return retValue;
	    }
	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

	


