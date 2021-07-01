package BanHang;

public class LineItem implements Entity {
  private static Long genID = 1L;
  private Long id; //Unique id
  private Product product;
  private Integer unitPrice;
  private Integer quantity;
  
  @Override
  public Long getId() {
    return id;
  }

  public Integer getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public LineItem(Product product, Integer unitPrice, Integer quantity) {
    id = genID++;
    this.product = product;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "LineItem{" +
            "id=" + id +
            ", unitPrice=" + unitPrice +
            ", quantity=" + quantity +
            '}';
  }
}
