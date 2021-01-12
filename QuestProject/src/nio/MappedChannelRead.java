package nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelRead {

	public static void main(String[] args) {
		try(FileChannel fchan=(FileChannel)Files.newByteChannel(Paths.get("E:\\quest javaprograms\\txt2.txt")
				, StandardOpenOption.WRITE,
				StandardOpenOption.READ)){
		long fSize=fchan.size();
		MappedByteBuffer nbuf=fchan.map(MapMode.PRIVATE, 0, fSize);
		for(int incr=0;incr<fSize;incr++) {
			System.out.print((char)nbuf.get());
		}
		System.out.println();
		}catch(InvalidPathException ip) {
			ip.printStackTrace();
		}
	catch(IOException io) {
			io.printStackTrace();
		}
		}
	}


