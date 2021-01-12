package exceptions;

public class CheckedException extends Exception {
	int var1;
	CheckedException(int arg1){
		int var1=arg1;
	}
public String toString(){
	return  "MyException";
}
}
