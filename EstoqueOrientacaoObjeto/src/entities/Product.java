package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
		
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
// soma o quantity do atributo com o quantity do argumento (parâmetro);
				
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
// subtrai o quantity do atributo com o quantity do argumento (parâmetro);
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
			
	}

}
