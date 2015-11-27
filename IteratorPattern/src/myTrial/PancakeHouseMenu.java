package myTrial;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake breakfast",
				"Pancake with scrambled eggs, and toast", true, 2.99);

		addItem("Regular Pancake Breakfast",
				"Pancake with fried eggs, sausage", false, 2.99);

		addItem("Blueberry Pancakes", "Pancake made with fresh blueberries",
				true, 3.49);

		addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	// µü´úÆ÷
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
}
