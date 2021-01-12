package static_classes;
public class NestedTester {
	public static void main(String[] args) {
		OuterClass oi=new OuterClass();
		OuterClass.InnerClass i=oi.new InnerClass();
		System.out.println(OuterClass.var1);
		System.out.println(OuterClass.var2);
		System.out.println(i.var3);
		//System.out.println(InnerClass.var3);
		//System.out.println(InnerClass.var4);
	}

}
