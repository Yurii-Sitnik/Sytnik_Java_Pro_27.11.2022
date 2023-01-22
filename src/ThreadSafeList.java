import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new ThreadSafeList(), "tread 1");
        Thread thread2 = new Thread(new ThreadSafeList(), "tread 2");
        thread1.start();
        thread2.start();
    }

    List<String> list = new ArrayList<>();

    @Override
    public void run() {
        System.out.println("Start " + Thread.currentThread().getName());
        synchronized (list) {
            list.add("apple");
            list.add("avocado");
            list.add("coconut");
            list.add("kiwi");
            list.add("lemon");
            list.add("banana");

            System.out.println(list);
            System.out.println(list.get(1));
            list.remove(1);
            System.out.println(list);
        }
    }
}




