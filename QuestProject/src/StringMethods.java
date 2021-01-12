
public class StringMethods {

	public static void main(String[] args) {
		String s1= "HELLO";
		String s2= s1.concat("World");
		System.out.println(s1);
		System.out.println(s2);
		
		String s3= "ARCHNA";	
		System.out.println(s3.toLowerCase());
		
		String s4= "AFCAT";
		System.out.println(s4.replace("AFCAT","Quest"));
		
		String s5= "RITU";
		String s6= "ritu";
		String s7= "Rit";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		System.out.println(s7.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s5.equalsIgnoreCase(s7));
		System.out.println(s7.equalsIgnoreCase(s6));
		
		String s8= "How old are you?";
		System.out.println(s8.contains("How"));
		System.out.println(s8.contains("ritu"));
		System.out.println(s8.contains("u"));
		
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareTo(s7));
		System.out.println(s7.compareTo(s6));
		
		String s9= " HE LLOOO ";
		System.out.println(s9.trim());
		
		
	}

}
