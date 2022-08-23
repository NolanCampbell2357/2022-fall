# Discrete Structures Week 1

## Sets

| Symbol | Symbol Name | Meaning | Example
| ------ | ----------- | ------- | -------
| { } | set	| a collection of elements | A = {1, 7, 9, 13, 15, 23}, B = {7, 13, 15, 21}
| A ∪ B	| union | Elements that belong to set A or set B | A ∪ B = {1, 7, 9, 13, 15, 21, 23}
| A ∩ B	| intersection | Elements that belong to both the sets, A and B	| A ∩ B = {7, 13, 15 }
| A ⊆ B	| subset | subset has few or all elements equal to the set | {7, 15} ⊆ {7, 13, 15, 21}
| A ⊈ B	| not subset | left set is not a subset of right set | {1, 23} ⊄ B
| A ⊂ B	| proper subset / strict subset | subset has fewer elements than the set | {7, 13, 15} ⊂ {1, 7, 9, 13, 15, 23}
| A ⊃ B	| proper superset / strict superset | set A has more elements than set B | {1, 7, 9, 13, 15, 23} ⊃ {7, 13, 15, }
| A ⊇ B	| superset | set A has more elements or equal to the set B | {1, 7, 9, 13, 15, 23} ⊃ {7, 13, 15, 21}
| Ø	| empty set | Ø = { } | C = {Ø}
| P (C)	power set | all subsets of C | C = {4,7}, P(C) = {{}, {4}, {7}, {4,7}} Given by 2^s, s is number of elements in set C
| A ⊅ B	| not superset | set X is not a superset of set Y | {1, 2, 5} ⊅{1, 6}
| A = B	| equality | both sets have the same members | {7, 13,15} = {7, 13, 15}
| A \ B or A-B | relative complement (difference) | objects that belong to A and not to B | A - B = {1, 9, 23}
| A^c or - over A | complement | all the objects that do not belong to set A	| We know, U = {1, 2, 7, 9, 13, 15, 21, 23, 28, 30}, Ac = {2, 21, 28, 30}
| A ⊕  B	| symmetric difference | objects that belong to A or B but not to their intersection | A ⊕  B = {1, 9, 21, 23}
| a∈B | element of | set membership | B = {7, 13, 15, 21}, 13 ∈ B
| (a,b)	| ordered pair | collection of 2 elements | (1, 2)
| x∉A | not element of | no set membership | A = {1, 7, 8, 13, 15, 23}, 5 ∉ A
| |B|, #B | cardinality	| the number of elements of set B | B = {7, 13, 15, 21}, |B|=4
| A×B | cartesian product | set of all ordered pairs from A and B | {3,5} × {7,8} = {(3,7), (3,8), (5,7), (5, 8) }
| N1 | natural numbers / whole numbers set (without zero) | N1 = {1, 2, 3, 4, 5,…} | 6 ∈ N1
| N0 | natural numbers / whole numbers  set (with zero)	| N0 = {0, 1, 2, 3, 4,…} | 0 ∈ N0
| Q	| rational numbers set | Q= {x \| x=a/b, a, b∈Z}	| 2/6 ∈ Q
| Z	| integer numbers set | Z= {…-3, -2, -1, 0, 1, 2, 3,…} | -6 ∈ Z
| C	| complex numbers set | C= {z \| z=a+bi, -∞<a<∞,-∞<b<∞} | 6+2i ∈ C
| R	| real numbers set | R= {x \| -∞ < x <∞} | 6.343434 ∈ R

### General

Sets are imutable (not changing) and use hashing in programming

### Subset examples

A = {1, 2, 3,4, 5, 6} B = {2, 4, 5} C = {1, 2, 3, 4 5}
A ⊆ B = False
A ⊆ C = False
B ⊆ A = True
Ø ⊆ A = True
Ø ⊆ Ø = True

### Sets as elements
A = {} B = {A, {A}}

A ⊆ B = False
{A} ⊆ B = True
{{A}} ⊆ B = True
A ∈ B = True
{A} ∈ B = True
{{A}} ∈ B = False

A = {1, {2, 3}, 4}
{2, 3} ∈ A = True
{2, 3} ⊆ A = False
{4} ∈ A = False
4 ∈ A = True

### Cardinality and power set
A = {1, 2, 3}
|A| = 3
P(A) = {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}
|P(A)| = 8

### Addition Principle

#### Theorem 2
|A ∪ B| = |A| + |B| - |A ∩ B|

A = {a, b, c, d, e}, B = {c, e, f, h, k, m}
A ∩ C = {c, e}
5 + 6 - 2 = 9
|A ∪ B| = 9

A = {x | x is a systems programmer}, |A| = 25
B = {x | x is a application programmer}, |B| = 40
|A ∩ C| = 10

|A ∪ B| = 25 + 40 - 10 = 55

#### Theorem 3
|A ∪ B ∪ C| = |A| + |B| + |C| - |A ∩ B| - |B ∩ C| - |A ∩ C| + |A ∩ B ∩ C|



