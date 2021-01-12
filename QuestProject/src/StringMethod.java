import java.util.Scanner;
public class StringMethod {

	public static void main(String[] args) {
		String st="Archana";
		String st1="Anhu";
		String st2="anhu";
		
		//character at a given position
				System.out.println("The character at 3rd position is "+st.charAt(2));
		//	unicode value of given character	
				System.out.println("The code point at 3rd position is "+st.codePointAt(2));
				
				System.out.println("The code point before 3rd position or at 2nd is "+st.codePointBefore(2));

				System.out.println("The code point count is "+st.codePointCount(0,7));
				
				System.out.println("The comparison of st1 and st is "+st.compareTo(st1));
				System.out.println("The comparison of st1 and st is "+st1.compareTo(st));
				System.out.println("The comparison of st1 and st is "+st.compareToIgnoreCase(st1));
	
				System.out.println(" st1 concatenated with st is "+st.concat(st1));	
				System.out.println(" st concatenated with Aniyan is "+st.concat(" Aniyan"));	

				System.out.println(" st contains st1 is "+st.contains(st1));	
				System.out.println(" st contains ana is "+st.contains("arc"));	
				
				System.out.println(" st compared to j is "+st.contains("ah"));
		
				char[] c = {'C','O','P','Y'};
				String s2="c";
				System.out.println(" copy value of "+s2.copyValueOf(c,0,4));
				
				/*Scanner sc= new Scanner(System.in);
				System.out.println("value");
				//String value=sc.next();
				System.out.println(" st ends with "+value +": " +st.endsWith(value));*/
				
				System.out.println("st1 and st2 is equal "+st2.equalsIgnoreCase(st1));
				System.out.println("st1 and st2 is equal "+st2.equals(st1));
				
				System.out.println(" st contains bytes "+st.getBytes());
				
			//	char[] array=System.out.println(" st contains characters "+st.getChars());
				
				System.out.println(" Hahcode of st: "+st.hashCode());
				
				System.out.println("index of character "+st.indexOf("a"));
				System.out.println("index of character  "+st.indexOf("a",5));
				
				System.out.println("intern "+st2.intern());
				
				System.out.println("is it empty? "+st2.isEmpty());

				System.out.println("last index of character "+st.lastIndexOf("a"));
				System.out.println("last index of character  "+st.lastIndexOf("a",0));
				
				System.out.println("length "+st2.length());
				
				System.out.println("replace "+st.replace("a","z"));
				System.out.println("replace "+st.replaceAll("ana","zen"));
				
				System.out.println("replace "+st.replaceFirst("a","z"));
				
				System.out.println("starts with "+st.startsWith("A"));
				
				System.out.println("subsequence of st "+st.subSequence(1,4));
				System.out.println("substring of st "+st.substring(4));

				System.out.println("character array of st "+st.toCharArray());
				System.out.println("lower case of st "+st.toLowerCase());
				System.out.println("upper case of st "+st.toUpperCase());
				System.out.println("value of st "+String.valueOf(""));
	}

}
