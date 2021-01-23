package LearingJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainRunner{

    public static void main(String[] args) {

        Book book=new Book("The Alchemist");
        BookReader johnReader=new BookReader(book);
        BookReader arpitReader=new BookReader(book);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Thread(johnReader,"John"));
        executorService.execute(new Thread(arpitReader,"arpit"));


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        BookWriter bookWriter = new BookWriter(book);
        executorService.execute(new Thread(bookWriter));

        executorService.shutdown();
    }

}
