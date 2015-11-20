import java.io.Serializable;

public class Keys implements Serializable{

    public static CardKey cardKey = new CardKey();
    public static SimpleKey simpleKey = new SimpleKey();
    public Key key;


    public void indef1() {

        Intr intr = new CardKey();
        intr.open(key);

    }

    public static void indef2(Intr intr1) throws Exception, MyException {
        if(intr1.getClass().equals(cardKey.getClass())) throw new Exception();
        if(intr1.getClass().equals(simpleKey.getClass())) throw new MyException();
        intr1.open(intr1);
    }

    public static void indef3(Intr intr1){
        intr1.open(intr1);
    }

    public static int fact(int n) {
        //if(n==0) return 1;
        //else return n*fact(n-1);
        return (n == 0) ? 1 : n * fact(n-1);
    }

    public int fibonachi(int n) {
        if((n == 1) || (n == 2)) return 1;
        return fibonachi(n-1) + fibonachi(n-2);
    }

}
