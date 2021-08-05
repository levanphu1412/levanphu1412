package SanPham.Product;

import java.util.*;

public class ProductRespository {
    Scanner scanner = new Scanner(System.in);
    List<Product> product;
    public void productRespository() {
        product = new ArrayList<Product>();
        product.add(new Product("MS1", "Samsung S10", "Thiết bị điện tử", 20000000L, 50, 15));
        product.add(new Product("MS2", "Iphone 12Promax", "Thiết bị điện tử", 30000000L, 95, 23));
        product.add(new Product("MS3", "Mì tôm Omachi/thùng", "Thức ăn", 200000L, 350, 78));
        product.add(new Product("MS4", "Quân jean nam", "Thời trang", 450000L, 138, 36));
        product.add(new Product("MS5", "Kem dưỡng da", "Mỹ phẩm", 1200000L, 45, 27));
        product.add(new Product("MS6", "Chảo chống dính", "Đồ gia dụng", 650000L, 324, 156));
        product.add(new Product("MS7", "Son hồng cánh sen", "Mỹ phẩm", 800000L, 85, 21));
        product.add(new Product("MS8", "Giày thể thao", "Thời trang", 750000L, 124, 44));
        product.add(new Product("MS9", "Loa Bluetooth", "Thiết bị điện tử", 20000000L, 83, 29));
        product.add(new Product("MS10", "1 Kg thịt heo", "Thức ăn", 130000L, 76, 18));
    }

    public void showProduct() {
        for(Product p : product) {
            System.out.println(p);
        }
    }

    public void addProduct() {
        System.out.println("Nhập mã sản phẩm");
        String ma = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập loại sản phẩm");
        String type = scanner.nextLine();
        System.out.println("Nhập giá");
        Long price = scanner.nextLong();
        System.out.println("Nhập số lượng");
        Integer amount = scanner.nextInt();
        System.out.println("Nhập số lượng bán được");
        Integer amountSale = scanner.nextInt();

        Product prodcut1 = new Product(ma, name, type, price, amount, amountSale);
        product.add(prodcut1);
        showProduct();
    }

    public void findByMaAndUpdate() {
        System.out.println("Nhập mã sản phẩm cần sửa");
        String input = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < product.size(); i++) {
            if(product.get(i).getMaSanPham().equalsIgnoreCase(input)) {
                System.out.println("Sửa tên sản phẩm");
                product.get(i).setName(scanner.nextLine());
                System.out.println("sửa loại sản phẩm");
                product.get(i).setType(scanner.nextLine());
                System.out.println("sửa giá sản phẩm");
                product.get(i).setPrice(scanner.nextLong());
                System.out.println("sửa số lượng");
                product.get(i).setAmount(scanner.nextInt());
                System.out.println("sửa số lượng bán");
                product.get(i).setAmountSale(scanner.nextInt());
                System.out.println("sản phẩm sau khi sửa");
                System.out.println(product.get(i));
                count++;
            }
        }
        if(count == 0) System.out.println("mã sản phẩm không đúng");
    }

    public void findByMaAnDelete() {
        System.out.println("Nhập mã sản phẩm cần xóa");
        String input = scanner.nextLine();
        int count = 0;
        for(int i  = 0; i < product.size(); i++) {
            if(product.get(i).getMaSanPham().equalsIgnoreCase(input)) {
                product.remove(i);
                count++;
                System.out.println("danh sách sản phẩm sau khi xóa");
                showProduct();
            }
        }if(count == 0) System.out.println("mã sản phẩm không tồn tại");
    }

    public void showMap_1() {
        Map<String, Integer> map1 = new HashMap<>();
        for(int i = 0; i < product.size(); i++) {
            map1.put(product.get(i).getName(), product.get(i).getAmountSale());
        }
       Set<String> set = map1.keySet();
        for (String list : set) {
            System.out.println(list + " - " + map1.get(list));
        }
    }


    public void showMap_2() {
        Map<String, Integer> map2 = new HashMap<>();

        for(int i = 0; i < product.size(); i++) {
            int total = product.get(i).getAmount();
            for(int j = 0; j < product.size(); j++) {
                if(i == j) {
                    continue;
                }
                if(product.get(i).getType().equalsIgnoreCase(product.get(j).getType())) {
                    total  += product.get(j).getAmount();
                    map2.put(product.get(i).getType(), total);
                }else {

                    map2.put(product.get(i).getType(), total);
                }

            }
        }
        Set<String> set = map2.keySet();
        for(String list : set) {
            System.out.println(list + " - " + map2.get(list));
        }
    }

    public void sortByName() {
        Collections.sort(product, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        showProduct();
    }
}
