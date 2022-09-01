# 1.4 Matrices

A matrix is a rectangular array of numbers arranged in m horizontal rows and n vertical columns

     [a<sub>11</sub> a<sub>12</sub> ... a<sub>1n</sub>]
A =  [a<sub>21</sub> a<sub>22</sub> ... a<sub>2n</sub>]
     [... ...]
     [a<sub>m1</sub> a<sub>m2</sub> ... a<sub>mn</sub>]

Square matrice: h * n
Diagonal: square matrices where everything by diagnol is 0

Two m x n matrices A and B are said to be equal if all corresponding elements are the same

A = [[2 -3 1]
     [0 5 2]
     [4 -4 6]]

A + B = add corresponding positions

A=[a<sub>ij</sub> ] is an m x p matrix and b = [b<sub>ij</sub>] is a p x n matrix, then the product of A and B denoted AB is the m x n matrix C=[c<sub>ij</sub>] defined by

c<sub>ij</sub> = a<sub>i1</sub> * b<sub>1j</sub> + ...

     [2 3 -4]            [3 1]
A =  [1 2 3]   and B =   [-2 2]
                         [5 -3]

AB = [(2)(3) + (3)(-2) + (-4)(5) (2)(1) + (3)(2) + (-4)(-3)]
     [(1)(3) + (2)(-2) + (3)(5) (1)(1)+(2)(2)+(3)(-3)]

AB = [-20 20]
     [14 -4]                 

     [7 11 -9]
BA = [-2 -2 14]
     [7 9 -29]

Identity:
IA = A
AI = A

A0 = I
                                     [2 6]
Let A = [2 -3 5] then A<sup>T</sup> = [-3 1]
        [6 1 3]                      [5 3]