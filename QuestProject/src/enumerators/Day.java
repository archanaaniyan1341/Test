package enumerators;

public enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	private Day() {
		System.out.println("Inside constructor");
	}
}
