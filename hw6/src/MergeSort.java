public class MergeSort<E extends Comparable<E>> {
    /**
     * This method divides the array into two same sized arrays
     * @param <E> type of the array
     * @param Arr array to be sorted
     * @param start start index of the array
     * @param end end index of the array
     */
    public static <E extends Comparable <E>> void sort(E[] Arr, int start, int end) {
    
        if(start < end) {
            int mid = (start + end) / 2;
            try{ sort(Arr, start, mid);
            sort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
            } catch(ArrayIndexOutOfBoundsException e){}
        }
    }

    /**
     * This method desings and merges array 
     * @param <E> type of the array
     * @param Arr array to be merged
     * @param start start index of the array
     * @param mid mid index of the array
     * @param end end index of the array
     */
    public static <E extends Comparable <E>> void merge (E[] Arr, int start, int mid, int end) {
        @SuppressWarnings("unchecked")
        E[] temp = (E[])new Comparable[end - start + 1];
    
        int i = start, j = mid+1, k = 0;
     
        try {while(i <= mid && j <= end) {
            int comp = Arr[i].compareTo(Arr[j]);
            if(comp<=0) {
                temp[k] = Arr[i];
                k++; 
                i++;
            }
            else {
                temp[k] = Arr[j];
                k++; 
                j++;
            }
        }}catch (ArrayIndexOutOfBoundsException e1){}
    
        while(i <= mid) {
            temp[k] = Arr[i];
            k++; 
            i++;
        }
    
        while(j <= end) {
            temp[k] = Arr[j];
            k++; 
            j++;
        }
    
        for(i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
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

