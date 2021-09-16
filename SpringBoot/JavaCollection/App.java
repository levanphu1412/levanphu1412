public class App {
    public static void main(String[] args) {
        // ReadFile readFile = new ReadFile();
        // readFile.readData();
        Controller controller = new Controller();
        controller.readData();

        System.out.println("danh sách người có tuổi từ 20 -> 30: ");
        controller.filterAge();
        controller.averageAge();
        System.out.println("độ tuổi trung bình theo quốc gia là:");
        controller.averageAgeByNationality();
    }
}
