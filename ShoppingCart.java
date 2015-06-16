public class ShoppingCart {

	// Attributes
	private double total;

	// Constructors

	// Getters and Setters
	public double getTotal(){
		return total;
	}

	// Other Methods
	public void add(Product product) {
		total += product.getPrice();
		System.out.println (product + " adicionado");
	}
}