package exceptions;

public class MyException extends RuntimeException {
	int var1;
	MyException(int arg1){
		int var1=arg1;
	}
public String toString(){
	return  "MyException";
}
}
