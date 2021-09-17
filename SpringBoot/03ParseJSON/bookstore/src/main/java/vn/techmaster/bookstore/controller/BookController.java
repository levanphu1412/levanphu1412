package vn.techmaster.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.bookstore.model.Book;
import vn.techmaster.bookstore.repository.BookDao;

@Controller
@RequestMapping("/book")
public class BookController {
  @Autowired
  private BookDao bookDao;

  @GetMapping
  public String listAll(Model model) {
    model.addAttribute("books", bookDao.getAll());
    return "allbooks";
  }

  @GetMapping("/getById")
  public ResponseEntity getById(@RequestParam Integer id) {
    return ResponseEntity.ok(bookDao.get(id));
  }

  @PostMapping("/add")
  public ResponseEntity add(@RequestBody Book book) {
    bookDao.add(book);
    return ResponseEntity.ok(book);
  }

  @PutMapping ("/update")
  public ResponseEntity update(@RequestBody Book book) {
    bookDao.update(book);
    return ResponseEntity.ok(book);
  }

  @DeleteMapping ("/deleteById")
  public ResponseEntity deleteById(@RequestParam Integer id) {
    bookDao.deleteByID(id);
    return ResponseEntity.ok("xóa thành công");
  }
}
