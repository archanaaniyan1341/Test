package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class TestButtonEx extends Frame{
	TestButtonEx(String title){
		super(title);
	}
	public static void main(String[] args) {
		TestButtonEx tb=new TestButtonEx("Frame with buttons");
		Button b1=new Button("one");
		Button b2=new Button("two");
		Button b3=new Button("three");
		Button b4=new Button("four");
		Button b5=new Button("five");
	tb.add(b1,BorderLayout.NORTH);
	tb.add(b2,BorderLayout.EAST);
	tb.add(b3,BorderLayout.WEST);
	tb.add(b4,BorderLayout.SOUTH);
	tb.add(b5,BorderLayout.CENTER);
	tb.setBounds(300,200,300,400);
	tb.setVisible(true);
	}

}
