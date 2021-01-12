package enumerators;

import java.util.Formatter;

public class FormatterEx2 {
	public static void main(String[] args) {
		Formatter fmt=new Formatter();
	fmt.format("Infosys interview screening ...%n BTech cut off percentage is %d%%",74 )	;
	System.out.println(fmt);
}
}