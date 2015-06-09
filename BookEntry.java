public class BookEntry {
	public static void main(String[] args){

		Author author1 = new Author();
		author1.setName("Rafael Santos");
		author1.setEmail("rafaelcamargossantos@gmail.com");

		PrintedBook printedBook1 = new PrintedBook(author1);
		printedBook1.setName("Livro 1");
		printedBook1.setDescription("Primeiro livro");
		printedBook1.setPrice(59.90);

		printedBook1.showDetail();

		Ebook ebook1 = new Ebook(author1);
		ebook1.setName("Livro 2");
		ebook1.setDescription("Segundo livro");
		ebook1.setPrice(29.90);
		ebook1.setWaterMark("Esse Livro pertence a Rafael");

		ebook1.showDetail();
	}
}