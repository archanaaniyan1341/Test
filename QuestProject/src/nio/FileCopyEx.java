package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyEx {

	public static void main(String[] args) {
		try {
			Path source=Paths.get("E:\\quest javaprograms\\txt2.txt");
			Path destination=Paths.get("E:\\quest javaprograms\\a2.txt");
			Files.copy(source,destination,StandardCopyOption.REPLACE_EXISTING);
		}catch(InvalidPathException ip) {
			ip.printStackTrace();
		}
	catch(IOException io) {
			io.printStackTrace();
		}
	}

}
