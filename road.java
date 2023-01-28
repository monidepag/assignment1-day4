abstract class vehicle {
	String color;
	int no_of_wheels;
	String model;
	public vehicle(String color, int no_of_wheels, String model) {
		
		this.color = color;
		this.no_of_wheels = no_of_wheels;
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNo_of_wheels() {
		return no_of_wheels;
	}
	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void display() {
		System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Number of wheels : " + this.no_of_wheels);
 	}
    abstract void honk();

}
class truck extends vehicle{
    public truck(String color, int no_of_wheels, String model) {
        super(color, no_of_wheels, model);
        
    }

    void honk()
    {
        System.out.println("Truck honks");
    }

}
class bus extends vehicle{
    public bus(String color, int no_of_wheels, String model) {
        super(color, no_of_wheels, model);
        
    }

    void honk()
    {
        System.out.println("Bus honks");
    }

}
class car extends vehicle{
    public car(String color, int no_of_wheels, String model) {
        super(color, no_of_wheels, model);
        
    }

    void honk()
    {
        System.out.println("Car honks");
    }

}
public class road {
	public static void main(String[] args) {
		truck t = new truck("grey", 6, "model T");
		bus b = new bus("black", 4, "model b");
		car c = new car("red", 4, "model c");

		t.honk();
		t.display();

		b.honk();
		b.display();

		c.honk();
		c.display();
	}
}