package ru.geekbrains.Lesson1;

public class GraphApp{
    public static void main( String [] args ) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        graph.addVertex('K');
        graph.addEdge(0,1); //AB
        graph.addEdge(1,2); //BC
        graph.addEdge(0,3); //AD
        graph.addEdge(3,4); //DE
        graph.addEdge(3,5); //DF
        graph.addEdge(4,6); //EG
        graph.addEdge(1,7); //BH
        graph.addEdge(2,8); //CI
        graph.addEdge(8,9); //IJ
        graph.addEdge(4,10); //EK
        //graph.dfs();
        graph.bfs();
    }
}
