public class LDLinkedList<E> implements List<E>{

    private E[] data;
    private int capacity=10;
    private int size=0 ;
    /**
     * This constructor creates MyList with given size.
     * @param size Size of the MyList
     */
    @SuppressWarnings("unchecked")
    public LDLinkedList(int size) {
        this.size=size;
        data = (E[])new Object[this.capacity];
    }
    /**
    * This constructor creates MyList with default capacity 10. 
    * 
    */
    @SuppressWarnings("unchecked")
    public LDLinkedList() {
        data = (E[])new Object[this.capacity];
    }
    /**
     * This function adds the given element into collection's data array. If capacity is full then it increases capacity by 1.
     * @param e Element,data
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean add(Object e) {
        int i;
        if (size>=capacity) {
            capacity=capacity+1;
        }
        if (data==null) {
            data = (E[])new Object[this.capacity];
        }
        E[] tempArr = (E[])new Object[capacity];
        for (i = 0; i < size; i++) {
            tempArr[i]=data[i];
        }
        tempArr[size]=(E)e;
        size=size+1;
        data=tempArr;
        return true;
    }
    /**
     * This method Inserts the specified element at the specified position in this list.
     * @param index index of the object that will be inserted
     * @param e object that will be inserted
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean add(int index, Object e){
        int i;
        if (size>=capacity) {
            capacity=capacity+1;
        }
        if (data==null) {
            data = (E[])new Object[this.capacity];
        }
        E[] tempArr = (E[])new Object[capacity];
        for (i = 0; i < size; i++) {
            tempArr[i]=data[i];
        }
        for(i=size+1; i>index; i--){
            tempArr[i] = tempArr[i-1];
        }
        tempArr[index]=(E)e;
        size=size+1;
        data=tempArr;
        return true;
    }
    @SuppressWarnings("unchecked")

    /**
     * 	This method Inserts the specified element at the beginning of this list.
     * @param e object that will be inserted
     * @return
     */
    public boolean addFirst(Object e){
        int i;
        if (size>=capacity) {
            capacity=capacity+1;
        }
        if (data==null) {
            data = (E[])new Object[this.capacity];
        }
        E[] tempArr = (E[])new Object[capacity];
        for (i = 0; i < size; i++) {
            tempArr[i]=data[i];
        }
        for(i=size+1; i>0; i--){
            tempArr[i] = tempArr[i-1];
        }
        tempArr[0]=(E)e;
        size=size+1;
        data=tempArr;
        return true;
    }
    @SuppressWarnings("unchecked")

    /**
     * 	This method Inserts the specified element at the end of this list.
     * @param e object that will be inserted
     * @return
     */
    public boolean addLast(Object e){
        int i;
        if (size>=capacity) {
            capacity=capacity+1;
        }
        if (data==null) {
            data = (E[])new Object[this.capacity];
        }
        E[] tempArr = (E[])new Object[capacity];
        for (i = 0; i < size; i++) {
            tempArr[i]=data[i];
        }
        tempArr[0]=(E)e;
        size=size+1;
        data=tempArr;
        return true;
    }
    
    /**
     * Removes all of the elements from this collection.
     * 
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i]=null;
        }
        data=null;
        size=0;
        capacity=10;
    }

    @SuppressWarnings("unchecked")
    /**
     * This method returns a shallow copy of this LinkedList.
     * @return shallow copy of this LinkedList
     */
    @Override
    public E[] clone(){
        E[] tempArr = (E[])new Object[capacity];
        for (int i = 0; i < size; i++) {
            tempArr[i]=data[i];
        }
        return tempArr;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }    
        return false;
    }

    /**
     * Returns true if this collection contains no elements.
     */
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    /**
     * Removes a single instance of the specified element from this collection, if it is present
     * @param e Element,data
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean remove(E e) {
        int index= indexOf(e);
        if (index!=-1) {
            if (size==1) {
                size=0;
                return true;
            }else{
                E[] tempArr = (E[])new Object[size-1];
                for (int i = 0,j=0; i < size; i++) {
                    if (i!=index) {
                        tempArr[j++] = data[i];
                    }
                }
                data=tempArr;
                size=tempArr.length;
                return true;
            }
        }else
            return false;
    }

    @SuppressWarnings("unchecked")
    /**
     * Removed the first element of the linkedlist
     */
    public boolean remove(){
        E[] tempArr = (E[])new Object[size-1];
                for (int i = 0,j=0; i < size; i++) {
                    if (i!=0) {
                        tempArr[j++] = data[i];
                    }
                }
                data=tempArr;
                size=tempArr.length;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    /**
     * Removes the data of the given index
     * @param index 
     * @return true 
     */
    public boolean remove(int index){
        E[] tempArr = (E[])new Object[size-1];
        for (int i = 0,j=0; i < size; i++) {
            if (i!=index) {
                tempArr[j++] = data[i];
            }
        }
        data=tempArr;
        size=tempArr.length;
        return true;
    }

    @SuppressWarnings("unchecked")
    /**
     * This method removes and returns the first element from this list.
     * @return first element
     */
    public E removeFirst(){
        E firstData = data[0];
        E[] tempArr = (E[])new Object[size-1];
        for (int i = 0,j=0; i < size; i++) {
            if (i!=0) {
                tempArr[j++] = data[i];
            }
        }
        data=tempArr;
        size=tempArr.length;
        return firstData;
    }

    @SuppressWarnings("unchecked")
    /**
     * This method removes and returns the last element from this list.
     * @return Last element
     */
    public E removeLast(){
        E lastData = data[size];
        E[] tempArr = (E[])new Object[size-1];
        for (int i = 0,j=0; i < size; i++) {
            if (i!=size) {
                tempArr[j++] = data[i];
            }
        }
        data=tempArr;
        size=tempArr.length;
        return lastData;
    }

    /**
     * Returns the index of given data.
     * @param e Element,data
     * @return
     */
    public int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
    * Return size of the collection
    */
    @Override
    public int size() {
        return size;
    }

    /**
    * It returns the data in the given index.
    * @param index Index.
    */
    @Override
    public E get(int index) {
        return data[index];
    }

    /**
     * It returns the first data of the linkedlist
     * @return first data
     */
    public E getFirst(){
        return data[0];
    }

    /**
     * It returns the last data of the linkedlist
     * @return last data
     */
    public E getLast(){
        return data[size];
    }    
}