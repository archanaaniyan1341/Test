
public class LoopsContinueBreak {
	
	int var1=1;
void whileExample() {
	System.out.println("while loop");
		while(var1<10) {
			System.out.println(var1);
			var1++;
		}
	
}
	void dowhileExample() {
		System.out.println("do while loop");
		do {
			System.out.println(var1);
			var1++;
		}
		while(var1<10);
			
		}
	void forExample() {
		System.out.println("for loop");
		for(int var1=0; var1<10; var1++) {
			System.out.println(var1);
		}
			
	}
	void breakMethod() {
		System.out.println("break");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	void continueMethod() {
		System.out.println("continue");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		LoopsContinueBreak lij=new LoopsContinueBreak();
		
		lij.whileExample();
		lij.dowhileExample();
		lij.forExample();
		lij.breakMethod();
		lij.continueMethod();

	}

}
