package nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
	public static void main(String[] args) {
		try(FileChannel fchan=(FileChannel)Files.newByteChannel(Paths.get("E:\\quest javaprograms\\txt2.txt")
				, StandardOpenOption.WRITE,
				StandardOpenOption.CREATE,
				StandardOpenOption.READ)){
		
		MappedByteBuffer nbuf=fchan.map(FileChannel.MapMode.READ_WRITE, 0,26);
		for(int incr=0;incr<26;incr++) {
		nbuf.put((byte) ('A'+incr));
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
