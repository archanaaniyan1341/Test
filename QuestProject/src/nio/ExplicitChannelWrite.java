package nio;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {

	public static void main(String[] args) {
	try(FileChannel fchan=(FileChannel)Files.newByteChannel(Paths.get("E:\\\\quest javaprograms\\\\txt31.txt")
			, StandardOpenOption.WRITE,
			StandardOpenOption.CREATE)){
		ByteBuffer mBuf=ByteBuffer.allocate(50);
		for(int incr=0;incr<26;incr++) {
			mBuf.put((byte) ('A'+incr));
		}
		mBuf.flip();
		fchan.write(mBuf);
	} catch(InvalidPathException ip) {
		ip.printStackTrace();
	}
catch(IOException io) {
		io.printStackTrace();
	}
	}
}
