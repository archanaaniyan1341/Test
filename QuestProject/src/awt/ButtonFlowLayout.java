package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ButtonFlowLayout extends Frame {
	ButtonFlowLayout(String title){
		super(title);
	}
	public static void main(String[] args) {
		ButtonFlowLayout bfl=new ButtonFlowLayout("Flow layout");
		Button b1=new Button("one");
		Button b2=new Button("two");
		Button b3=new Button("three");
		Button b4=new Button("four");
		Button b5=new Button("five");
		bfl.add(b1);
		bfl.add(b2);
		bfl.add(b3);
		bfl.add(b4);
		bfl.add(b5);
		bfl.setLayout(new FlowLayout());
		bfl.setBounds(300,200,300,200);
		bfl.setVisible(true);
	}

}
