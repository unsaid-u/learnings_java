package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class TraversingGraphs extends Graph{

    TraversingGraphs(int V) {
        super(V);
        // calling constructor of the parent class since the parent class only has a parameterised constructor
    }

    boolean[] getVisitedArray(int size){
        boolean[] visited = new boolean[size];
        Arrays.fill(visited,false);
        return visited;
    }

    // implement dfs method here
     ArrayList<Integer> DFS(Graph graph, int start){
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = getVisitedArray(graph.getSize());


        return result;
    }



}
