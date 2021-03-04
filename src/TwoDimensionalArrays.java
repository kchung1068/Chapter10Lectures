public class TwoDimensionalArrays {
    public static void main(String[] args) {
        double ttt[] = {44.4};
        int [] [] array2d = new int[1][3];
        String [] [] stringArray = new String[5][4];
        double[][] doubleArray = {{3.2,4.5,6.7}, { 1.2,2.3,3.4} };
        System.out.println(doubleArray[0][0]);
       // array2d[0][0] = 5;

        for (int x = 0; x < array2d.length; x +=1 ) {
            for (int y = 0; y < array2d[x].length; y += 1) {
                array2d[x][y] = (int)(Math.random() * 10);
            }
        }
        printArray(array2d);
    }
    public static void printArray(int[][] a) {
        for (int x = 0; x < a.length; x +=1 ) {
            for (int y = 0; y < a[x].length; y += 1) {
                System.out.println(a[x][y]);
            }
            System.out.println();
        }
    }
    }

}
