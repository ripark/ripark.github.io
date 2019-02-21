#lab4driver.py
#Test Driver for Lab 4, COSC 251
#Spring 2019
#Alan Jamieson

#Quick test driver for the two methods in lab 4. Read the comments
#to see what your code should print out!

#command to run on prometheus
#(make sure this source and your lab4.py source are in the same directory!):
# python3 lab4driver.py

import lab4

#retest tests
#Output:
# False
# True
# True
# True
# False
# False
# False
# False
# False
lab4.retest("adiQY43!?1cndyoloCB13.44c")
lab4.retest("AAAAAAAAAAAA")
lab4.retest("")

#lambdatest tests
#Output:
#[0, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90, 96, 102]
#[0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
#["Alan", "Almost", "A", "A."]
#[]
#[]
ml = range(0,103)
ma = ["Alan", "is", "the", "best.", "Almost", "as", "much", "as", "Lindsay.", "Here's", "A", "random", "a", "for", "testing.", "A."]
print(lab4.lambdatest(ml,1))
print(lab4.lambdatest(ml,2))
print(lab4.lambdatest(ma,3))
print(lab4.lambdatest([],2))
print(lab4.lambdatest([],3))
