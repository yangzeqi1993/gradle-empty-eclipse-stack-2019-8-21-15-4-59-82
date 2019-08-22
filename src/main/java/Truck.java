
public class Truck extends Car{
	
	protected String payload;
	
	public Truck(String engine, String wheels,  String payload) {
		super(engine, wheels);
		this.payload = payload;
	}
	
	public String start(){
		return this.engine + " is on and " + this.wheels + " are running!";
	}
	
	public String load() {
		return this.payload + " is loading goods";
	}

}
