package hackerrank;


	public class ExceptionExample{
		public static void main(String args[]){ 
			try{ int incr, sum; 
			sum = 10; 
			for (incr = -1; incr < 3 ;++incr){
				sum = (sum / incr);
				System.out.print(incr);
				}//end of for loop 
			}catch(ArithmeticException e){
				System.out.print("0"); 
				}//end of catch
			}//end of main
		}//end of class
		
	


