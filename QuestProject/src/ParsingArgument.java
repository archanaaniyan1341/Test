
public class ParsingArgument {
	int calculateFraction(int arg1, int arg2) {
		int fraction=arg1/arg2;
		return fraction;
	}
	int var1;
	int var2;
	ParsingArgument(int arg1, int arg2){
		var1=arg1;
		var2=arg2;
		
	}
 public static void main(String[] args) {
		
		int var1=60;
		int var2=6;
		ParsingArgument pa=new ParsingArgument(18,6);
		 int fraction=pa.calculateFraction(var1, var2);
		 System.out.println("Fraction is "+fraction);
}
}