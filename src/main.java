import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws InterruptedException {
        new MultiThreading().start();
        System.out.println("starting main program");
        for (int x =0;x<15;x++){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("doing job "+Integer.toString(x));
        }
    }
}
