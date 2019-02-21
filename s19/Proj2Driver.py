#Proj2Driver.py
#Test Driver for COSC 251 Project 2
#Spring 2017
#Last Revision - 2/20/2019
#Alan C. Jamieson

#To run, make sure that your Proj2.py file is in the
#same directory as this file.
#On Prometheus, run this file using the command:
# python3 Proj2Driver

import Proj2

#Problem 1
print("Problem 1 expected output:")
print("6H2O+6CO2=6O2+C6H12O6 balances")
print("2Na+2H2O=2NaOH+H2 balances")
print("C6H12O6=3C2H2+3O2 does not balance")
print("Your output:")
Proj2.Problem1("6H2O+6CO2=6O2+C6H12O6")
Proj2.Problem1("2Na+2H2O=2NaOH+H2 C6H12O6=3C2H2+3O2")

#Problem 2
print("Problem 2 expected output:")
print("0.0")
print("7.10178453")
print("917.007436422")
print("Your output:")
Proj2.Problem2("0 49.9")
Proj2.Problem2("50 49.85")
Proj2.Problem2("99.98 49.99")

#Problem 3
print("Problem 3 expected output:")
print("1A 2M")
print("1M 2A 1M")
print("impossible")
print("empty")
print("6A 1M 2A 1M 11A 1M 5A 1M 3A 1M 4A 1M 7A")
print("Your output:")
Proj2.Problem3("1 2 2 3 10 20")
Proj2.Problem3("1 3 2 3 22 33")
Proj2.Problem3("3 2 2 3 4 5")
Proj2.Problem3("5 3 2 3 2 3")
Proj2.Problem3("8 13 28 91 375383947 679472915")
