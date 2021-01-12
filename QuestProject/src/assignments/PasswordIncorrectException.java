package assignments;

public class PasswordIncorrectException extends Exception{
	String message;
	PasswordIncorrectException(){	
	}
	PasswordIncorrectException(String message){
		super(message);
		this.message=message;
	}
	public String toString(){
		return message;
	}
}
