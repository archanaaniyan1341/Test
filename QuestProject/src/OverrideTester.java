
public class OverrideTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassOverride sco=new SubClassOverride();
		sco.calculate(11, 107.8f);
		sco.calculate1();
		sco.calculate2();
		sco.calculate3();
		sco.calculate4();
		//sco.calculate(11f,107.8f); not overriding
	}

}
