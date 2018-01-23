//Proj1Driver.cpp
//Driver file for Project 1, COSC 251, Spring 2018
//Alan C. Jamieson
//January 23, 2018
//Note - the above shows the required information for the header
//comment block (name of file, description, author name(s), date)
//and should be included with every file.

#include <iostream>
#include "Stack.h"

using namespace std;

int main(){
  Stack s;

  //Output: No elements in the LinkedList
  s.printStack();

  //Output: 6, That other dude, 3.4
  //        5, Sandy, 3.3
  //        4, Casey, 1.5
  //        3, Simon, 3.3
  //        2, Alan, 4.5
  //        1, Lindsay, 3.4
  //        6
  Student one(1,3.4,"Lindsay");
  Student two(2,4.5,"Alan");
  Student three(3,3.3,"Simon");
  Student four(4,1.5,"Casey");
  Student five(5,3.3,"Sandy");
  Student six(6,3.4,"That other dude");
  s.push(one);
  s.push(two);
  s.push(three);
  s.push(four);
  s.push(five);
  s.push(six);
  s.printStack();
  cout<<s.size()<<endl;

  //Output: That other dude
  //        Sandy
  //        4, Casey, 1.5
  //        3, Simon, 3.3
  //        2, Alan, 4.5
  //        1, Lindsay, 3.4
  //        4
  cout<<s.top().getName()<<endl;
  s.pop();
  cout<<s.topandpop().getName()<<endl;
  s.printStack();
  cout<<s.size()<<endl;

  //Output: 1, Lindsay, 3.4
  //        2, Alan, 4.5
  //        3, Simon, 3.3
  //        4, Casey, 1.5
  s.sort();
  s.printStack();

  //Output: 1
  cout<<s.top().getID()<<endl;

  //Output: 0
  s.clear();
  cout<<s.size()<<endl;

  //Output: Stack is empty!
  if (s.isEmpty()){
    cout<<"Stack is empty!"<<endl;
  }
  //Output: "Cannot pop an empty stack."
  s.pop();

  //Output: 7, Seven, 3.2
  Student seven(7,3.2,"Seven");
  s.push(seven);
  s.sort();
  s.printStack();

  //Output: Stack is not empty!
  if (s.isEmpty()){
    cout<<"Stack is empty!"<<endl;
  }else{
    cout<<"Stack is not empty!"<<endl;
  }
  return 0;

}
