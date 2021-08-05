package KiemTraCuoiKi_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Constroller {
    Scanner scanner = new Scanner(System.in);
    List<User> users;

    public void getData() {
        users = new ArrayList<>();
        users.add(new User(1L, "levanphu", "levanphu5555@gmail.com", "Levanphu123"));
        users.add(new User(2L, "nguyenthanhphuong", "nguyenthanhphuong545@gmail.com", "Nguyenphuong123"));
        users.add(new User(3L, "ronaldo", "ronaldo@gamil.com", "Ronaldo45"));
        users.add(new User(4L, "vuhaiha", "vuhaiha@gmail.com", "Havu456"));
        users.add(new User(5L, "hoanghaiduong", "hoangduong@gmail.com", "Hoangduong1703"));
        users.add(new User(6L, "messi", "leomessi@gmail.com", "Leoleo28"));
        users.add(new User(7L, "vanpersie", "vapersie1999@gmail.com", "Persienopro1"));
        users.add(new User(8L, "aubameyang", "aubameyang99@gmail.com", "2R3aOqo"));
        users.add(new User(9L, "ronaldinho", "ronaldinho2730@gmail.com", "aRYD1MZBHlJ"));
        users.add(new User(10L, "arshavin", "arshavin123@gmail.com", "Arshavin23"));

    }

    public void login() {
        //Thực hiện đăng nhập\
        boolean check = true;
        while (check) {
            System.out.println("nhập tên đăng nhập");
            String userName = scanner.next();
            System.out.println("Nhập mật khẩu");
            String password = scanner.next();
            int count = 0;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUsername().equals(userName)) {
                    count++;
                    if (users.get(i).getPassword().equals(password)) {
                        System.out.println("Đăng nhập thành công");
                        System.out.println("xin chào " + users.get(i).getUsername());
                        loginController(users.get(i));
                        check = false;
                        break;
                    } else {
                        loginFail();
                        break;
                    }
                }
            }
            if (count == 0) System.out.println("kiểm tra lại tên đăng nhập");
        }
    }

    public void forgotPassword() {
        //Quên mật khẩu
        boolean check = true;
        while (check) {
            System.out.println("nhập email");
            String email = scanner.next();
            int count = 0;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(email)) {
                    count++;
                    System.out.println("Thay đổi mật khẩu");
                    users.get(i).setPassword(scanner.next());
                    check = false;
                }
            }
            if (count == 0) {
                System.out.println("tài khoản không tồn tại");
            }
        }
    }

    public void createNewAccount() {
        //Tạo tài khoản mới
        System.out.println("nhập mã id");
        Long id = scanner.nextLong();
        System.out.println("Nhập tên đăng nhập");
        String userName = scanner.next();
        System.out.println("nhập email");
        String email = scanner.next();
        System.out.println("nhập mật khẩu");
        String password = scanner.next();

        User user = new User(id, userName, email, password);
        System.out.println("tạo tài khoản thành công");
        System.out.println(user);
    }

    public void changeUsername(User user) {
        //Thay đổi username
        System.out.println("Mời bạn nhập tên mới");
        String userName = scanner.next();
        user.setUsername(userName);
        login();
    }

    public void changePassword(User user) {
        //Thay đổi mật khẩu
        System.out.println("Mời bạn nhập mật khẩu mới");
        String passwword = scanner.next();
        user.setPassword(passwword);
        login();
    }

    public void changeEmail(User user) {
        //Thay đổi email
        System.out.println("Mời bạn nhập email mới");
        String email = scanner.next();
        user.setPassword(email);
        login();
    }

    public void loginController(User user) {
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng xuất)");
        System.out.println("0 - Thoát chương trình");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                changeUsername(user);
                break;
            case 2:
                changeEmail(user);
                break;
            case 3:
                changePassword(user);
                break;
            case 4:
                App.mainn();
                break;
            case 0:
                scanner.close();
                System.exit(0);
            default:
                System.out.println("không có lựa chọn này");
                break;
        }
    }

    public void loginFail() {
        System.out.println("đăng nhập thất bại");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                login();
                break;
            case 2:
                forgotPassword();
                break;
            default:
                System.out.println("không có lựa chọn này");
                break;
        }
    }

}

