// MyGenericTest.java
// Test program for Lab 3
// Alan Jamieson
// COSC 201
// Fall 2017
// September 18, 2017

public class MyGenericTest{

  public static void main(String[] args){
    MyGenerics g = new MyGenerics();

    Integer[] a = {1, 4, 7, 3, 2, 18, 20, 4, 16, 8};
    String[] b = {"This", "is", "a", "COSC", "201", "lab", "test", "program"};
 
    //Should print:
    //1
    //7
    //201
    //is
    System.out.println(g.mymin(a));
    System.out.println(g.median(a));
    System.out.println(g.mymin(b));
    System.out.println(g.median(b));
  }

}
