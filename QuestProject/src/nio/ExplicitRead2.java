package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;

import java.nio.file.Paths;

public class ExplicitRead2 {
	public static void main(String[] args) {
		int count;
		try(SeekableByteChannel sChan=Files.newByteChannel(Paths.get("E:\\quest javaprograms\\txt1.txt"))){
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