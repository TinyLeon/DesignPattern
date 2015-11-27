package myTrial;

public class MenuItem {
	private String _name;
	private String _description;
	private boolean _vegetarian;
	private double _price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		this._name = name;
		this._description = description;
		this._vegetarian = vegetarian;
		this._price = price;
	}

	public String getName() {
		return _name;
	}

	public String getDescription() {
		return _description;
	}

	public boolean getVegetarian() {
		return _vegetarian;
	}

	public double getPrice() {
		return _price;
	}
}
