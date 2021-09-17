package vn.techmaster.bookstore.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import vn.techmaster.bookstore.model.Book;

public class BookDao extends Dao<Book> {

  public BookDao() {
    collections.add(new Book(1, "Không gia đình", "Chú bé Remy lang thang theo gánh xiếc của bác Vitaly"));
    collections.add(new Book(2, "Cuốn theo chiều gió", "Nội chiến Hoa kỳ, cuộc tình giữa Red Butler và Ohara"));
  }

  @Override
  public List<Book> getAll() {
    return collections;
  }

  @Override
  public Optional<Book> get(int id) {
    return collections.stream().filter(x -> x.getId() == id).findFirst();
    // TODO Auto-generated method stub
  }

  @Override
  public void add(Book book) {
    // TODO Auto-generated method stub
    collections.add(book);

  }

  @Override
  public void update(Book book) {
    Optional<Book> bookOptional = collections.stream().filter(x -> x.getId() == book.getId()).findFirst();
    if (bookOptional.isPresent()){
      bookOptional.get().setId(book.getId());
      bookOptional.get().setTitle(book.getTitle());
      bookOptional.get().setDescription(book.getDescription());
      collections.add(bookOptional.get());
    }
    // TODO Auto-generated method stub
  }

  @Override
  public void deleteByID(Integer id) {
    Optional<Book> bookOptional = collections.stream().filter(x -> x.getId() == id).findFirst();
    if (bookOptional.isPresent()) {
      collections.remove(bookOptional.get());
    }
    // TODO Auto-generated method stub
  }

  @Override
  public void delete(Book t) {
    // TODO Auto-generated method stub
  }  
}