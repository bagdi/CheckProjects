public class CardKey extends Key implements Intr {

    @Override
    public void open(Object key) {
        System.out.println("This is a card key in open method");
    }

    @Override
    public void close(Object key) {
        System.out.println("This is a card key in close method");
    }
}
