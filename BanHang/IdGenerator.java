package BanHang;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator {
  private Long id = 0L;
  private ReentrantLock lock = new ReentrantLock();

  //Sinh số tự nhiên kiểu Long tăng tuần tự
  public Long getNewID() {
    Long result;
    lock.lock(); //Khoá biến id lại chỉ cho duy nhất một thread được truy xuất cập
    //để tránh tình trạng Data Racing !
    try {
      result = ++id; //Tăng rồi gán vào result
    } finally {
      lock.unlock(); //Tăng rồi thì mở lock cho thread khác cùng truy cập
      // Nhiều như mình dùng xong nhà vệ sinh thì đi ra thôi.
    }
    return result;
  }
}
