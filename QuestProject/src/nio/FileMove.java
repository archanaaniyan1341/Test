package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMove {

	public static void main(String[] args) {
		try {
			Path source=Paths.get("E:\\quest javaprograms\\txt1.txt");
			Path destination=Paths.get("E:\\quest javaprograms\\txt1\\txt1.txt");
			Files.move(source,destination,StandardCopyOption.ATOMIC_MOVE);
		}catch(InvalidPathException ip) {
			ip.printStackTrace();
		}
	catch(IOException io) {
			io.printStackTrace();
		}
	}
	}


