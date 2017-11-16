// Lab6Driver.java
// Test program for Lab 6, BFS/DFS traversals
// Alan Jamieson
// COSC 201
// Fall 2017
// November 20, 2017

public class Lab6Driver{

  public static void main(String[] args){
    TreeTraversals t = new TreeTraversals();
    int mygraph[][]={{0, 1, 1, 0, 0, 0, 0},
                     {1, 0, 0, 1, 1, 1, 0},
                     {1, 0, 0, 0, 0, 0, 1},
                     {0, 1, 0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0, 0, 0}};

    System.out.println("Should print: 0, 1, 2, 3, 4, 5, 6");
    t.BFS(mygraph);
    System.out.println("Should print: 0, 1, 3, 4, 5, 2, 6");
    System.out.println("Or 0, 2, 6, 1, 5, 4, 3");
    t.DFS(mygraph);
  }
}
