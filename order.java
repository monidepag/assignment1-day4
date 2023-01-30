package material;



public class order {
	String status;

	public order() {
		this.status = "Ordering";
	}

	void placeOrder(String item, int orderQuantity) {
		if (item.equals("Laptop")) {
			int newQuantity = laptops.quantity - orderQuantity;
			if(newQuantity < 0) System.out.println("Cannot place order as quantity not available.");
			else if (newQuantity < laptops.lowOrderLevelQuantity) System.out.println("RequestForMaterial issued.");
			else {
				System.out.println("Invoice generated.");
				laptops.quantity = newQuantity;
			}
		}
		else if (item.equals("Accessory")) {
			int newQuantity = accessories.quantity - orderQuantity;
			if(newQuantity < 0) System.out.println("Cannot place order as quantity not available.");
			else if (newQuantity < accessories.lowOrderLevelQuantity) System.out.println("RequestForMaterial issued.");
			else {
				System.out.println("Invoice generated.");
				accessories.quantity = newQuantity;
			}
		}
	}
}
