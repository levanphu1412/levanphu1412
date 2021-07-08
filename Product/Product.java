package Product;

public class Product {
    private static Long genID = 1L;
    private Long id;
    private String name;
    private String description;
    private Integer price;
    private Integer amount;
    private Integer amountSale;
    private Integer calculator;

    public Product(String name, String description, Integer price, Integer amount, Integer amountSale) {
        id = genID++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.amountSale = amountSale;
        this.setCalculator(calculator);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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

    public Integer getCalculator() {
        return calculator;
    }

    public void setCalculator(Integer calculator) {
        this.calculator = price * amountSale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", amountSale=" + amountSale +
                ", calculator=" + calculator +
                '}';
    }
}
