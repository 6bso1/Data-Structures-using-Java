public class NewSort <E extends Comparable<E>>{

    /**
     * This method calls min_max_finder for each version of the array
     * @param <E> type of the array
     * @param arr array to be sorted
     * @param head start index of the array
     * @param tail end index of the array
     * @return the array sorted
     */
    public static <E extends Comparable <E>> E[] sort(E[] arr, int head, int tail){
        if(head>=tail){
            return arr;
        }
        else{
            
            int[] myArray = min_max_finder(arr, head, tail);
            int min = myArray[0];
            int max = myArray[1];
            E temp;
            
            temp = arr[head];
            arr[head] = arr[min];
            arr[min] = temp;
            
            try{temp = arr[tail];
            arr[tail] = arr[max];
            arr[max] = temp;
            }catch(ArrayIndexOutOfBoundsException e){}
        }

        return sort(arr, head+1, tail-1);       
        
    }
    
    /**
     * This method finds min and max elements of the array with given start and end indices
     * @param <E> type of the array
     * @param arr array to be searched
     * @param head start index
     * @param tail end index
     * @return 2-sized array for min and max values, 0th index is min, 1st index is max
     */
    public static <E extends Comparable <E>> int[] min_max_finder(E[] arr, int head, int tail){
        int[] temp = new int[2];
        temp[0] = head;
        temp[1] = head;
        find(arr, head, tail, temp, head);

        return temp;
    }

    /**
     * This recursive method finds min and max elements' indices 
     * @param <E> type of the array
     * @param myArr array to be searched
     * @param first start index 
     * @param last end index
     * @param tempArr 2-sized int array that stores min and max elements' indices 
     * @param index element that will be compared to current min and max values
     * @return 2-sized int array that stores min and max elements' indices
     */
    public static <E extends Comparable <E>> int[] find(E[] myArr, int first, int last, int[] tempArr, int index){
        try{
        if(index > last){
            return tempArr;
            
        }
        int comp = myArr[index].compareTo(myArr[tempArr[0]]);
        if(comp <= 0){
            tempArr[0] = index;
            
            find(myArr, first, last, tempArr, index+1);
        }

        comp = myArr[index].compareTo(myArr[tempArr[1]]);
        if(comp > 0){
            tempArr[1] = index;
            try{find(myArr, first, last, tempArr, index+1);}catch(StackOverflowError e){}
        }
        find(myArr, first, last, tempArr, index+1);}catch(ArrayIndexOutOfBoundsException e){}
        return tempArr;
    }

    /**
     * This method prints the sorted array 
     * @param <E> type of the array
     * @param arr array to be printed
     */
    public static <E extends Comparable <E>> void print(E[] arr){
        int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println();
    }
}
