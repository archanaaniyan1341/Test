package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class FramesPanel extends Frame {

	public static void main(String[] args) {
	FramesPanel fp=new FramesPanel();
	Panel pan=new Panel();
	Label one=new Label("one",Label.LEFT);
	Label two=new Label("two",Label.CENTER);
	Label three=new Label("three",Label.RIGHT);
	pan.add(one);
	pan.add(two);
	pan.add(three);
	fp.add(pan);
	fp.setSize(400,300);
	fp.setTitle("Frame with panel");
	fp.setVisible(true);

	}

}
