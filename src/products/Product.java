package products;

public class Product {
	protected String name;
	protected Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	
	public void addPrice(double prices) {
		price += prices;
	}
	
	public void removePrice(double prices) {
		price -= prices;
	}
	
	public String priceTag() {
		return name+" $"+ String.format("%.2f", price);
	}
	
}
