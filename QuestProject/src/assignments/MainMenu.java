package assignments;
import java.util.Scanner;

public class MainMenu {
	static Scanner sc=new Scanner(System.in);
	static int var1;
	public static void menu() {
		System.out.println("1) Administrator");
		System.out.println("2) User");
		System.out.println("3) Exit");
		System.out.println("Input");
		var1=sc.nextInt();
		MenuDriven.verify(var1);
	}//end of menu method
}//end of class
