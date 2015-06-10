public class ShoppingCart {

	// Attributes
	private double total;

	// Constructors

	// Getters and Setters
	public double getTotal(){
		return total;
	}

	// Other Methods
	public void add(Book book) {
		book.applyDiscount(0.05);
		total += book.getPrice();
		System.out.println (book.getName() + " adicionado");
	}
}