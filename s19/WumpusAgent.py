from random import randint

def setParams(a, b, c):
    print("Param check: ")
    print(a)
    print(b)
    print(c)

def getMove(a):
    m = randint(0, 3)
    if m == 0:
        return "N"
    if m == 1:
        return "S"
    if m == 2:
        return "W"
    if m == 3:
        return "E"
