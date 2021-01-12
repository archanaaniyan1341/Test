package static_classes;

public class OuterClass {
	int x=10;
	static int s=6;
	int a;
	protected OuterClass(int arg1){
		a=arg1;
		int b=a+1;
		System.out.println(b);
	}
	private class InnerClass{
		int y=x+1;
		private InnerClass(int arg2){
			int i1=y+arg2;
			int i2=a+arg2;
			System.out.println(i1);
			System.out.println(i2);
		}
		void print(){
		System.out.println(y);
	}
	}
	private static class StaticClass{
		static int z=s*10;
		static int c=s/2;
		public static void display() {
			System.out.println(z);
		}
		private static void display1() {
			System.out.println(z+c);
		}
	}
	public static void main(String args[]) {
		OuterClass o=new OuterClass(4);
		OuterClass.InnerClass in=o.new InnerClass(2);
		in.print();
		StaticClass.display();
		StaticClass.display1();
	}
}
