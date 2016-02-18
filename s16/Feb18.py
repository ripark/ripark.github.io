#This is a comment

#Python is a procedural language, but has elements of functional languages
#Code from a file, or code directly in the interpreter

#Types and typing - uses duck typing
#"If it walks like a duck, talks like a duck, I would call it a duck" -
# James Whitcomb Riley

#declaration example
x = 10

#Strongly typed language, but dynamic at declaration
#Type constraints are not checked at compile time, it will just let things fail

def foo2(i):
    print(i*3)

foo2(x)

def add2ints(x, y):
    return x+y

print(add2ints(14,15))

#scoping in Python - based on indention

#control statements

x = 12

if x < 12:
    print("x is less than 12")
elif x == 12:
    print("x is equal to 12")
else:
    print("x is greater than 12")

l = [1, 4, 7, "whee", True]

#standard iteration, list
for a in l:
    print(a)

#iteration with counter
for i in range(10):
    print(i)

