
public class StringBufferAndBuilder1 {

	public static void main(String[] args) {
		StringBuffer sb1 =new StringBuffer();
		StringBuffer sb2 =new StringBuffer("Quest");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println(sb2.append("Global"));
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb2.reverse());
		
		StringBuilder sb3 =new StringBuilder("Black");
		StringBuilder sb4 =new StringBuilder("Flamessssssssssssssssss");
		
		System.out.println("length of sb3 "+sb3.length());
		System.out.println("capacity of sb3 "+sb3.capacity());
		System.out.println(sb3.hashCode());
		
		System.out.println("length of sb4 "+sb4.length());
		System.out.println("capacity of sb4 "+sb4.capacity());
		System.out.println(sb4.hashCode());
		
	}

}
