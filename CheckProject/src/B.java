import java.io.*;

public class B implements AutoCloseable{

    private String str = new String();
    BufferedReader br;

    private B() {
    }

    public B(String str) throws FileNotFoundException {
        this.str = str;
        br = new BufferedReader(new FileReader(new File("Key.txt")));
    }

    @Override
    public int hashCode() {
        // например
        return this.str.length() * this.getClass().getName().hashCode();
    }

    @Override
    public void close() throws Exception {
        str = null;
        br.close();
        System.out.println("All objects are closes");
    }
}
