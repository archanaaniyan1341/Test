package inputoutput;

import java.io.File;

public class FileDirectoryList {

	public static void main(String[] args) {
		String dirName="C:\\Users\\hp\\Documents\\eclipse";
		File f1=new File(dirName);
		if(f1.isDirectory()) {
			System.out.println("directory name"+dirName);
			String str[]=f1.list();
			for(int incr=0;incr<str.length;incr++) {
				File file=new File(dirName+"//"+str[incr]);
				if(file.isDirectory()) {
					System.out.println(str[incr]+" is directory");
				}else {
					System.out.println(str[incr]+" is a file");
				}
			}
		}else {
			System.out.println(dirName+" is not irectory");
		}
	}

}
