package edu.aed.BreadthFirstTraversal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BreadthFirstTraversalTest {
    private static final byte[][] adjacencyMatrix = new byte[4][4];
    static {
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
    }   
    
    @Test
    public void test0() {
        final int[] result = BreadthFirstTraversal.
                breadthFirstTraversal(4, adjacencyMatrix, 2);
        assertTrue(result[0]==2,"Si es True, es correcto");
        assertTrue(result[1]==0,"Si es True, es correcto");
        assertTrue(result[2]==3,"Si es True, es correcto");
        assertTrue(result[3]==1,"Si es True, es correcto");
    }

//    @Test
//    public void testBreadthFirstTraversal_Graph_GraphVertex() {
//    }
//
//    @Test
//    public void testBreadthFirstTraversal_3args() {
//    }
    
}
