package enumerators;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatterLocale {

static void localeFormatterNonIndian() {
	long k=1000;
	long m=1000000;
	long t=1000000000;
	System.out.println("French locale:");
	System.out.format(Locale.FRENCH,"One thousand:%d %n",k);
	System.out.format(Locale.FRENCH,"One million:%d %n",m);
	System.out.format(Locale.FRENCH,"One billion:%d %n",t);
	
	System.out.println("German locale:");
	System.out.format(Locale.GERMAN,"One thousand:%d %n",k);
	System.out.format(Locale.GERMAN,"One million:%d %n",m);
	System.out.format(Locale.GERMAN,"One billion:%d %n",t);
	
	System.out.println("Indian locale:");
	System.out.format(Locale.getDefault(),"One thousand:%d %n",k);
	System.out.format(Locale.getDefault(),"One million:%d %n",m);
	System.out.format(Locale.getDefault(),"One billion:%d %n",t);
	
	System.out.println("Default locale:Indian");
	System.out.format("One thousand:%d %n",k);
	System.out.format("One million:%d %n",m);
	System.out.format("One billion:%d %n",t);
}
static void localeFormatterIndian() {
	long k=1000;
	long m=1000000;
	long t=1000000000;
	NumberFormat formatter=NumberFormat.getCurrencyInstance(new Locale("en","US"));
	String moneyString=formatter.format(k);
	String moneyString1=formatter.format(m);
	String moneyString2=formatter.format(t);
	System.out.println("One thousand :"+moneyString);
	System.out.println("One million :"+moneyString1);
	System.out.println("One billoion:"+moneyString2);
}
	public static void main(String[] args) {
		localeFormatterNonIndian();
		System.out.println("*****************");
		localeFormatterIndian();

	}

}
