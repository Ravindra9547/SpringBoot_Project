package production.coffee.entity;

public class Coffee {

private String coffeeType;
private Double price;

public Coffee(String coffeeType, Double price) {
	super();
	this.coffeeType = coffeeType;
	this.price = price;
}

public Coffee() {
	super();
}

public String getCoffeeType() {
	return coffeeType;
}

public void setCoffeeType(String coffeeType) {
	this.coffeeType = coffeeType;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Coffee [coffeeType=" + coffeeType + ", price=" + price + "]";
}

}
