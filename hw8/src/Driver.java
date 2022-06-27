public class Driver {
    public static void main(String[] args) throws Exception {
        MyGraph ggraph = new MyGraph(10, true);

        ggraph.addVertex(ggraph.newVertex("burcu", 6)).addProperty("color", "orange");
        ggraph.addVertex(ggraph.newVertex("sultan", 1)).addProperty("color", "purple");
        ggraph.addVertex(ggraph.newVertex("orhan", 3)).addProperty("color", "white");

        ggraph.addEdge(ggraph.getVertexLabel("burcu").getIndex(), ggraph.getVertexLabel("sultan").getIndex(), 8);
        ggraph.addEdge(ggraph.getVertexLabel("burcu").getIndex(), ggraph.getVertexLabel("orhan").getIndex(), 2);
        ggraph.addEdge(ggraph.getVertexLabel("orhan").getIndex(), ggraph.getVertexLabel("sultan").getIndex(), 5);

        System.out.println("\nThree vertices and three edges added:");
        ggraph.printGraph();

        ggraph.removeEdge(ggraph.getVertexLabel("burcu").getIndex(), ggraph.getVertexLabel("sultan").getIndex());

        System.out.println("\nOne edge removed: ");
        ggraph.printGraph();

        
    }
}
