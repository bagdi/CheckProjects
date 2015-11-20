public class SimpleKey implements Intr {

    @Override
    public void open(Object key) {
           System.out.println("This is a simple key in open method");
    }

    @Override
    public void close(Object key) {
        System.out.println("This is a simple key in close method");
    }

}
