package FPT;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository {
    ArrayList<Product> products = new ArrayList<>();
    public void productRepository() {
        products = new ArrayList<Product>();
        products.add(new Product("Oppo Reno5 8GB", "128GB", 8390000, 10, 7, "OPPO", Category.PHONE.getValue()));
        products.add(new Product("Oppo Reno4 Pro", "Oppo Reno4 Pro", 8151000, 25, 10, "OPPO", Category.PHONE.getValue()));
        products.add(new Product("Samsung Galaxy Z Flip","Samsung Galaxy Z Flip", 13497000, 10, 3, "Samsung", Category.PHONE.getValue()));
        products.add(new Product("Oppo A92", "Oppo A92", 5990000, 30, 15, "OPPO", Category.PHONE.getValue()));
        products.add(new Product(" Xiaomi Redmi 9 4GB-64GB", " Xiaomi Redmi 9 4GB-64GB",3190000, 30, 25, "Xiaomi", Category.PHONE.getValue()));
        products.add(new Product("Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T", 20790000, 10, 6, "Asus", Category.LAPTOP.getValue()));
        products.add(new Product("Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 21840000, 15, 4, "Dell", Category.LAPTOP.getValue()));
        products.add(new Product("Dell Inspiron N7501 i7 10750H ", "Dell Inspiron N7501 i7 10750H ", 28970000, 10, 1, "Dell", Category.LAPTOP.getValue()));
        products.add(new Product("MacBook Air 13\" 2020 M1 16GB/256GB","MacBook Air 13\" 2020 M1 16GB/256GB", 33990000, 20, 4, "MacBook", Category.APPLE.getValue()));
        products.add(new Product("Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000, 20, 15, "Phụ Kiện", Category.ACCESSORIES.getValue()));
        products.add(new Product("Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000, 30, 10, "i.value", Category.ACCESSORIES.getValue()));
        products.add(new Product("Pin sạc dự phòng 10000mAh Mi Ultra Compact", "Pin sạc dự phòng 10000mAh Mi Ultra Compact",  710000 , 30, 10, "Xiaomi", Category.ACCESSORIES.getValue()));
        products.add(new Product("Vivo Y20 4GB-64GB", "Vivo Y20 4GB-64GB ", 3690000, 15, 10, "Vivo", Category.PHONE.getValue()));

//        for(Product p : products){
//            System.out.println(p);
//        }


    }

    public void getProductByCategory(){
        System.out.println("danh sách sản phẩm theo danh mục");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:

                products.stream().filter(list -> list.getCategory().equalsIgnoreCase(Category.APPLE.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            case 2:
                products.stream().filter(list -> list.getCategory().equalsIgnoreCase(Category.PHONE.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            case 3:
                products.stream().filter(list -> list.getCategory().equalsIgnoreCase(Category.LAPTOP.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            case 4:
                products.stream().filter(list -> list.getCategory().equalsIgnoreCase(Category.ACCESSORIES.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            default:
                System.out.println("nhập sai");
                break;
        }
    }

    public void getProductByManufacturer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hãng");
        String str = scanner.nextLine();
        products.stream().filter(list -> list.getManufacturer().equals(str))
                .forEach(list -> System.out.println(list));
    }


    public void getProductByPrice() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                products.stream().filter(money -> money.getPrice() < 2000000)
                        .forEach(list -> System.out.println(list));
                break;
            case 2:
                products.stream().filter(money -> money.getPrice() > 2000000 && money.getPrice() < 4000000)
                        .forEach(list -> System.out.println(list));
                break;
            case 3:
                products.stream().filter(money -> money.getPrice() > 4000000 && money.getPrice() < 7000000)
                        .forEach(list -> System.out.println(list));
                break;
            case  4:
                products.stream().filter(money -> money.getPrice() > 7000000 && money.getPrice() < 13000000)
                        .forEach(list -> System.out.println(list));
                break;
            case 5:
                products.stream().filter(money -> money.getPrice() > 13000000)
                        .forEach(list -> System.out.println(list));
                break;
            default:
                System.out.println("Nhập Sai");
                break;
        }
    }

    public void getProductByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm");
        String str = scanner.nextLine();
        products.stream().filter(name -> name.getName().equalsIgnoreCase(str))
                .forEach(list -> System.out.println(list));
    }

}
