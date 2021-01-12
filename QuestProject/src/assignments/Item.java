package assignments;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.Scanner;
public class Item extends JFrame {static
Scanner sc=new Scanner(System.in);
static	JTable jt;
static	String[] column_headers= {"Item No","ItemName","ItemPrice","ItemQuantity"};
static	String [][]data;
static int incr;
	public static void adminLogin() {
		System.out.println("Enter Admin name");
		String admin=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		if(admin.equals("Admin")){
			if(password.equals("Admin1234")) {
			System.out.println("Admin Login  Successful");
		}
	}System.out.println("Admin Login  Unsuccessful");
	
	}
	//String[][] data= {{"1","Item1","200","4"},{"2","Item2","300","5"},{"3","Item3","400","3"},{"4","Item4","800","8"}};
	public  void Item(int incr,int inc){
		
		for( incr=0;incr<5;incr++) {
			for( inc=0;inc<5;inc++) {
				data[incr][inc]=sc.next();
			}
		}
		jt=new JTable(data,column_headers);
		jt.setBounds(50, 50, 200, 230);
		JScrollPane js=new JScrollPane(jt);
		this.add(js);
		this.setSize(300,400);
		this.setVisible(true);
	}
	public static void payment() {
		
	}
	public static void main(String[] args) {
		
	}
}
