package edu.aed.BreadthFirstTraversal;

import java.util.ArrayList;
import java.util.List;
import edu.aed.Graph.Graph;

public class TestBreadthFirstTraversal {
    public static void main(String[] args) {
        System.out.println("TestBreadthFirstTraversalWithArray");
        TestBreadthFirstTraversalWithArray();
        System.out.println("\nTestBreadthFirstTraversalWithArrayList");
        TestBreadthFirstTraversalWithArrayList();
    }    
    public static void TestBreadthFirstTraversalWithArray(){
        byte[][] adjacencyMatrix = new byte[4][4];
        
        // v0
        adjacencyMatrix[0][1] = 1;
        adjacencyMatrix[0][2] = 1;
        // v1
        adjacencyMatrix[1][2] = 1;
        // v2
        adjacencyMatrix[2][0] = 1;
        adjacencyMatrix[2][3] = 1;
        // v3
        adjacencyMatrix[3][3] = 1;
        
        
        final int[] result = BreadthFirstTraversal.
                breadthFirstTraversal(4, adjacencyMatrix, 2);
        for(int i=0;i<4;i++)
            System.out.print(result[i]+" , ");
        //2,0,1,3
    }
    
    public static void TestBreadthFirstTraversalWithArrayList(){
        List<Graph.Vertex<Integer>>    vertices    = new ArrayList<>();
        List<Graph.Edge<Integer>>      edges       = new ArrayList<>();
        Graph.Vertex<Integer>          v0          = new Graph.Vertex<>(0);
        Graph.Vertex<Integer>          v1          = new Graph.Vertex<>(1);
        Graph.Vertex<Integer>          v2          = new Graph.Vertex<>(2);
        Graph.Vertex<Integer>          v3          = new Graph.Vertex<>(3);
    
        vertices.add(v0);
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);

        edges.add(new Graph.Edge<>(0, v0, v1));
        edges.add(new Graph.Edge<>(0, v0, v2));
        edges.add(new Graph.Edge<>(0, v1, v2));
        edges.add(new Graph.Edge<>(0, v2, v0));
        edges.add(new Graph.Edge<>(0, v2, v3));
        edges.add(new Graph.Edge<>(0, v3, v3));    

        Graph<Integer> graph = new Graph<>(Graph.TYPE.DIRECTED, vertices, edges);
        
        Graph.Vertex<Integer>[] result = BreadthFirstTraversal.breadthFirstTraversal(graph, v2);
        for(int i=0;i<4;i++)
            System.out.print(result[i].getValue()+" , ");
        //2,0,1,3
    }
}
