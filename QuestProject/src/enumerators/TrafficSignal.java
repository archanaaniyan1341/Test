package enumerators;

public enum TrafficSignal {
RED("Stop"),GREEN("Go"),YELLOW("Slow down");
	private String action;
	TrafficSignal(String action){
		System.out.println("Inside constructor");
		this.action=action;
	}
	public String getAction(){
		return this.action;
	}
}
