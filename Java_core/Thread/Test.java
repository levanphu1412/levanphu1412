package Thread;

import java.util.Random;

public class Test extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        int i = 0;
        int count= 0;
        while (i < 100){
            int r = random.nextInt(110);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(r);
            i = r;
            count++;
        }
        System.out.println("số lượng số đã in: " + count);
    }
}

