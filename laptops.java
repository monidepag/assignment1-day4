package material;

import stock.inventory;

public class laptops extends inventory {
	public static int quantity;
	public static int lowOrderLevelQuantity;

	static {
		laptops.quantity = 0;
		laptops.lowOrderLevelQuantity = 3;
	}
	
	public String model;
	public int id;
	
	public laptops() {
		model = "HP";
		id = ++laptops.quantity;
	}
}
