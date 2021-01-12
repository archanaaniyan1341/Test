package assignments;

public class UsernameSmallException extends Exception {
	String message;
	UsernameSmallException(){	
	}
	UsernameSmallException(String message){
		super();
		this.message=message;
	}
	public String toString(){
		return message;
	}
}
