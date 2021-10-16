package com.edakas.bookstore;

import com.edakas.bookstore.model.Book;
import com.edakas.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
/* @ annotations base bir şey
siz uygulamanızın  içerisinde spring üzerinde yapacağımız konfigürasyonlara herhangi bir xml dosyası ya da
herhangi bir kodlama yazmak yerine annotations, @ ile ifade ettiklerimize annotations deniliyor.
* */
public class BookStoreApplication implements CommandLineRunner {

	private  final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);

	}
   //uygulama ayağa kalkarken main run ile birlikte çalışıyor
	@Override
	public void run(String... args) throws Exception {
		Book book1=Book.builder()
				.name("FAUST")
				.author("GOETHE")
				.price(20.0)
				.stock(100).build();

		Book book2=Book.builder()
				.name("WUTHERING HEIGHTS")
				.author("EMILY BRONTE")
				.price(30.5)
				.stock(10).build();

		Book book3=Book.builder()
				.name("THE CALL OF THE WILD)")
				.author("JACK LONDON")
				.price(10.4)
				.stock(5).build();
		bookRepository.saveAll(Arrays.asList(book1,book2,book3));

	}
}
