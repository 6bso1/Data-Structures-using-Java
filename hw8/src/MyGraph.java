import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyGraph extends AbstractGraph implements DynamicGraph{

    private List <Edge> [] edges;
    private List <Vertex> vertices;
    private int row=0;

    /** Construct a graph with the specified number of vertices and directionality.
      @param numV The number of vertices
      @param directed The directionality flag
    */
    @SuppressWarnings("unchecked")
    public MyGraph(int numV, boolean directed) {
        super(numV, directed);
        edges = new List[numV];
        vertices = new ArrayList<Vertex>();
        for (int i = 0; i < numV; i++) {
        edges[i] = new LinkedList <Edge> ();
        }
    }

    /** Determine whether an edge exists.
        @param source The source vertex
        @param dest The destination vertex
        @return true if there is an edge from source to dest
    */
    public boolean isEdge(int source, int dest) {
        return edges[source].contains(new Edge(source, dest));
    }

    /** Insert a new edge into the graph.
         @param edge The new edge
    */
    public void insert(Edge edge) {
        edges[edge.getSource()].add(edge);
        if (!isDirected()) {
        edges[edge.getDest()].add(new Edge(edge.getDest(),
                                            edge.getSource(),
                                            edge.getWeight()));
        }
    }

    public Iterator <Edge> edgeIterator(int source) {
        return edges[source].iterator();
    }

    /** Get the edge between two vertices
        @param source The source
        @param dest The destination
        @return the edge between these two vertices
    */
    public Edge getEdge(int source, int dest) {
        Edge target = new Edge(source, dest, Double.POSITIVE_INFINITY);
        for (Edge edge : edges[source]) {
        if (edge.equals(target))
            return edge;
        }
        return target;
    }

    /**
     * This method returns an edge with given key value. If it doesnt exist, method returns null
     * @param key
     * @return
     */
    public Vertex getVertex(String key){
        for(Vertex thisVertex : vertices){
            if(thisVertex.getData().get(key) != null){
                return thisVertex;
            }
        }
        return null;
    }

    public Vertex getVertexLabel(String label){
        for(Vertex thisVertex : vertices){
            if(thisVertex.getLabel().compareTo(label) == 0){
                return thisVertex;
            }
        }
        return null;
    }

    /** Load the edges of a graph from the data in an input file.
        @param bufferedReader The BufferedReader that is connected to the file that contains the data
        @throws IOException - If an I/O error occurs
   */
    public void loadEdgesFromFile(BufferedReader bufferedReader) throws
        IOException {
        String line;
        while ( (line = bufferedReader.readLine()) != null && line.length() != 0) {
        Scanner sc = new Scanner(line);
        int source = sc.nextInt();
        int dest = sc.nextInt();
        double weight = 1.0;
        if (sc.hasNextDouble())
            weight = sc.nextDouble();
        insert(new Edge(source, dest, weight));
        }
    }

    /**
     * This method creates new vertex with given label and weight
     * @param label label of vertex
     * @param weight weight of vertex
     * @return new vertex
     */
    public Vertex newVertex(String label, double weight) {
        Vertex thisVertex = new Vertex(label, weight);
        return thisVertex;
    }

    /**
     * This method adds given vertex to graph
     * @param new_vertex vertex to-be-added
     * @return added vertex
     */
    public Vertex addVertex(Vertex new_vertex) {
        try{vertices.add(new_vertex);
        new_vertex.setIndex(vertices.size());}catch(NullPointerException e){}
        return new_vertex;
    }

    /**
     * This method adds an edge with given parameters to the graph
     * @param vertexID1 ID of the source vertex
     * @param vertexID2 ID of the destination vertex
     * @param weight weight of the edge
     * @return added edge
     */
    public Edge addEdge(int vertexID1, int vertexID2, double weight) {
        Edge thisEdge = new Edge(vertexID1, vertexID2, weight);
        edges[thisEdge.getSource()].add(thisEdge);
        return thisEdge;
    }

    /**
     * This method removes edge between two vertices
     * @param vertexID1 ID of source vertex
     * @param vertexID2 ID of destination vertex
     * @return removed edge
     */
    public Edge removeEdge(int vertexID1, int vertexID2) {
        edges[vertexID1].remove(getEdge(vertexID1, vertexID2));
        return getEdge(vertexID1, vertexID2);
    }

    /**
     * This method removes vertex with the given ID
     * @param vertexID ID of the vertex to be removed
     * @return removed vertex
     */
    public Vertex removeVertex(int vertexID) { 
        Vertex temp = new Vertex(" ", 0);
        for(Vertex thisVertex : vertices){
            if(thisVertex.getIndex() == vertexID){
                temp = thisVertex;
                vertices.remove(thisVertex);
            }
        }
        return temp;
    }

    /**
     * This method removes vertex with the given label
     * @param label label of the vertex to be removed
     * @return removed vertex
     */
    public Vertex removeVertex(String label) {
        Vertex temp = new Vertex(" ", 0);
        for(Vertex thisVertex : vertices){
            int bools = thisVertex.getLabel().compareTo(label);
            if(bools == 0){
                temp = thisVertex;
                vertices.remove(thisVertex);
            }
        }
        return temp;
    }

    /**
     * This method filter vertices with given key and filter values
     * @param key 
     * @param filter
     * @return new vertex with filters
     */
    public Vertex filterVertices(String key, String filter) {
        if(getVertex(key) != null){
            MyGraph newGraph = new MyGraph(10, true);
            Vertex localVertex = new Vertex("burcu", 1.0);
            newGraph.addVertex(localVertex);
            localVertex.addProperty(key, filter);
        }
        return null;
    }

    /**
     * This method exports adjacency list graph to an adjacency matrix graph 
     * @return matrix
     */
    public double[][] exportMatrix() {
        double[][] data = new double[100][3];
        for(int i=0; i<100; i++){
            for(Edge localEdge : edges[i]){
                if(localEdge != null){
                    data[row][0] = localEdge.getSource();
                    data[row][1] = localEdge.getDest();
                    data[row][2] = localEdge.getWeight();
                    row++;
                }
            }
        }
        return data;
    }

    /**
     * This method prints the graph based on edges
     */
    public void printGraph() {
        try{for(int i=0; i<100; i++){
            for(Edge localEdge : edges[i]){
                if(localEdge != null){
                    System.out.println(localEdge.toString());
                }
            }
        }}catch(ArrayIndexOutOfBoundsException e){}
    }
}
