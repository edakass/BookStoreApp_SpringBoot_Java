package com.edakas.bookstore.services;
//springboot service olduğunu gösteriyoruz
import com.edakas.bookstore.model.Book;
import com.edakas.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

//@ olanlar anotasyonlar
@Service
public class BookService {

    private final BookRepository bookRepository;
    public  BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public  Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks(){
        return  bookRepository.findAll();
    }

   /* public Optional<Book>findBookById(Integer bookId){
        /*Sen servis tarafında bunu  katabilirsin,kontrol tarafında hiçbir şekilde
        business case koymazsın eğer bir şey throw edilirse ,service den throw edersem
        bu service kontrol tarafında kullanılmayacak
         */
        //return bookRepository.findById(bookId);}
}
