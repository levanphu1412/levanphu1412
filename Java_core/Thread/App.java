package Thread;

public class App {
    public static void main(String[] args) throws InterruptedException {
//        Test thread1 = new Test();
//        thread1.start();

        LapTrinhVien l = new LapTrinhVien();
        Thread thread1 = new Thread(l);
        thread1.start();
        thread1.join();

        KiemChungVien k  = new KiemChungVien();
        Thread thread2 = new Thread(k);
        thread2.start();

    }
}
