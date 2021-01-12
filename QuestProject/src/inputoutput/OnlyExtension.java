package inputoutput;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExtension implements FilenameFilter{
	String exten_sion;
	
	 OnlyExtension(String extension){
		 exten_sion=extension;
	 }
	@Override
	public boolean accept(File directory, String name) {
		
		return name.endsWith(exten_sion);
	}
}
