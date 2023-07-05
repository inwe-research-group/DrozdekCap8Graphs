package edu.aed.Graph;

import java.util.ArrayList;
import java.util.List;
import edu.aed.Graph.Graph.Vertex;
import edu.aed.Graph.Graph.Edge;
import java.util.HashMap;
import java.util.Map;

public class TestGraph {
    public static void main(String[] args) {        
        UndirectedGraph undirectedGraph = new UndirectedGraph();
//        System.out.println(undirectedGraph.graph.toString());
        
//        DirectedGraph directedGraph = new DirectedGraph();
//        System.out.println(directedGraph.graph.toString());
//        
//        DirectedWithNegativeWeights directedWithNegativeWeights = new DirectedWithNegativeWeights();        
//        System.out.println(directedWithNegativeWeights.graph.toString());

//          Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> idealUndirectedPath;
//          idealUndirectedPath=getIdealUndirectedPath(undirectedGraph);
//          for (Graph.CostPathPair valor : idealUndirectedPath.values()) {
//            System.out.println(valor);
//          }

           //testDijkstraUndirected();
           //testDijkstraDirected();
           //testDijkstraDirectedWihtNegativeWeights();
           testFloydWarshallonDirectedWithNegWeights();
    }
    private static class UndirectedGraph{//1.grafo no dirigido
        final List<Vertex<Integer>> verticies = new ArrayList<>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<>(8);
        {
        verticies.add(v1);
        verticies.add(v2);
        verticies.add(v3);
        verticies.add(v4);
        verticies.add(v5);
        verticies.add(v6);
        verticies.add(v7);
        verticies.add(v8);}
        
        final List<Edge<Integer>> edges = new ArrayList<>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<>(7, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<>(9, v1, v3);
        final Graph.Edge<Integer> e1_6 = new Graph.Edge<>(14, v1, v6);
        final Graph.Edge<Integer> e2_3 = new Graph.Edge<>(10, v2, v3);
        final Graph.Edge<Integer> e2_4 = new Graph.Edge<>(15, v2, v4);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<>(11, v3, v4);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<>(2, v3, v6);
        final Graph.Edge<Integer> e5_6 = new Graph.Edge<>(9, v5, v6);
        final Graph.Edge<Integer> e4_5 = new Graph.Edge<>(6, v4, v5);
        final Graph.Edge<Integer> e1_7 = new Graph.Edge<>(1, v1, v7);
        final Graph.Edge<Integer> e1_8 = new Graph.Edge<>(1, v1, v8);
        
        {edges.add(e1_2);
        edges.add(e1_3);
        edges.add(e1_6);
        edges.add(e2_3);
        edges.add(e2_4);
        edges.add(e3_4);
        edges.add(e3_6);
        edges.add(e5_6);
        edges.add(e4_5);
        edges.add(e1_7);
        edges.add(e1_8);}
        
        final Graph<Integer> graph = new Graph<>(verticies, edges);
    }
    private static class DirectedGraph{//2.grafo dirigido
        final List<Vertex<Integer>> verticies = new ArrayList<>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<>(8);
        
        {verticies.add(v1);
        verticies.add(v2);
        verticies.add(v3);
        verticies.add(v4);
        verticies.add(v5);
        verticies.add(v6);
        verticies.add(v7);
        verticies.add(v8);}
        
        final List<Edge<Integer>> edges = new ArrayList<>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<>(7, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<>(9, v1, v3);
        final Graph.Edge<Integer> e1_6 = new Graph.Edge<>(14, v1, v6);
        final Graph.Edge<Integer> e2_3 = new Graph.Edge<>(10, v2, v3);
        final Graph.Edge<Integer> e2_4 = new Graph.Edge<>(15, v2, v4);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<>(11, v3, v4);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<>(2, v3, v6);
        final Graph.Edge<Integer> e6_5 = new Graph.Edge<>(9, v6, v5);
        final Graph.Edge<Integer> e6_8 = new Graph.Edge<>(14, v6, v8);
        final Graph.Edge<Integer> e4_5 = new Graph.Edge<>(6, v4, v5);
        final Graph.Edge<Integer> e4_7 = new Graph.Edge<>(16, v4, v7);
        final Graph.Edge<Integer> e1_8 = new Graph.Edge<>(30, v1, v8);
        
        {edges.add(e1_2);
        edges.add(e1_3);
        edges.add(e1_6);
        edges.add(e2_3);
        edges.add(e2_4);
        edges.add(e3_4);
        edges.add(e3_6);
        edges.add(e6_5);
        edges.add(e6_8);
        edges.add(e4_5);
        edges.add(e4_7);
        edges.add(e1_8);}
        
        final Graph<Integer> graph = new Graph<>(Graph.TYPE.DIRECTED, verticies, edges);
        //System.out.println(graph.toString());
    }
    public static class DirectedWithNegativeWeights{//3.Grafos dirigidos con pesos negativos
        final List<Vertex<Integer>> verticies = new ArrayList<>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<>(4);
        
        {verticies.add(v1);
        verticies.add(v2);
        verticies.add(v3);
        verticies.add(v4);}
        
        final List<Edge<Integer>> edges = new ArrayList<>();
        final Graph.Edge<Integer> e1_4 = new Graph.Edge<>(2, v1, v4);  // w->z
        final Graph.Edge<Integer> e2_1 = new Graph.Edge<>(6, v2, v1);  // x->w
        final Graph.Edge<Integer> e2_3 = new Graph.Edge<>(3, v2, v3);  // x->y
        final Graph.Edge<Integer> e3_1 = new Graph.Edge<>(4, v3, v1);  // y->w
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<>(5, v3, v4);  // y->z
        final Graph.Edge<Integer> e4_2 = new Graph.Edge<>(-7, v4, v2); // z->x
        final Graph.Edge<Integer> e4_3 = new Graph.Edge<>(-3, v4, v3); // z->y
        
        {edges.add(e1_4);
        edges.add(e2_1);
        edges.add(e2_3);
        edges.add(e3_1);
        edges.add(e3_4);
        edges.add(e4_2);
        edges.add(e4_3);}
        
        final Graph<Integer> graph = new Graph<>(Graph.TYPE.DIRECTED, verticies, edges);
        //System.out.println(graph.toString());
    }
    
    // Ideal undirected path(ruta no dirigida ideal
    private static Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> 
        getIdealUndirectedPath(UndirectedGraph undirected) {
        final HashMap<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> 
                idealUndirectedPath = new HashMap<>();
        {
        final int cost = 11;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_3);
        list.add(undirected.e3_6);
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v6, path);
        }
        
        {
        final int cost = 20;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_3);
        list.add(undirected.e3_6);
        list.add(new Graph.Edge<Integer>(9, undirected.v6, undirected.v5));
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v5, path);
        }
        {
        final int cost = 9;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_3);
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v3, path);
        }
        {
        final int cost = 20;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_3);
        list.add(undirected.e3_4);
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v4, path);
        }
        {
        final int cost = 7;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_2);
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v2, path);
        }
        {
        final int cost = 0;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v1, path);
        }
        {
        final int cost = 1;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_7);
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v7, path);
        }
        {
        final int cost = 1;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_8);
        final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
        idealUndirectedPath.put(undirected.v8, path);
        }
        return idealUndirectedPath;
    }
        
    // Ideal undirected PathPair
    private static Graph.CostPathPair<Integer> getIdealUndirectedPathPair(UndirectedGraph undirected) {
        final int cost = 20;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(undirected.e1_3);
        list.add(undirected.e3_6);
        list.add(new Graph.Edge<Integer>(9, undirected.v6, undirected.v5));
        return (new Graph.CostPathPair<Integer>(cost, list));
    }
        
    public static void testDijkstraUndirected() {
        final UndirectedGraph undirected = new UndirectedGraph();
        final Graph.Vertex<Integer> start = undirected.v1;
        final Graph.Vertex<Integer> end = undirected.v5;
        {// UNDIRECTED GRAPH
        final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> map1 
                = Dijkstra.getShortestPaths(undirected.graph, start);
        
        // Compare results
        Graph.CostPathPair<Integer> path1,path2,pair1;
        System.out.println("****Dijkstra.getShortestPaths del vertice inicial"+start+" ****");
        for (Graph.Vertex<Integer> v : map1.keySet()) {
            System.out.println("v=" + v.getValue());
            path1 = map1.get(v);
            System.out.println("Dijkstra's shortest path=" + path1);
            
            System.out.println("****getIdealUndirectedPath****");
            path2 = getIdealUndirectedPath(undirected).get(v);
              System.out.println("Verificando el error en la ruta mas corta Dijkstra's. path1="+
              path1+" path2="+path2 + " path1.equals(path2)="+path1.equals(path2));
        }
        
        System.out.println("****Dijkstra.getShortestPath del vertice inicial"+start+" vertice final "+end+" ****");
        pair1 = Dijkstra.getShortestPath(undirected.graph, start, end);
        System.out.println("Ruta desde " + start.getValue() + " to " + 
                end.getValue()+ " (pair1 != null)= " + (pair1 != null));        
        System.out.println(pair1);
        
        System.out.println("****getIdealUndirectedPathPair****");
        System.out.println("Verificando el error en la ruta mas corta Dijkstra's. pair="+pair1+
                " pair="+getIdealUndirectedPathPair(undirected)+
                " pair1.equals "+ pair1.equals(getIdealUndirectedPathPair(undirected)));
        }
        
        
    }
    
    // Ideal directed path
    private static Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> getIdealDirectedPath(DirectedGraph directed) {
        final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> idealDirectedPath = new HashMap<>();
        {
            final int cost = 11;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_3);
            list.add(directed.e3_6);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v6, path);
        }
        {
            final int cost = 20;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_3);
            list.add(directed.e3_6);
            list.add(new Graph.Edge<Integer>(9, directed.v6, directed.v5));
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v5, path);
        }
        {
            final int cost = 36;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_3);
            list.add(directed.e3_4);
            list.add(directed.e4_7);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v7, path);
        }
        {
            final int cost = 9;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_3);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v3, path);
        }
        {
            final int cost = 20;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_3);
            list.add(directed.e3_4);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v4, path);
        }
        {
            final int cost = 7;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_2);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v2, path);
        }
        {
            final int cost = 0;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v1, path);
        }
        {
            final int cost = 25;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directed.e1_3);
            list.add(directed.e3_6);
            list.add(directed.e6_8);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedPath.put(directed.v8, path);
        }
        return idealDirectedPath;
    }

    // Ideal directed Path Pair
    private static Graph.CostPathPair<Integer> getIdealPathPair(DirectedGraph directed) {
        final int cost = 20;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(directed.e1_3);
        list.add(directed.e3_6);
        list.add(new Graph.Edge<Integer>(9, directed.v6, directed.v5));
        return (new Graph.CostPathPair<Integer>(cost, list));
    }
    
    public static void testDijkstraDirected() {
        final DirectedGraph directed = new DirectedGraph();
        final Graph.Vertex<Integer> start = directed.v1;
        final Graph.Vertex<Integer> end = directed.v5;
        final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> map1 = Dijkstra.getShortestPaths(directed.graph, start);

        // Compare results
        for (Graph.Vertex<Integer> v : map1.keySet()) {
            final Graph.CostPathPair<Integer> path1 = map1.get(v);
            final Graph.CostPathPair<Integer> path2 = getIdealDirectedPath(directed).get(v);
            System.out.println("Dijkstra's shortest path error. path1="+path1+" path2="+path2+" path1.equals(path2)= "+ path1.equals(path2));
        }

        final Graph.CostPathPair<Integer> pair1 = Dijkstra.getShortestPath(directed.graph, start, end);
        System.out.println("No path from "+start.getValue()+" to "+end.getValue()+" (pair1!=null)= "+ (pair1!=null));

        // Compare pair
        System.out.println("Dijkstra's shortest path error. pair1="+pair1+" idealPathPair="+getIdealPathPair(directed)+" pair1.equals(getIdealPathPair(directed))= "+ pair1.equals(getIdealPathPair(directed)));
    }

     // Ideal directed with negative weight path
    private static Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> getIdealDirectedNegWeight(DirectedWithNegativeWeights directedWithNegWeights) {
        final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> idealDirectedNegWeight = new HashMap<>();
        {
            final int cost = -2;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directedWithNegWeights.e1_4);
            list.add(directedWithNegWeights.e4_2);
            list.add(directedWithNegWeights.e2_3);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v3, path);
        }
        {
            final int cost = 2;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directedWithNegWeights.e1_4);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v4, path);
        }
        {
            final int cost = -5;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            list.add(directedWithNegWeights.e1_4);
            list.add(directedWithNegWeights.e4_2);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v2, path);
        }
        {
            final int cost = 0;
            final List<Graph.Edge<Integer>> list = new ArrayList<>();
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v1, path);
        }
        return idealDirectedNegWeight;
    }

    // Ideal pair
    private static Graph.CostPathPair<Integer> getIdealDirectedWithNegWeightsPathPair(DirectedWithNegativeWeights directedWithNegWeights) {
        final int cost = -2;
        final List<Graph.Edge<Integer>> list = new ArrayList<>();
        list.add(directedWithNegWeights.e1_4);
        list.add(directedWithNegWeights.e4_2);
        list.add(directedWithNegWeights.e2_3);
        return (new Graph.CostPathPair<Integer>(cost, list));
    }
    
    public static void testDijkstraDirectedWihtNegativeWeights() {
        final DirectedWithNegativeWeights directedWithNegWeights = new DirectedWithNegativeWeights();
        {   // DIRECTED GRAPH (WITH NEGATIVE WEIGHTS)
            final Graph.Vertex<Integer> start = directedWithNegWeights.v1;
            final Graph.Vertex<Integer> end = directedWithNegWeights.v3;
            final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> map1 = BellmanFord.getShortestPaths(directedWithNegWeights.graph, start);

            // Compare results
            for (Graph.Vertex<Integer> v : map1.keySet()) {
                final Graph.CostPathPair<Integer> path1 = map1.get(v);
                final Graph.CostPathPair<Integer> path2 = getIdealDirectedNegWeight(directedWithNegWeights).get(v);
                System.out.println("Bellman-Ford's shortest path error. path1="+path1+" path2="+path2+" path1.equals(path2)= "+ path1.equals(path2));
            }

            final Graph.CostPathPair<Integer> pair1 = BellmanFord.getShortestPath(directedWithNegWeights.graph, start, end);
            System.out.println("No path from " + start.getValue() + " to " + end.getValue()+" pair1 != null "+ pair1 != null);

            // Compare pair
            System.out.println("Bellman-Ford's shortest path error. pair1="+pair1+" result2="+
                    getIdealDirectedWithNegWeightsPathPair(directedWithNegWeights)+
                    " pair1.equals(getIdealDirectedWithNegWeightsPathPair(directedWithNegWeights))= "+ 
                    pair1.equals(getIdealDirectedWithNegWeightsPathPair(directedWithNegWeights)));
        }
    }
    
    public static void testFloydWarshallonDirectedWithNegWeights() {
        final DirectedWithNegativeWeights directedWithNegWeights = new DirectedWithNegativeWeights();
        {
            final Map<Vertex<Integer>, Map<Vertex<Integer>, Integer>> pathWeights = FloydWarshall.getAllPairsShortestPaths(directedWithNegWeights.graph);
            final Map<Vertex<Integer>, Map<Vertex<Integer>, Integer>> result = new HashMap<>();
            {
                // Ideal weights
                {   // Vertex 3
                    final Map<Vertex<Integer>, Integer> m = new HashMap<>();
                    {
                        // Vertex 3
                        m.put(directedWithNegWeights.v3, 0);
                        // Vertex 4
                        m.put(directedWithNegWeights.v4, 5);
                        // Vertex 2
                        m.put(directedWithNegWeights.v2, -2);
                        // Vertex 1
                        m.put(directedWithNegWeights.v1, 4);
                    }
                    result.put(directedWithNegWeights.v3, m);
                }
                {   // Vertex 4
                    final Map<Vertex<Integer>, Integer> m = new HashMap<>();
                    {
                        // Vertex 3
                        m.put(directedWithNegWeights.v3, -4);
                        // Vertex 4
                        m.put(directedWithNegWeights.v4, 0);
                        // Vertex 2
                        m.put(directedWithNegWeights.v2, -7);
                        // Vertex 1
                        m.put(directedWithNegWeights.v1, -1);
                    }
                    result.put(directedWithNegWeights.v4, m);
                }
                {   // Vertex 2
                    final Map<Vertex<Integer>, Integer> m = new HashMap<>();
                    {
                        // Vertex 3
                        m.put(directedWithNegWeights.v3, 3);
                        // Vertex 4
                        m.put(directedWithNegWeights.v4, 8);
                        // Vertex 2
                        m.put(directedWithNegWeights.v2, 0);
                        // Vertex 1
                        m.put(directedWithNegWeights.v1, 6);
                    }
                    result.put(directedWithNegWeights.v2, m);
                }
                {   // Vertex 1
                    final Map<Vertex<Integer>, Integer> m = new HashMap<>();
                    {
                        // Vertex 3
                        m.put(directedWithNegWeights.v3, -2);
                        // Vertex 4
                        m.put(directedWithNegWeights.v4, 2);
                        // Vertex 2
                        m.put(directedWithNegWeights.v2, -5);
                        // Vertex 1
                        m.put(directedWithNegWeights.v1, 0);
                    }
                    result.put(directedWithNegWeights.v1, m);
                }
            }

            // Compare results
            Map<Vertex<Integer>, Integer> m1,m2;
            int i1,i2;
            for (Vertex<Integer> vertex1 : pathWeights.keySet()) {
                m1= pathWeights.get(vertex1);
                m2 = result.get(vertex1);
                System.out.println("Floyd-Warshall's all-pairs shortest path weights error. vertex1="+vertex1);
                System.out.println("Floyd-Warshall's all-pairs shortest path weights error. m1="+m1);
                System.out.println("Floyd-Warshall's all-pairs shortest path weights error. m2="+m2);
                for (Vertex<Integer> v : m1.keySet()) {
                    i1 = m1.get(v);
                    i2 = m2.get(v);
                    System.out.println("Floyd-Warshall's all-pairs shortest path weights error. i1="+i1+" i2="+i2 +" (i1 == i2) "+ (i1 == i2));
                }

            }
        }
    }
}
