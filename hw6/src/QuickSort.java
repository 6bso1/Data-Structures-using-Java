public class QuickSort <E extends Comparable<E>>{
    
	/**
	 * This method divides the array into two same sized arrays
	 * @param <E> type of the array
	 * @param arr array to be sorted
	 * @param first start index of the array
	 * @param last end index of the array
	 */
    public static <E extends Comparable <E>> void sort(E arr[], int first, int last) { 
		try{if (first < last) 
		{ 
			int p = partition(arr, first, last); 
			sort(arr, first, p-1); 
			sort(arr, p+1, last); 
		}} catch(ArrayIndexOutOfBoundsException e){} 
	}

	/**
	 * This method does the partition part
	 * @param <E> type of the array
	 * @param arr array to be sorted
	 * @param first start index of the array
	 * @param last end index of the array
	 * @return i+1
	 */
	public static <E extends Comparable <E>> int partition(E arr[], int first, int last) { 
		 
		int i = (first-1); 
        try{E pivot = arr[last];
		for (int j=first; j<last; j++) 
		{ 
            int comp = arr[j].compareTo(pivot);
			if (comp<=0) 
			{ 
				i++;  
				E temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} }catch(ArrayIndexOutOfBoundsException e1){}

		E temp = arr[i+1]; 
		arr[i+1] = arr[last]; 
		arr[last] = temp; 

		return i+1; 
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