package material;




import java.util.*;

import stock.inventory;

public class testerorder {
	public static void main(String[] args) {
		ArrayList<inventory> l = new ArrayList<>();
		for(int i = 0; i < 5; i++) l.add(new laptops());
		for(int i = 0; i < 10; i++) l.add(new accessories());
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Press 1 for ordering laptop, 2 for accessory and 0 for exit:");
			int input = sc.nextInt();
			if (input == 0) break;
			System.out.println("Enter quantity to order:");
			int qnt = sc.nextInt();
			order o = new order();
			if(input == 1) o.placeOrder("Laptop", qnt);
			else if(input == 2) o.placeOrder("Accessory", qnt);
		} while(true);
	}
}
