package assignments;

public class UsernameLargeException extends Exception {
	String message;
	UsernameLargeException(){	
	}
	UsernameLargeException(String message){
		super();
		this.message=message;
	}
	public String toString(){
		return message;
	}
}
