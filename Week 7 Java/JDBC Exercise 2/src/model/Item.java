package model;

public class Item {
	int id;
	String name;
	int quantity_in_stock;
	double price;
	
	public Item() {
		
	}
	
	public Item(int id, String name, int quantity_in_stock, double price) {
		this.id = id;
		this.name = name;
		this.quantity_in_stock = quantity_in_stock;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity_in_stock=" + quantity_in_stock + ", price=" + price
				+ "]";
	}
	
	
	
}
