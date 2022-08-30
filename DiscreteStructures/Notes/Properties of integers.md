# 1.4 Properties of Integers

If r is zero then m = qn + r then m is a multiple of n and we write n | m.
eg) 2 | 10, 3 | 15

| means divisible by: 10 is divisible by 2

Let a, b, and c be integers
if a | b and a | c, then a | (b + c)
if a | b and a | c where b > c then a | (b-c)
if a | b or a | c then a | bc

### Prime
A number p > 1 in Z<sup>+</sup> is prime if the only positive intergers that divide p are p and 1

Every positve integer n > 1 can be written uniquely as p<sub>1</sub><sup>k<sub>1</sub></sup> while p<sub>1</sub> < p<sub>2</sub> < ...

9 = 3<sup>2</sup>
120 = 12 * 10 = 4 * 3 * 2 * 5 = 2<sup>3</sup> + 5

### GCD Creates Common Divisor

if a, b, and k and in z<sup>+</sup>, a and k | b, k is called a common divisor.
If d is the larges such k, d is called GCD

Compute GCD(12, 30)
12 = 2 * 3 * 2 = 2<sup>2</sup> * 3,
30 = 2 * 15 = 2 * 3 * 5
Common divisors: 2, 3
GCD: 3

Compute GCD(273, 98)
273 = 3 * 7 * 13
98 = 2 * 7 * 7 = 2 * 7<sup>2</sup>
GCD: 7

Euclidan algorithm for finding GCD(12, 30)
Divide 30 by 12: 30 = 2 * 12 + 6
Dived 12 by 6: 12 = 2 * 6 + 0
GCD: 6

Divide big by small, then go by remainder until remainder is zero. GCD is the last remainder greater than 0

GCD(273, 98)

273 / 98 = 2 * 98 + 77
98 / 77 = 1 * 77 + 21
77 / 21 = 3 * 21 + 14
21 / 14 = 1 * 14 + 7
14 / 7 = 2 * 7 + 0
GCD: 7

### LCM Least Common Multiple
if a, b, and k is z<sup>+</sup> and a | k and b | k, k is called a comon multiple of a and b.
if c is the smallest such k, c is called LCM

LCM(540, 504)
540 = 2<sup>2<sup> * 3<sup>3</sup> * 5
504 = 2 * 252 = 2 * 2 * 126 = 2 * 2 * 2 * 3 * 3 * 7 = 2<sup>3</sup> * 3<sup>2<sup> * 7

LCM: 2<sup>3</sup>, 3<sup>3</sup>, 5, 7

GCD(a, b) * LCM(a, b) = ab

LCM(a, b) = ab / GCD(a, b)

### Representation of integers
3264 is the decimal representation or base 10 expansion

If b > 1 is an integer, then every positive interger n can be uniquely expressed in the form:

n = d<sub>k</sub>b<sup>k</sup> + d<sub>k-1</sub>b<sup>k-1</sup> + ... + d<sub>1</sub>b + d<sub>0</sub>

Find the base 4 representation of 158

158 = 1 * 10<sup>2</sup> + 5 * 10 + 8

158 / 4 = 39 + 2
39 / 4 = 9 + 3
9 / 4 = 2 + 1

Base 4 = 2132
        Pos: 3210
To base 10: (2132)<sub>4</sub>

2*4<sup>3</sup> + 1 * 4<sup>2</sup> + 3 * 4 + 2

200 / 4 = 50 + 0
50 / 4 = 12 + 2
12 / 4 = 3 + 0

Base 4 = (3020)<sub>4</sub>

3 * 4<sup>3</sup> + 2 * 4<sup>1<sup>

Base 2 39

39 / 2 = 19 + 1
19 / 2 = 9 + 1
9 / 2 = 4 + 1
4 / 2 = 2 + 0
2 / 2 = 1 + 0
(100111)<sub>2<sub>

Find decimal of (110101)<sub>2</sub>
1 + 2^5 + 1 + 2^4 + 1 + 2^2 + 1 + 2^1

Elementary rules of addition and multiplication are vaid for any base b

(313)<sub>4</sub> + (322)<sub>4</sub> = 1301
