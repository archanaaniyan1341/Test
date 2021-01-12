package enumerators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormatterEx3 {

	public static void main(String[] args) {
		String str[]= {"Head","nose","eyes","lips","teeth"};
		List<String> organs=Arrays.asList(str);
		for(String organ:organs) {
			System.out.printf("%-30s on the face is %10d %n",organ,1);
		}

	}

}
