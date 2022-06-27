import java.util.ArrayList;

public class Recursives {
    /**
     * 
     * @param bigStr string that will be searched
     * @param subStr string that will be find
     * @param targetIndex given index of occurence number
     * @param index found occurence number
     * @param i index of the wanted occurence
     * @return index
     */
    public static int isSubstring(String bigStr, String subStr, int targetIndex, int index, int i){
        if(bigStr.length()<subStr.length()){
            return -1;
        }
        else if(bigStr.substring(0, subStr.length()).equals(subStr)){
            index++;
            if(index == targetIndex){
                return i;
            }
        }
        return isSubstring(bigStr.substring(1), subStr, targetIndex, index, i+1);
    }
    /**
     * 
     * @param myArray array that will be searched
     * @param bigNum biggest number that can be found
     * @param smallNum smallest number that can be found
     * @param first first index of the array that searching will start
     * @param last last index of the array that searching will end
     * @param total total number of integers that qualify the needs
     * @return total
     */
    public static int numOfItems(int[] myArray, int bigNum, int smallNum, int first, int last, int total){
        int middle = (first+last)/2;

        if(myArray[middle]>bigNum){
            return numOfItems(myArray, bigNum, smallNum, first, middle, total);
        }
        if(myArray[middle]<smallNum){
            if(last<=first+1){
                return total;
            }
            else{
                return numOfItems(myArray, bigNum, smallNum, middle, last, total);
            }
        }
        else if(myArray[middle] >= smallNum && myArray[middle] <= bigNum){
            for(int i=middle; i<last; i++){
                myArray[i] = myArray[i+1];
            }
            total++;
            last--;
            return numOfItems(myArray, bigNum, smallNum, first, last, total);
        }
        else{
            return total;
        }
    }
    /**
     * 
     * @param myArray array that will be searched
     * @param item item that will be summed into
     * @param subArray subarray that will collect the elements
     * @param total total summation of the subarray elements
     * @param index1 current element index of given array
     * @param index2 current array index of the first element of subarray
     * @param size size of the array
     */
    public static void equalItem(int[] myArray, int item, ArrayList<Integer> subArray, int total, int index1, int index2, int size){
        if(total + myArray[index1] == item){
            subArray.add(myArray[index1]);
            System.out.println(subArray);
            ArrayList<Integer> newArray = new ArrayList<>();
            index1++;
            total=0;
            try{ 
                if(index1!=size){
                    equalItem(myArray, item, newArray, total, index1, index2, size);
                } 
            } catch(java.lang.IndexOutOfBoundsException exception){};
        }
        else if(total + myArray[index1] < item){
            if(total==0){
                index2 = index1;
            }
            total = total + myArray[index1];
            subArray.add(myArray[index1]);
            index1++;
            try{ 
                if(index1!=size){
                    equalItem(myArray, item, subArray, total, index1, index2, size);
                } 
            } catch(java.lang.IndexOutOfBoundsException exception){};
        }
        else{
            total = total - myArray[index2];
            int i = subArray.indexOf(myArray[index2]);
            subArray.remove(i);
            index2++;
            try{ 
                if(index1!=size){
                    equalItem(myArray, item, subArray, total, index1, index2, size);
                } 
            } catch(java.lang.IndexOutOfBoundsException exception){};
        }
    }
    /**
     * 
     * @param blockLength length of the block
     * @param coloredLength length of the colored block
     * @param position starting position of the colored block
     */
    public static void printBlocks(int blockLength, int coloredLength, int position){
        if(coloredLength==blockLength){
            coloredBlocks(blockLength, coloredLength, position);
        }
        if(coloredLength+position>blockLength+1){
            return;
        }
        else if(coloredLength+position==blockLength+1){
            coloredBlocks(blockLength, coloredLength, position);
            printBlocks(blockLength, coloredLength+1, 1);
        }
        else{
            coloredBlocks(blockLength, coloredLength, position);
            printBlocks(blockLength, coloredLength, position+1);
        }
    }
    /**
     * 
     * @param block length of the block
     * @param colored length of the colored block
     * @param pos starting position of the colored block
     */
    public static void coloredBlocks(int block, int colored, int pos){
        for(int i=1; i<=block; i++){
            if(!(i>pos && i<colored+pos)){
                System.out.print(" _");
            }
            else{
                System.out.print("_");
            }
        }
        System.out.print("\n");
        for(int i=1; i<=block; i++){
            if(!(i>pos && i<colored+pos)){
                System.out.print("|_");
            }
            else{
                System.out.print("_");
            }
        }
        System.out.println("|");
    }
}
