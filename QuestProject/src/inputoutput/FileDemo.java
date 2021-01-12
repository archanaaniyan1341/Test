package inputoutput;

import java.io.File;

public class FileDemo {
static void display(String str) {
	System.out.println(str);
}
	public static void main(String[] args) {
File f=new File("E:\\fileio");
File f1=new File(f,"advanced css.docx");
display(f1.getName());
display(f1.getPath());
display(f1.getAbsolutePath());
display(f1.getParent());
display(f1.exists()?"exists":"does not exist");
display(f1.canRead()?"Readable":"Not Readable");
display(f1.canWrite()?"Writable":"Not writable");
display(f.isDirectory()?"directory":"not directory");
display(f1.isAbsolute()?"absolute":"not absolute");
display(f1.isFile()?"file":"not file");
display("last modified"+f1.lastModified());
display("length"+f1.length()+"bytes");
	}

}
