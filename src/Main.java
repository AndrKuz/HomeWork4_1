import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        thread1.start();
        thread2.start();

        sleep(3000);
        System.out.println(counter.getValue());

//      Результат будет разным при каждом запуске, так как несинхронизированные потоки не будут успевать следить за тем, как другой поток меняет состояние объекта,
//      вследствие чего некоторые преобразования объекта могут не засчитываться программой и состояние объекта будет оставаться прежним
//      (весь этот процесс будет происходить случайно, потому и результат будет всегда разным).
    }
}