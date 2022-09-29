# CH 4 Relations and Digraphs

## 4.1 Product Set and Partitions

If A and B are two nonempty sets, we def the product set of Cartesian Product A x B as the set of all ordered pairs (a,b) with a ∈ A and b ∈ B

A x B = {(a, b) | a ∈ A and b ∈ B}

Cartesian Product: A<sub>1</sub> * A<sub>2</sub> * ... * A<sub>m</sub> of the non empty sets is the set of all ordered m-tuples (a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>)

Let A = {a, b} and B = {4, 5, 6}, list the elements in

A x B = (a, 4), (a, 5), (a, 6), (b, 4), (b, 5), (b, 6)
B X A = (4, a), (4, b), (5, a), (5, b), (6, a), (6, b)
A x A = (a, a), (a, b), (b, a), (b, b)

Let A = {a, b, c}, B = {1, 2} and C = {#, *}, list A x B x C

(a, 1, #), (a, 1, *), (a, 2, #), (a, 2, *), 
(b, 1, #), (b, 1, *), (b, 2, #), (b, 2, *),
(c, 1, #), (c, 1, *), (c, 2, #), (c, 2, *)

A partition or quotient set of a nonempty set A is a collection <i>p</i> of nonempty subsets of A such that

1. Each element of A belongs to one of the sets in <i>p</i>
2. If A<sub>1</sub> and A<sub>2</sub> are distinct elements of <i>p</i>, then A<sub>1</sub> ∩ A<sub>2</sub> = Ø

Let A = {a, b, c, d, e, f, g, h}. Consider the following subsets of A

A(1) = {a, b, c, d}, A(2) = {a, c, e, f, g, h}, A(3) = {a, b, e, g}, A(4) = {b, d}

List all partitions of A = {1, 2, 3}

{{1}, {2, 3}}, {{1}, {2}, {3}}, {{1, 2}, {3}}, {{1, 3}, {2}}