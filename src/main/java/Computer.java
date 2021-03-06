
public class Computer {

	private String make;
	private String model;
	private double price;

	public Computer(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Computer theOther = (Computer) obj;
		
		return this.price == theOther.price &&
				this.make == theOther.make && 
				this.model == theOther.model;
	}


}
