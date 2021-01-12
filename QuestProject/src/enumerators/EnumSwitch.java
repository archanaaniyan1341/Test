package enumerators;

public class EnumSwitch {
enum Day_new{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
	public static void main(String[] args) {
	Day_new day= Day_new.FRIDAY;
	switch(day) {
	case SUNDAY:
		System.out.println("sunday");
	break;
	case MONDAY:
		System.out.println("monday");
	break;
	case TUESDAY:
		System.out.println("tuesday");
	break;
	case WEDNESDAY:
		System.out.println("wednesday");
	break;
	case THURSDAY:
		System.out.println("thursday");
	break;
	case FRIDAY:
		System.out.println("friday");
	break;
	case SATURDAY:
		System.out.println("saturday");
	break;
	}
	}

}
