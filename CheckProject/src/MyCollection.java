import java.util.*;

public class MyCollection {
    // �� ������ �������
    List<String> arrayList = new ArrayList<String>();
    //�������
    List<String> linkedList = new LinkedList<String>();
    //������
    List<String> vector = new Vector<String>();
    // �� �������� ���������� �������� (���������� ��� ���������� ������� � ������ �� ��������)
    Set<String> hashSet = new HashSet<String>();
    // �� �������� ���������� �������� (���������� ��� ���������� ������� � ������ �� ��������)
    // �������� � ��������������� �������
    Set<String> treeSet = new TreeSet<String>();
    // ����-��������
    Map<Integer, String> hashMap = new HashMap<Integer, String>();
    // ����-��������
    // �������� � ��������������� �������
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
        hashSet.iterator().next(); // ���� ����� foreach
        treeSet.iterator().next(); // ���� ����� foreach
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
