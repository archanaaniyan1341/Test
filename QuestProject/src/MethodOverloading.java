
public class MethodOverloading {
	int var1=15;
	float var2=2.27f;
	String st="Tom";
	
	public void calculate(int var1,float var2) {
	        	float mul= var1*var2;
	        	System.out.println("var1 is "+var1);
	        	System.out.println("var2 is "+var2);
	        	System.out.println("mul is "+mul);
	}
	public void calculate(float var2,int var1) {
		double add=var1+var2;
		System.out.println("var1 is "+var1);
    	System.out.println("var2 is "+var2);
    	System.out.println("add is "+add);
		
}
	public void calculate(int var1,float var2, String st) {
		float sub=var1-var2;
		System.out.println("var1 is "+var1);
    	System.out.println("var2 is "+var2);
    	System.out.println("sub is "+sub);
    	System.out.println(st.concat("Tommy"));
    	
}		
	}
