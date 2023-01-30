package material;

import stock.inventory;

public class accessories extends inventory {
	public static int quantity;
	public static int lowOrderLevelQuantity;
	static {
		accessories.quantity = 0;
		accessories.lowOrderLevelQuantity = 5;
	}
	
	public String type;
	public int id;
	public accessories() {
		type = "Headphones";
		id = ++accessories.quantity;
	}
}
