import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws Exception {
        int i;
        i = Recursives.isSubstring("lalalalalala", "la", 3, 0, 1);
        System.out.println(i);
        i = Recursives.isSubstring("hello world", "hi", 2, 0, 1);
        System.out.println(i);
        i = Recursives.isSubstring("wowowowo", "wo", 8, 0, 1);
        System.out.println(i);


        int[] myArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int x;
        x = Recursives.numOfItems(myArr1, 9, 2, 0, 13, 0);
        System.out.println(x);
        x = Recursives.numOfItems(myArr1, 70, 60, 0, 13, 0);
        System.out.println(x);
        x = Recursives.numOfItems(myArr1, 13, 6, 0, 13, 0);
        System.out.println(x);


        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> subArray = new ArrayList<>();
        Recursives.equalItem(myArray, 20, subArray, 0, 0, 0, 7);
        ArrayList<Integer> subArray2 = new ArrayList<>();
        Recursives.equalItem(myArray, 6, subArray2, 0, 0, 0, 7);
        ArrayList<Integer> subArray3 = new ArrayList<>();
        Recursives.equalItem(myArray, 39, subArray3, 0, 0, 0, 7);


        Recursives.printBlocks(6, 3, 1);
    }
}