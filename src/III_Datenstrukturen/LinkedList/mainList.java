package III_Datenstrukturen.LinkedList;
public class mainList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.remove(0);
        System.out.println(ll.get(0));
    }
}
