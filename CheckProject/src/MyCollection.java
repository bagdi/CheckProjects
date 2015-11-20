import java.util.*;

public class MyCollection {
    // на основе массива
    List<String> arrayList = new ArrayList<String>();
    //связный
    List<String> linkedList = new LinkedList<String>();
    //вектор
    List<String> vector = new Vector<String>();
    // не содержит одинаковых значений (одинаковые при добавлении игнорит и просто не помещает)
    Set<String> hashSet = new HashSet<String>();
    // не содержит одинаковых значений (одинаковые при добавлении игнорит и просто не помещает)
    // содержит в отсортированном порядке
    Set<String> treeSet = new TreeSet<String>();
    // ключ-значение
    Map<Integer, String> hashMap = new HashMap<Integer, String>();
    // ключ-значение
    // содержит в отсортированном порядке
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();

    public void addMethod() {
        arrayList.add("scxas");
        linkedList.add("adfs");
        vector.add("sdsd");
        hashSet.add("sdcd");
        treeSet.add("dcvs");
        hashMap.put(1, "sacd");
        treeMap.put(1, "dscfsdc");
    }

    public void getMethod() {
        arrayList.get(0);
        linkedList.get(0);
        vector.get(0);
        hashSet.iterator().next(); // либо через foreach
        treeSet.iterator().next(); // либо через foreach
        for(Map.Entry entry: hashMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        for(Map.Entry entry:treeMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }
}
