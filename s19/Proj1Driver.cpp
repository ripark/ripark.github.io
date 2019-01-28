//Proj1Driver.cpp
//Driver file for Project 1, COSC 251, Spring 2019
//Alan C. Jamieson
//January 26, 2019
//Note - the above shows the required information for the header
//comment block (name of file, description, author name(s), date)
//and should be included with every file.

#include <iostream>
#include "PriorityQueue.h"

using namespace std;

int main(){
  PriorityQueue s;

  //Output: No elements in the queue
  s.printQueue();

  //Output: 1, Lindsay, 3.4
  //        6, That other dude, 3.4
  //        3, Simon, 3.3
  //        4, Casey, 1.5
  //        5, Sandy, 3.3
  //        2, Alan, 4.5
  //        6
  Student one(1,3.4,"Lindsay");
  Student two(2,4.5,"Alan");
  Student three(3,3.3,"Simon");
  Student four(4,1.5,"Casey");
  Student five(5,3.3,"Sandy");
  Student six(6,3.4,"That other dude");
  s.enqueue(one, 1);
  s.enqueue(two, 5);
  s.enqueue(three, 2);
  s.enqueue(four, 2);
  s.enqueue(five, 3);
  s.enqueue(six, 1);
  s.printQueue();
  cout<<s.size()<<endl;

  //Output: Lindsay
  //        That other dude
  //        3, Simon, 3.3
  //        4, Casey, 1.5
  //        5, Sandy, 3.3
  //        2, Alan, 4.5
  //        4
  cout<<s.front().getName()<<endl;
  s.dequeue();
  cout<<s.topandpop().getName()<<endl;
  s.printQueue();
  cout<<s.size()<<endl;

  //Output: 3
  cout<<s.front().getID()<<endl;

  //Output: 0
  s.clear();
  cout<<s.size()<<endl;

  //Output: Queue is empty!
  if (s.isEmpty()){
    cout<<"Queue is empty!"<<endl;
  }

  //Output: "Cannot dequeue from an empty queue."
  s.dequeue();

  //Output: 7, Seven, 3.2
  Student seven(7,3.2,"Seven");
  s.enqueue(seven, 6);
  s.printQueue();

  //Output: Queue is not empty!
  if (s.isEmpty()){
    cout<<"Queue is empty!"<<endl;
  }else{
    cout<<"Queue is not empty!"<<endl;
  }
  return 0;

}
