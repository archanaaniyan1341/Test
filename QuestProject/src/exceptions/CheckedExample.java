package exceptions;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class CheckedExample {

	public static void main(String[] args) {
		PrintWriter pw=null;
		try {
			pw=new PrintWriter("E://test.txt");
			pw.println("Hello Quest Global");
		}catch(FileNotFoundException f) {
			f.printStackTrace();
			System.out.println(f);
		}finally {
			pw.close();
		}
		System.out.println("File Successfully Saved");
	}

}
