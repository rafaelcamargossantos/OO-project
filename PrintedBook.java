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
}