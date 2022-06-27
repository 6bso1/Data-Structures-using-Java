public class Driver {
    public static void main(String[] args) throws Exception {
        
        BinaryTree<String> subTree6 = new BinaryTree<>("sdf", null, null);
        BinaryTree<String> subTree5 = new BinaryTree<>("ghhgf", null, null);
        BinaryTree<String> subTree4 = new BinaryTree<>("xyz", null, null);
        BinaryTree<String> subTree3 = new BinaryTree<>("hgfss", null,  null);
        BinaryTree<String> subTree2 = new BinaryTree<>("hgfv", subTree5, subTree6);
        BinaryTree<String> subTree1 = new BinaryTree<>("asdfgf", subTree3, subTree4);
        BinaryTree<String> myTree = new BinaryTree<>("fggfd", subTree1, subTree2);


        String[] inputs = {"burcu", "sultan", "orhan", "gizem", "alper", "elif", "melissa"};

        binaryToBinarySearch(myTree, inputs);

    }

    /**
     * 
     * @param localTree The tree to be rearranged as BST
     * @param data array of inputs
     */
    public static void binaryToBinarySearch(BinaryTree<String> localTree, String[] data){

        System.out.println("Given binary tree structure:");
        System.out.println(localTree.toString());
        System.out.print("Given array of inputs: ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        MergeSort.sort(data, 0, data.length-1);
        fillTree(localTree, data, 0, data.length-1);
        System.out.println("\n\n\nBinary search tree with given inputs according to given tree structure: ");
        System.out.println(localTree.toString());
        
    }

    /**
     * Recursive helper method to fill the tree with input values
     * @param thisTree local tree
     * @param data array of inputs
     * @param start start index of array
     * @param end end index of array
     */
    public static void fillTree(BinaryTree<String> thisTree, String[] data, int start, int end){
        if(thisTree == null){
            return;
        }
        if(start>=end){
            return;
        }
        
        if(end-start==2){
            thisTree.setData(thisTree, data[(end+start)/2]);
            thisTree.getLeftSubtree().setData(thisTree.getLeftSubtree(), data[start]);
            thisTree.getRightSubtree().setData(thisTree.getRightSubtree(), data[end]);
        }
        else{
            thisTree.setData(thisTree, data[(end+start)/2]);
        }
        fillTree(thisTree.getRightSubtree(), data, (end+start)/2+1, end);
        fillTree(thisTree.getLeftSubtree(), data, start, (end+start)/2-1);
        

    }    
}
