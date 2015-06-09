public class BookEntry {
	public static void main(String[] args){

		Author author1 = new Author();
		author1.setName("Rafael Santos");
		author1.setEmail("rafaelcamargossantos@gmail.com");

		Ebook ebook1 = new Ebook(author1);
		ebook1.setName("Livro 1");
		ebook1.setDescription("Primeiro livro");
		ebook1.setPrice(59.99);
		ebook1.setWaterMark("Esse Livro pertence a Rafael");

		ebook1.showDetail();
	}
}