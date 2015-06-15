public class SalesRegister {
	public static void main(String[] args) {

		Author author1 = new Author();
		author1.setName("Rafael Santos");

		PrintedBook printedBook1 = new PrintedBook(author1);
		printedBook1.setName("Livro 1");
		printedBook1.setPrice(59.90);

		Ebook ebook1 = new Ebook(author1);
		ebook1.setName("Livro 2");
		ebook1.setPrice(29.90);

		ShoppingCart cart = new ShoppingCart();
		cart.add(printedBook1);
		cart.add(ebook1);

		System.out.println("Total: " + cart.getTotal());
	}
}