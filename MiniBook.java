public class MiniBook extends Book {

	public MiniBook(Author autor){
		super(author)
	}

	@Override
	public boolean applyDiscount(double discount) {
		return false
	}
}