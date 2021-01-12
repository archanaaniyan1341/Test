package enumerators;

public class EnumConstructor {

	public static void main(String[] args) {
		TrafficSignal [] signals=TrafficSignal.values();
		for(TrafficSignal signal:signals) {
			System.out.println("Signal:"+signal.name()+" ,Action:"+signal.getAction());
		}

	}

}
