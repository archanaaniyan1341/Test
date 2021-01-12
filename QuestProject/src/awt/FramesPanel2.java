package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class FramesPanel2 extends Frame {
	Panel pan;
	Label one;
	Label two;
	Label three;
	FramesPanel2(){
		 pan=new Panel();
		 one=new Label("one",Label.LEFT);
		 two=new Label("two",Label.CENTER);
		 three=new Label("three",Label.RIGHT);
		pan.add(one);
		pan.add(two);
		pan.add(three);
		add(pan);
		setBounds(400,300,300,200);
		setTitle("Frame with panel");
		setVisible(true);
	}

	public static void main(String[] args) {
		new FramesPanel2();

	}

}
