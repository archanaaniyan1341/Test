import java.util.Scanner;
public class ConditionalOperatorsJava {
		int var1=60;
		int var2=89;
		int number;
		Scanner sc= new Scanner(System.in);
		// ternary operator
		void ternary() {
			System.out.println("ternary operator");	
		System.out.println("var1");
		int var1=sc.nextInt();
		int var2=(var1==10)?20:30;
				System.out.println(var2);
		}// end of ternary method
		
		// if-else condition
		void ifElseMethod() {
			System.out.println("if-else condition");
		if(var1>var2) {
			System.out.println("Var1 is larger");
		}//end of if
		else {
			System.out.println("Var2 is larger");
		}//end of else
		}//end of method
		
		// if else if method
		void ifElseIf() {
			System.out.println("enter the number");
			 number= sc.nextInt();
			if(number<50) {
				System.out.println("Fail");
			}
			else if(number>=50&&number<60) {
				System.out.println("D Grade");
			}
			else if(number>=60&&number<70) {
				System.out.println("C Grade");
			}
			else if(number>=70&&number<80) {
				System.out.println("B Grade");
			}
			else if(number>=80&&number<90) {
				System.out.println("A Grade");
			}
			else if(number>=90&&number<100) {
				System.out.println("OS Grade");
			}
			else {
				System.out.println("Invalid");
			}
		}//end of ifElseIf method
		
		//switch condition
		void switchExample() {
			int arg1;
			arg1=3;
			switch(arg1) {
			case 1:
				System.out.println("Sunday");
			break;
			case 2:
				System.out.println("Monday");
			break;
			case 3:
				System.out.println("Tuesday");
			break;
			case 4:
				System.out.println("Wednesday");
			break;
			case 5:
				System.out.println("Thursday");
			break;
			case 6:
				System.out.println("Friday");
			break;
			case 7:
				System.out.println("Saturday");
			break;
			default:
				System.out.println("Not valid");
			break;
			}
		}// end of switch case
		
		void nestedIf() {
			int num1=34;
			int num2= 67;
			int num3=15;
			if(num1>num2) {
				if(num1>num3) {
					System.out.println("num1 is the largest");
				}
				else {
					System.out.println("num3 is the largest");
				}
			}
			else {
				System.out.println("num2 is the largest");
			}
		}
		
		void evenOdd() {
			if(var1%2==0) {
				System.out.println("Var1 is even");
			}
			else {
				System.out.println("Var1 is odd");
			}
		}//end of evenOdd method
	//end of class

	public static void main(String[] args) {
		ConditionalOperatorsJava co=new ConditionalOperatorsJava();
		co.ternary();
		co.ifElseMethod();
		co.ifElseIf();
		co.switchExample();
		co.nestedIf();
		co.evenOdd();
	}

}
