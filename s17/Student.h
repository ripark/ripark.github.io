#include<string>

using namespace std;

class Student{
public:
  Student(){}
  Student(int i, double g, string n):id(i), gpa(g), name(n){}
  int getID(){return id;}
  double getGPA(){return gpa;}
  string getName(){return name;}
private:
  int id;
  double gpa;
  string name;

};
