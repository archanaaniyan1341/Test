
public class CommandLineArgument {

	public static void main(String[] args) {
		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);
		float var3 = Float.parseFloat(args[2]);
		
		float sum=var1+var2+var3;
		System.out.println("Sum is "+sum);

	}

}
