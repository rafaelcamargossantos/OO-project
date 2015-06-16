public class PrintedBook extends Book {
	// Attributes

	// Constructors
	public PrintedBook(Author author){
		super(author);
	}

	// Getters and Setters
	public double getPrintingCost(){
		return super.getPrice() * 0.05;
	}

	// Other Methods
	@Override
	public boolean applyDiscount(double discount) {
		if (discount <= 0.3){
			super.setPrice(super.getPrice() - super.getPrice()*discount);
			System.out.println("discont applied to printed book");
			return true;
		}
		else return false;
	}
}