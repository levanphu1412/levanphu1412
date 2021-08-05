package SanPham.Product;

public class Product {
    private String maSanPham;
    private String name;
    private String type;
    private Long price;
    private Integer amount;
    private Integer amountSale;

    public Product(String maSanPham, String name, String type, Long price, Integer amount, Integer amountSale) {
        this.maSanPham = maSanPham;
        this.name = name;
        this.type = type;
        this.price = price;
        this.amount = amount;
        this.amountSale = amountSale;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(Integer amountSale) {
        this.amountSale = amountSale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham='" + maSanPham + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", amountSale=" + amountSale +
                '}';
    }
}
