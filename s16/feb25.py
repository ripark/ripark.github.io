#Classes!

class Rectangle:

  #constructor  
  def __init__(self,h,w):

    self.h=h
    self.w=w

  #area
  def area(self):
    return self.h*self.w

  #toString
  def __str__(self):
    return "Height: " + str(self.h) + " Width: " + str(self.w)
