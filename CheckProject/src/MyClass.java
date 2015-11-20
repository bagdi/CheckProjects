import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyClass{
    public static void main(String[] args) throws Exception {

        Keys keys = new Keys();

        CardKey cardKey = new CardKey();
        SimpleKey simpleKey = new SimpleKey();

        keys.indef1();
        try {
            Keys.indef2(simpleKey); //�����: Go to fuck!
            Keys.indef2(cardKey);
            Keys.indef2(simpleKey);
        }
        catch(MyException e) {
            e.myException();
            System.out.print("Any method in catch block: ");
            Keys.indef3(cardKey);
        }
        catch(Exception e) {
            System.out.println("You use the CardKey. We are genered an Exception. Use any key without CardKey.");
        }

        keys.indef1();

        Keys.indef3(cardKey);
        Keys.indef3(simpleKey);


        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();

        A a5 = new A();

        a1.getB();
        a2.getB();
        a3.getB();
        a4.getB();

        A.getA();
        A.getA();
        A.getA();
        A.getA();

        System.out.println(a4.getB());

        System.out.println("static - " + A.getA());

        Thread[] thread = new MyThread[8];
        /*
        for(int i=0; i<thread.length; i++) {
            thread[i] = new MyThread(200 * i, "Thread" + i);
            thread[i].start();
        }
        */

        for(int i=0; i<4; i++) {
            new MyNewThread(20*i, "Thread" + i);
        }

        // ������� ������ ������ Class
        Class c = Class.forName("MyNewThread");

        // ������ ��� (������, � ����� �� �������)
        String name = c.getName();

        // ������������ (������, � ����� �� �������)
        Constructor[] constructors = c.getConstructors();

        // ���������� (������, � ����� �� �������)
        Class[] interfaces = c.getInterfaces();

        // ������������
        int modifiers = c.getModifiers();

        // ���������, ���� �� ��������� ������������, ���� ���� true, ����� false
        String privateModifiers = null;
        if(Modifier.isPrivate(modifiers)) {
            privateModifiers = "private";
        }

        // ���������, ���� �� ����������� ������������, ���� ���� true, ����� false
        String staticModifiers = null;
        if(Modifier.isStatic(modifiers)) {
            staticModifiers = "static";
        }

        // ������ (������, � ����� �� �������)
        Method[] methods = c.getMethods();

        // ���� (������, � ����� �� �������)
        Field[] fields = c.getFields();

        System.out.println("Name " + name);
        for(int i=0; i<constructors.length; i++) {System.out.println("Constructors " + constructors[i]);}
        for(int i=0; i<interfaces.length; i++) {System.out.println("Interfaces " + interfaces[i]);}
        System.out.println("Modifiers " + modifiers);
        System.out.println("Private Modifiers " + privateModifiers);
        System.out.println("Static Modifiers " + staticModifiers);
        for(int i=0; i<methods.length; i++) {System.out.println("Methods " + methods[i]);}
        for(int i=0; i<fields.length; i++) {System.out.println("Fields " + fields[i]);}

        // ����� ��� ���� ������ ���������� ������������, �����, �����, ���� ���������� � ������ ������!
        int methodModifier = methods[0].getModifiers();
        String methodName = methods[0].getName();
        int parametersCount = methods[0].getParameterCount();
        Class[] parametersTypes = methods[0].getParameterTypes();

        // ������������
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Keys.txt"));
        oos.writeObject(keys);
        oos.flush();
        oos.close();

        // ��������������
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Keys.txt"));
        Keys keysObject = (Keys) ois.readObject();

        if(keys instanceof Keys) {
            System.out.println("Object keys is from Keys class");
        }

        System.out.println(Keys.fact(5));

        System.out.println(keys.fibonachi(4));

        try(BufferedReader br = new BufferedReader(new FileReader(new File("Keys.txt")))) {
            System.out.println("This line is from Serialize txt file for demonstration try resource method" + br.readLine());
        }

        String myString = "My String";
        try(B b = new B(myString)) {
            int hashCodeOfClassName = b.getClass().getName().hashCode();
            int hashCodeOfObject = b.hashCode();
            System.out.println("HashCode of B object = " + hashCodeOfObject + " = "+ myString.length() + " * " + hashCodeOfClassName);
        }
    }
}
