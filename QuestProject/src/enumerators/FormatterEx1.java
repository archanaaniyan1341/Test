package enumerators;

import java.util.Formatter;

public class FormatterEx1 {

	public static void main(String[] args) {
		Formatter fmt=new Formatter();
fmt.format("%s********%d %s %f","Infosys Mysore",88,"Karnataka",98.9);
System.out.println(fmt.out());
	}

}
