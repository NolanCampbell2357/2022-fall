# Sequences

A list of objects arranges in a definite order
The list may stop after a certain steps -> finite sequence
ex: 1, 0, 0, 1, 0
or the list goes on forever -> infinite
ex: 3, 8, 13, 18, 23, ...

Recursive
f<sub>i</sub> = f<sub>i - 1</sub> + 5
f<sub>1</sub> = 3

Explicit
f<sub>i</sub> = f<sub>1</sub> + (i - 1)5
f<sub>i</sub> = 5i - 2

### Sequence number example

0, 2, 3, 6, 8

Recursive
f<sub>i</sub> = f<sub>i - 1</sub> + 2
f<sub>1</sub> = 0

Explicit
f<sub>i</sub> = 2i - 2 or (0 + 2(i - 1))

-----

4, 6, 8, 10, 12

Recursive
f<sub>i</sub> = f<sub>i - 1</sub> + 2
f<sub>1</sub> = 4

Explicit
f<sub>i</sub> = 2i + 2  or (4 + 2(i - 1))

-----

3, 7, 11, 15, 19, 23

Recursive
f<sub>i</sub> = f<sub>i - 1</sub> - 1
f<sub>1</sub> = 3

Explicit
f<sub>i</sub> = 4i - 1 or (3 + 4(i - 1))

-----

87, 82, 77, 72, 67

Recursive
f<sub>i</sub> = f<sub>i - 1</sub> - 5
f<sub>1</sub> = 87

Explicit
f<sub>i</sub> = 87 - 5(i - 1) or 92 - 5i

-----
5, 10, 20, 40, 80, 160

Recursive
f<sub>i</sub> = 2f<sub>i - 1</sub>
f<sub>1</sub> = 5

Explicit
f<sub>i</sub> = 2<sup>i - 1</sup> * 5

-----
-1, 1, -1, 1, -1, 1

Recursive
f<sub>i</sub> = -1f<sub>i - 1</sub>
f<sub>1</sub> = -1

Explicit
f<sub>i</sub> = -1<sup>i - 1</sup>

-----
0, 4, 0, 4, 0, 4

Recursive
f<sub>i</sub> = 
f<sub>1</sub> = 0

Explicit
f<sub>i</sub> = 2((-1<sup>i</sup>) + 1) or 4(i-1) % 8

-----
-4, 16, -64, 256

Recursive
f<sub>i</sub> = -4f<sub>i - 1</sub>
f<sub>1</sub> = -4

Explicit
f<sub>i</sub> = -4<sup>i - 1</sup>

### String and Regular Expression sequences

A: a set of symbols, an alphabet
{a, b, c}, {0, 1}

A*: set of all finite sequences of elements of A. strings from A
{a, b, c, aa, ab, ac}

Let A = {ab, bc, ba}, tell if the following strings belong to A*
ababab = true, abc = false, abba = true, abbcbaba = true, bcabbaab = true, abbbcba = false

Upside V is empty string
V is or

Let A = {a, b, c}
a*b*c -> {c, ac, bc, aac, aabbc, bbc}
(abc V c)* -> {"", abc, abcabc, cc, abcc, cabccabcc}
