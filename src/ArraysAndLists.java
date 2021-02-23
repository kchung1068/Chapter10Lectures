import java.util.ArrayList;

public class ArraysAndLists {

    public static void main(String[] args) {
        int array[] = new int[5];
        System.out.println(array.length);
        System.out.println(array[0]);
        array[0] = 34;
        array[1] = 92;
        int total = 0;
        int arrayTwo[] = {2,5,1,6,7};

        for (int x = 0; x < array.length; x += 1) {
            System.out.println(array[x]);
        }
        for (int x = 0; x < arrayTwo.length; x += 1) {
            total += arrayTwo[x];
        }
        System.out.println(total);
        printIt(arrayTwo);
        int[] arrayThree = new int[100];
        printIt(arrayThree);
        String myNames[] = makeIt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //Can only create ArrayLists with Objects, not primitives. Only stores objects.
        System.out.println(arrayList.size() );
       // System.out.println(arrayList.get(0));
        //ArrayList is an Object
        // Array is in between object and primitive
        //Arrays can store primitives and objects
        //ArrayLists can store objects
        //An array's size is set. You cannot add or remove from an Array. It is a static size.
        // When you declare it, you set the size and you can't change its size. But you can change the values in there.
        //An ArrayList can be changed. You can add or remove from an ArrayList
        //
        String names[] = new String[10];
        String moreNames[] = {"Herb", "Jack", "Sue", "Fred"};
        // names = {"Tim"} cannot do that
            names = new String[3];
    }
public static void printIt(int[] list) {
        for (int x = 0; x < list.length; x +=1) {
            System.out.print(list[x] + " ");

        }
    System.out.println();
}
public static String[] makeIt() {
        String[] names = {"Bob", "Kyle",  "Joe", "Susie"};
        return names;
}

}
