//饮料抽象类
public abstract class Beverage {
	// 饮料描述
	String description = "unknown beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}

