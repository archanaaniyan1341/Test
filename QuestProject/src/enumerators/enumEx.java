package enumerators;

public class enumEx {
public enum Season{
	SPRING,WINTER,SUMMER,FALL
}
	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s);
		}
	}
}
