package enumerators;

public class EnumDayTest {
public Day day;
public EnumDayTest(Day day) {
	this.day=day;
}
public void tellItLikeItIs() {
	switch(day) {
	case SUNDAY:
		System.out.println("sunday is fun");
	break;
	case MONDAY:
		System.out.println("monday is bad");
	break;
	case FRIDAY:
		System.out.println("friday is borring");
	break;
	case SATURDAY:
		System.out.println("saturday is weekend");
	break;
	default:System.out.println("mid days are sleepy");
	}
}
	public static void main(String[] args) {
		EnumDayTest firstDay=new EnumDayTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumDayTest secondDay=new EnumDayTest(Day.TUESDAY);
		secondDay.tellItLikeItIs();
		EnumDayTest fifthDay=new EnumDayTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumDayTest lastDay=new EnumDayTest(Day.SUNDAY);
		lastDay.tellItLikeItIs();
	}
	

}
