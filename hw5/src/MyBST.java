public class MyBST<E extends Comparable<E>> implements SearchTree<E>{

    private E[] data;
    private int capacity=1000;
    private int size=0;

    @SuppressWarnings("unchecked")
    public MyBST(){
        data = (E[])new Comparable[this.capacity];
    }
    /**
     * Adds an item to binary search tree
     * @param item item to be added
     * @return true if successful, false if not
     */
    public boolean add(E item){
        return addReturn(item, 0);
    }

    /**
     * Recursive method to find appropiate place to add the item and to add it
     * @param item item to be added
     * @param index index to keep track of which side are we headed
     * @return true if successful, false if not
     */
    @SuppressWarnings("unchecked")
    private boolean addReturn(E item, int index){
        if(index >= data.length){
            this.capacity = this.capacity*2;
        
            E[] tempArr = (E[])new Object[this.capacity];
            for (int i = 0; i < size; i++) {
                tempArr[i]=data[i];
            }
            data=tempArr;
        }
        
        if(data[index] == null){
            data[index] = item;
            size++;
            return true;
        }
        
        int bools = item.compareTo(data[index]);
    

        if(bools == 0){
            
            return false;
        }
        else if(bools>0){
        
            return addReturn(item, index*2 + 2);
        }
        else{
            
            return addReturn(item, index*2 + 1);
        }
    }
    
    /**
     * @param target target to be found
     * @return true if found, false if not
     */
    public boolean contains(E target){
        return findReturn(target, 0);
    }

    /**
     * This method finds if a certain target exists in BST
     * @param target target to be found
     * @return target itself if found, else null
     */
    public E find(E target){
        if(findReturn(target, 0)){
            return target;
        }
        else{
            return null;
        }
    }

    /**
     * Recursive method to search for a certain target in BST
     * @param target target to be found
     * @param index index to keep track of which side are we headed
     * @return true if found, false if not
     */
    private boolean findReturn(E target, int index){

        if(data[index] == null || index >= data.length){
            return false;
        }

        int bools = target.compareTo(data[index]);

        if(bools == 0){
            return true;
        }
        else if(bools>0){
            return findReturn(target, index*2 + 2);
        }
        else{
            return findReturn(target, index*2 + 1);
        }
    }

    /**
     * This method deletes certain target from BST
     * @param target target to be deleted
     * @return target itself if it's found and deleted, null otherwise
     */
    public E delete(E target){
        if(deleteReturn(target, 0)){
            return target;
        }
        else{
            return null;
        }
    }

    /**
     * This method removes certain target from BST
     * @param target target to be removed
     * @return true if successful, false if not
     */
    public boolean remove(E target){
        return deleteReturn(target, 0);
    }

    /**
     * Recursive method to find target and remove it if found
     * @param target target to be removed
     * @param index index to keep track of which side are we headed
     * @return true if found and removed, false if not
     */
    private boolean deleteReturn(E target, int index){
        if(data[index] == null || index >= data.length){
          
            return false;
        }
        int bools = target.compareTo(data[index]);

        if(bools == 0){
            if(data[index*2+1] == null && data[index*2+2] == null){
                data[index] = null;
                size--;
                return true;
            }
            if(data[index*2+1] == null && data[index*2+2] != null){
                data[index] = data[index*2+2];
                data[index*2+2] = null;
                size--;
                return true;
            }
            else if(data[index*2+1] != null && data[index*2+2] == null){
                data[index] = data[index*2+1];
                data[index*2+1] = null;
                size--;
                return true;
            }
            else{
                data[index] = inorderPredecessor(index*2+1);
                size--;
                return true;
            }
        }
        else if(bools>0){
            return deleteReturn(target, index*2 + 2);
        }
        else{
            return deleteReturn(target, index*2 + 1);
        }
    }

    /**
     * This method finds inorder predecessor for remove method
     * @param index index that searching will start at
     * @return inorder predecessor
     */
    private E inorderPredecessor(int index){
        E tempE;

        while(data[index*2+2] != null){
            index = index*2 + 2;
        }
        tempE = data[index];
        remove(data[index]);
        return tempE;
    }

    /**
     * This method prints the tree
     */
    public void print(){
        int i=0;
        try { while(i<=data.length){
            if(data[i]!=null){
                System.out.print("Parent: " + data[i] + "       ");
                System.out.print("Left child: " + data[i*2+1] + "       ");
                System.out.println("Right child: " + data[i*2+2]);
            }
            i++;
        }} catch(ArrayIndexOutOfBoundsException e){};
    }
}
