import java.util.ArrayList;

public class ArrayListOnly {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kyle");
        names.add(0,"Ryan");

        System.out.println(names);
        System.out.println(names.get(0));
        names.set(0, "Oleg");
        names.add("Michael");
        names.add("Sam");
        names.add("Abigail");

        for(int x = 0; x < names.size(); x += 1) {
            System.out.println(names.get(x));
        }
       // "ArrayList has a toString, arrays do not."
       changeIt(names);
        System.out.println(names);
    }
    public static void changeIt(ArrayList<String> a) {
    a.add("Bob");
    }
}
