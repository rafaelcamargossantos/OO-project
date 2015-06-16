public class MiniBook extends Book {

	public MiniBook(Author author){
		super(author);
	}

	@Override
	public boolean applyDiscount(double discount) {
		return false;
	}
}