public class MyThread extends Thread{
    private Integer delay = 0;
    private String threadName = null;

    public MyThread(int delay, String threadName) {
        this.delay =delay;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized(delay) { // ����� �������� ������ Object, int �� ������. ������ String, Integer, this � �.�.
            System.out.println("Run thread: " + threadName);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void f() {

    }
}
