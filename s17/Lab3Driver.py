# Lab3Driver.py
# Driver for COSC 251, Lab 3
# COSC 251
# Alan C. Jamieson
# Last Update: 2/22/17

import Lab3

# names for the roster
names = ["Simon", "Lindsay", "Rob", "Alan", "Casey", "Susan", "Dave", "Ivan", "Emek", "Sandy", "Alex", "Colleen"]

# instantiating GradeBook and running required methods
mybook = Lab3.GradeBook(names)
mybook.callRoll()
# calling inputGrades multiple times in order to add multiple grades per student
mybook.inputGrades()
mybook.inputGrades()
mybook.inputGrades()
mybook.inputGrades()
mybook.inputGrades()
mybook.inputGrades()
mybook.inputGrades()
