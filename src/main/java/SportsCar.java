
public class SportsCar extends Car {
	
	protected String lights;
	
	public SportsCar(String engine, String wheels,  String lights) {
		super(engine, wheels);
		this.lights = lights;
	}
	
	public String start(){
		return this.engine + " is on and " + this.wheels + " are running!";
	}
	
	public String startSportsCar() {
		return this.lights + " are shining, " + this.engine + " is on and " + this.wheels + " are running!";
	}
	
	public String speedOn() {
		return this.engine + " is overload and " + this.wheels + " are super running!";
	}
	
}
