/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph<String, Integer> graph = new Graph<>();
        System.out.println("Creating a graph with 5  vertices and 6 edges");
        for(char i='A'; i<'F'; i++)
            graph.addVertice(i +"");
        graph.addEdge("A", "B", 1);
        graph.addEdge("B", "C", 3);
        graph.addEdge("B", "D", 2);
        graph.addEdge("B", "E", 1);
        graph.addEdge("C", "E", 4);
        graph.addEdge("D", "E", 2);
        graph.showGraph();
        System.out.println("Remove edge from B to D");
        graph.deleteEdge("B", "D");
        graph.showGraph();
        System.out.print("The adjacent list of vertice B is : ");
        ArrayList a = graph.getAdjecent("B");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) +" ");
        }
        System.out.println();
    }
    
}
