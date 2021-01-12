package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {

	public static void main(String[] args) {
		int count;
		Path filePath=null;
		try {
			filePath=Paths.get("E:\\quest javaprograms\\txt1.txt");
			
		}catch(InvalidPathException ip) {
			ip.printStackTrace();
		}
		try(SeekableByteChannel sChan=Files.newByteChannel(filePath)){
			ByteBuffer nbuf=ByteBuffer.allocate(128);
			do {
				count=sChan.read(nbuf);
				if(count!=-1) {
					nbuf.rewind();
					for(int incr=0;incr<count;incr++) {
						System.out.print((char)nbuf.get());
					}
				}
			}while(count!=-1);
			System.out.println();
		}catch(IOException io) {
			io.printStackTrace();
		}

	}

}
