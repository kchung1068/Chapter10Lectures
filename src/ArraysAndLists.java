import java.util.ArrayList;

public class ArraysAndLists {

    public static void main(String[] args) {
    int array[] = new int[5];
        System.out.println(array.length);
        System.out.println(array[0]);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //Can only create ArrayLists with Objects, not primitives. Only stores objects.
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        //ArrayList is an Object
        // Array is in between object and primitive
        //Arrays can store primitives and objects
        //ArrayLists can store objects
        //An array's size is set. You cannot add or remove from an Array. It is a static size.
        // When you declare it, you set the size and you can't change its size. But you can change the values in there.
        //An ArrayList can be changed. You can add or remove from an ArrayList


    }


}
