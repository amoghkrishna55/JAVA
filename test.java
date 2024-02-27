import java.util.Scanner;
import java.io.IOException;
public class test{
	public static void selectMenuItem(int itemNumber) {
		switch(itemNumber) {
			case 1: System.out.println("You selected: Spaghetti Bolognese");
				System.out.println("Price: $12.99");
				break;
			case 2: System.out.println("You selected: Margherita Pizza");
				System.out.println("Price: $9.99");
				break;
			case 3: System.out.println("You selected: Caesar Salad");
				System.out.println("Price: $8.49");
				break;
			case 4: System.out.println("You selected: Grilled Chicken Sandwich");
				System.out.println("Price: $10.99");
				break;
			case 5: System.out.println("You selected: Chocolate Brownie Sundae");
				System.out.println("Price: $6.99");
				break;
			default: System.out.println("Invalid item number. Please choose a valid item number.");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the item number (1 to 5): ");
		int itemNumber = scanner.nextInt();
		selectMenuItem(itemNumber);
	}
}