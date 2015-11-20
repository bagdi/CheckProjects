public class MyNewThread implements Runnable {

    private int delay = 0;
    private String threadName = null;
    private Thread thread;

    public MyNewThread(int delay, String threadName) {
        this.delay =delay;
        this.threadName = threadName;
        // по параметру конструктора передадим объект того класса, которого мы хотим создать поток
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Run thread: " + threadName);
    }
}
