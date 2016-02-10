//Proj1Driver.cpp
//Driver file for Project 1, COSC 251, Spring 2016
//Alan C. Jamieson
//February 9, 2016

#include <iostream>
#include "LinkedList.h"

int main(){
  LinkedList l;

  //Output: No elements in the LinkedList
  l.printList();
  
  //Output: 6, That other dude, 3.4
  //        1, Lindsay, 3.4
  //        3, Simon, 3.3
  //        5, Sandy, 3.3
  //        2, Alan, 4.5
  //        4, Casey, 1.5
  //        6
  Student one(1,3.4,"Lindsay");
  Student two(2,4.5,"Alan");
  Student three(3,3.3,"Simon");
  Student four(4,1.5,"Casey");
  Student five(5,3.3,"Sandy");
  Student six(6,3.4,"That other dude");
  l.add(0,one);
  l.add(1,two);
  l.add(1,three);
  l.add(4,four); //should add to the end
  l.add(2,five);
  l.add(0,six);
  l.printList();
  cout<<l.length()<<endl;

  //Output: Sandy
  //        6, That other dude, 3.4
  //        1, Lindsay, 3.4
  //        3, Simon, 3.3
  //        2, Alan, 4.5
  //        4, Casey, 1.5
  //        5
  cout<<l.remove(3).getName()<<endl;
  l.printList();
  cout<<l.length()<<endl;

  //Output: 1, Lindsay, 3.4
  //        2, Alan, 4.5
  //        3, Simon, 3.3
  //        4, Casey, 1.5
  //        6, That other dude, 3.4
  l.sort();
  l.printList();

  //Output: 3
  cout<<l.get(2).getID()<<endl;

  //Output: Lindsay
  //        That other dude
  cout<<l.front().getName()<<endl;
  cout<<l.back().getName()<<endl;

  //Output: "Cannot get element that does not exist."
  l.get(5);
  
  //Output: "Cannot get element that does not exist."
  l.get(-1);

  //Output: "Cannot remove element that does not exist."
  l.remove(12);

  //Output: 0
  l.clear();
  cout<<l.length()<<endl;

  //Output: "Cannot remove on an empty list."
  l.remove(0);

  //Output: 7, Seven, 3.2
  Student seven(7,3.2,"Seven");
  l.add(0,seven);
  l.sort();
  l.printList();

  return 0;

}
