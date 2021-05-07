#python3
from __future__ import division
import math
import sys
from decimal import *
pi = 0.0
compte = 0
print("Nombre de repetition de la boucle:\n")
nbRepetition = int(input())
#nbRepetition = 100000
for i in range(nbRepetition):
    calcul = Decimal(((-1) ** i) / ((Decimal(2) * i) + 1))
    pi = Decimal(calcul) + Decimal(pi)
    if compte%(nbRepetition/100) == 0:
        print(str(pi*4) + ", " + str(i))
    compte = compte+1

print("\n\ncalcul: " + str(pi*4) + "\nnombre de calculs: " + str(i) + "\nmath.pi " + str(math.pi))

