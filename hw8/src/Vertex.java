public class Vertex {

    private int index;
    private String label;
    private double weight;
    private HashTableBST<String, String> data;

    /**
     * This is the only constructor of vertex class which takes label and weight parameters
     * @param label label of the vertex
     * @param weight weight of the vertex
     */
    public Vertex(String label, double weight){
        this.label = label;
        this.weight = weight;
    }

    /**
     * This function adds user defined properties which are key-value pairs to vertex 
     * @param key key of the pair
     * @param value value of the pair
     */
    public void addProperty(String key, String value){
        try{this.data.put(key, value);}catch(NullPointerException e){}
    }

    /**
     * This function returns the data hash map
     * @return
     */
    public HashTableBST<String, String> getData(){
        return data;
    }

    /**
     * This function returns index of vertex
     * @return index
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * This funtion sets index to user defined value
     * @param index set-to-be index value
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * This method returns label of vertex
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * This method sets label to user defined value
     * @param label set-to-be label value
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * This method returns weight of vertex
     * @return weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * This method sets weight to user defined value
     * @param weight set-to-be weight value
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}