package enumerators;

public class FormatterSpecifier {
	
	/*static void stringFormatter() {
String specifier=" %-30s % -20s %-5.3f %n";
String specifier_s=" %-30s % -20s %-20s %n";
System.out.printf(specifier_s, "Book title","Book author","Book price");
System.out.format(specifier_s, "=========","=========","=========");
System.out.format(specifier, "Wings of fire","Kalam",250f);
System.out.format(specifier,"God of small things","Arundati Roy",145.8f);
System.out.format(specifier,"Alchemist","Paulo Coelo",543.98f);
System.out.format(specifier,"Othello","Wordsworth",90.9);
System.out.format(specifier,"Romeo and juliet","Wordsworth",90f);
	}*/
	
	static void stringFormatter_1() {
		System.out.format("%30s %20s","Name:","Archana");
		System.out.format("%30s %20s","Email:","archanaaniyan@gmail.com");
		System.out.format("%30s %20s","Qualification","BTech");
	}
	public static void main(String[] args) {
		//stringFormatter();
		stringFormatter_1();
	}

}
