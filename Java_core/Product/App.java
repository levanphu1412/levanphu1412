package Product;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Iphone 12", "Promax", 1500, 100, 50));
        products.add(new Product("Iphone 11", "Promax", 1400, 90, 17));
        products.add(new Product("Iphone X", "Xsmax", 1000, 200, 10));
        products.add(new Product("Iphone 8", "8Plus", 700, 150, 20));
        products.add(new Product("Iphone 7", "7Plus", 500, 300, 40));
        products.add(new Product("Iphone 6", "6Lock", 300, 95, 15));

        products.forEach((product) -> {
            System.out.println(product);
        });

//        không sử dụng lamda
        System.out.println("sắp xếp theo tên");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        products.forEach((product) -> {
            System.out.println(product);
        });
//        sử dụng lam da
        System.out.println("sắp xếp theo tên dùng lamda");
        Collections.sort(products, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        products.forEach((product) -> {
            System.out.println(product);
        });
//        sắp xếp theo số lượng bán dc
        System.out.println("sắp xếp theo số lượng bán dc");
        Collections.sort(products, (o1, o2) -> {
            return o1.getAmountSale() - o2.getAmountSale();
        });
        products.forEach(product -> {
            System.out.println(product);
        });

//        lọc sản phẩm có mức giá trên 600
        System.out.println("danh sách sản phẩm có giá trên 600");
        products.stream().filter(price -> price.getPrice() > 600).forEach(product -> {
            System.out.println(product);
        });

        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < products.size(); i++) {
            map.put(products.get(i).getName(), products.get(i).getCalculator());
        }
        System.out.println(map);
    }
}
