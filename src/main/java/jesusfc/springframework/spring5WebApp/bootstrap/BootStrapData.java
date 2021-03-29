package jesusfc.springframework.spring5WebApp.bootstrap;

import jesusfc.springframework.spring5WebApp.model.Author;
import jesusfc.springframework.spring5WebApp.model.Book;
import jesusfc.springframework.spring5WebApp.model.Publisher;
import jesusfc.springframework.spring5WebApp.repositories.AuthorRepository;
import jesusfc.springframework.spring5WebApp.repositories.BookRepository;
import jesusfc.springframework.spring5WebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("JesúsLibrero", "Palma de Mallorca");
        publisherRepository.save(publisher);

        Author author = new Author("Jesús", "Fdez");
        Book book = new Book("Spring FrameWork 5", "56123456");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorRepository.save(author);
        bookRepository.save(book);


        Author author_1 = new Author("Abel", "FdezVives");
        Book noEJB = new Book("Spring Boot", "234234");
        author_1.getBooks().add(noEJB);
        noEJB.getAuthors().add(author_1);
        noEJB.setPublisher(publisher);

        authorRepository.save(author_1);
        bookRepository.save(noEJB);


        System.out.println("Started in Bootstrap");
        System.out.println("Num de libros: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.count());

    }
}
