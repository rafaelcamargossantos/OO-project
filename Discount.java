public class Discount {
	public static void main(String[] args) {

		Author author1 = new Author();
		author1.setName("Rafael Santos");
		author1.setEmail("rafaelcamargossantos@gmail.com");

		Book book = new Book(author1);
		book.setPrice(59.99);

		if (book.applydiscount(0.2)){
			System.out.println("Preço do livro com desconto: " + book.getPrice());
		}
		else System.out.println("Desconto não pode ser maior que 30%");

		Ebook ebook = new Ebook(author1);
		ebook.setPrice(29.90);

		if (ebook.applydiscount(0.15)){
			System.out.println("Preço do ebook com desconto: " + ebook.getPrice());
		}
		else System.out.println("Desconto não pode ser maior que 15%");
	}
}