package Graphs;

import java.util.ArrayList;

public class Graph {

    private ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    Graph(int V) {
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println(graph);
    }

    void addEdge(int i, int j) {
        // for an undirected graph
        // add edges from vertices i-j and j-i
        graph.get(i).add(j);
        graph.get(j).add(i);
    }

    int getSize(){
        return graph.size();
    }

    void printGraph(){
        System.out.println(graph);
    }

    public static void main(String[] args) {

        Graph obj = new TraversingGraphs(5);
                    // assigning parent class to object of child class

        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 4);
        obj.addEdge(0, 3);
        obj.addEdge(4, 1);

        obj.printGraph();


    }

}

// ! Dont use Inheritance, i dont know why but i have heard it a lot