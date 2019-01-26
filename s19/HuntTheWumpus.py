#HuntTheWumpus.py
#Wumpus World driver
#COSC370, Project 1
#Alan C. Jamieson
#Latest Revision: January 24, 2019

#This driver will ask the user for some information in regards to the format of the Hunt the Wumpus game (credit: Gregory Yob).
#This information will then be passed to the WumpusAgent module (user provided), then randomly assign wumpi, pits, and gold.
#The driver will simulate and provide sensory data as specified in the project document.

#Note: there are very few self-error checks as part of this program.
from random import randint

#setupBoard - takes number of wumpi and arrows from input, and returns a randomly sized, populated board
def setupBoard(wumpi, arrows):
    #get size of board
    n = randint(wumpi, 200)

    #initialize board, 0 represents a blank space
    l = [[0] * n] * n

    #place the gold

    #populate the pits, avoiding the gold

    #populate the wumpi, avoiding gold and pits

    #place the entrance

    return l

#stenchCheck - takes the x and y coordinates of the player and returns if there's a stench
def stenchCheck(x, y, l):
    return False

#glitterCheck
def glitterCheck(x, y, l):
    return False

#bumpCheck
def bumpCheck(x, y, l):
    return False

#breezeCheck
def breezeCheck(x, y, l):
    return False

#screamCheck - takes in the coordinates of the player, and the direction of the shot, returns True if a hit
def screamCheck(x, y, l, d):
    return False

#deathCheck - takes in the coordinates of the player, and determines if the player got eaten or fell into a pit
def deathCheck(x, y, l):
    return False

#moveWumpi - moves the moveWumpi
def moveWumpi(w, l):
    #Wumpus will not move onto the gold or onto a pit
    j

#winCheck - check to see if player is back on entrance tile, with the gold
def winCheck(x, y, l):
    return False

#--------------------------
#driver routine starts here
#--------------------------

#DO I NEED A WUMPUS STRUCT HERE?
l = tryingsomething()
print(l)
