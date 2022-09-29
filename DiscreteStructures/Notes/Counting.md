# CH 3, Counting

## 3.1 Permutations

Ex: A label identifier for a omputer system consists of one letter followed by  three digits. If repetitions are allowed, how many distince identifiers are possible?
26 * 10 * 10 * 10 = 26000 possible distince identifiers

Ex: Let A be a set with n elements. How many subsets does A have?
2^n subsets.

Ex: How many three letter words can be formed from letters in the set {z, b, y, z}
If repeated letters are allowed: 4 * 4 * 4 = 64
If repeated letters are not allowed: 4 * 3 * 2 = 24

Ex: Let A be a set with n elements. How many different sequences of length r can be formed using elements of A?
Elements can be repeated: n^r
Elements can not be repeated:

If 1 <= r <= n then <sub>n</sub>P<sub>r</sub>, the number of permutations of n objects taken r at a time is n(n-1)(n-2)...(n-r+1)

When r = n<sub>1</sub>, <sub>n</sub>P<sub>r</sub> = <sub>n</sub>P<sub>n</sub> is simple a permutation.
n(n-1)(n-2)...(n-r+1) = n(n-1)(n-2)...2 * 1 is n factorial n!.

0! = 1, then for all n >= 0 and 0 <= r <= n,
<sub>n</sub>P<sub>r</sub> = (n(n-1)...(n-r+1)(n-r)(n-r-1)) / (n-r(n-r-1)...2 * 1) = n! / (n - r)!

How many unique permutations of the letters in the word FOO are there?

3! / (2! * 1!) = 6 / 2 = 3

How many unique permutations of the letters in the word BANANA are there?

6! / (3! * 2! * 1!) = 720 / 12 =

How many unique permutations of the letters in the word MISSISSIPPI

11! / (1! * 4! * 4! * 2!) = 11! / (4! * 4! * 2!)

## 3.2 Combinations

Let A = {1, 2, 3, 4}
How many subsets of 2 elements are possible?

<sub>4</sub>C<sub>2</sub> : 4 choose 2 : 6

How many subsets of 3 elements are possible?

<sub>4</sub>C<sub>3</sub> : 4 choose 3 : 4

Let A is a set with |A| = n and 0 <= r <= n.
An r-element subset of A is called combination of A, taken r at a time.
The number of combinations A, is the number of ways to choose r from n elements written <sub>n</sub>C<sub>r</sub>.

<sub>n</sub>C<sub>r</sub> = <sub>n</sub>P<sub>r</sub> / r! = n! / ((n - r)! * r!)

Show that <sub>n</sub>C<sub>r</sub> = <sub>n</sub>C<sub>n - r</sub>

n! / ((n - r)! * r!) = n! / (n - (n - r))! * (n - r)!

Ex: How many ways can a committee of three faculty members and two students be selected from seven faculty and eight students.

<sub>7</sub>C<sub>3</sub>

7! = ((7 - 3)! * 3!) = 7 * 5 * 4 / 6

Ex: Five fair coins are tossed and the results are recorded.

How many difference sequences of heads and tails are possible?

32

How many of the sequences in part a have exactly one head recorded?

<sub>5</sub>C<sub>1</sub>

5! / ((5 - 1)! * 1!) = 5! / 4! = 5

How many of the sequences in part a have exactly three heads recorded?

<sub>5</sub>C<sub>3</sub>

5! / ((5 - 3)! * 3!) = 5! / (2 * 3!) = (5 * 4) / 2 = 10

How many triangles are there in figure?

<sub>4</sub>C<sub>2<sub>

Ex. Name 5 celebs you like. If you can have three dates with one of them.

How many ways are possible?
<sub>5</sub>P<sub>3</sub> = 5! / (5 - 3)! = 60

If repetition is allowed?
<sub>7</sub>C<sub>3</sub> = 7! / ((7 - 3)! * 3!) = 7! / (4! * 3!) = (7 * 6 * 5) / 6 = 210 / 6

## 3.4 Pigeonhole Principle

If n pigeons are assigned to m pigeonholes, and m < n, then at least one pigeonhole contains two or more pigeons.

Show that if any five numbers from 1 to 8 are chosen, then two of them will add to 9.

<sub>8</sub>C<sub>5</sub>

Proof by existence:
{1, 8}, {2, 7}, {3, 6}, {4, 5}
There are 4 pigeon holes and 5 pigeons meaning at least one pigeonhole has two or more pigeons. Thus numbers from 1 to 8 will add to 9.

Consider a haxagon whose side lengths are 1 unit. Show that if any seven points are chosen in the region, then two of them must be not farther part then 1 unit.

There are 6 pigeonholes and 7 pigeons.

## 3.4 Elements of probability

Consider an experiment consisting of tossing a six-sided die once and recording the number showing on the top face of the die.

Outcomes: {1, 2, 3, 4, 5, 6}

Event: set of outcomes described by statement.
ex: The number on the top face of the die is 1. -> {1}
ex. The number on the top face of the dies is odd. -> {1, 3, 5}



Consider an experiment consisting of tossing a six-sided die twice and recording the sequence of numbers showing on the top face of the die after each toss.

Outcomes: {(1, 1), (1, 2), ..., (6, 6)}

Event:
The sequence of number on the top face of the die is (1, 2).
The sum of the numbers showing on the top faces is 8. {(2, 6), (3, 5), (4, 4)}

Assigning Probabilities to Events.

Let E be an event. p(E) is called the probability of event E. Likelihood that the event E will occur.

Frequentist view of probability : frequency of occurence
vs.
Bayesian view of probability : degree of belief.

Assigneing probabilities to Events.

Let A be the set of all outcomes of an experiment.

Axiom 1: 0 <= p(E) <= 1 for every event E in A
Axiom 2: p(A) = 1 and p(Ø) = 0

p(E) = |E| / |A| = total num of outcomes E / total num outcomes

Choose four cards from a standard 52-card deck. 

What is the probability that four kings will be chosen?

<sub>48</sub>C<sub>1</sub> / <sub>52</sub>C<sub>4</sub>

What about 5?

<sub>48</sub>C<sub>1</sub> / <sub>52</sub>C<sub>5</sub>

A box contains six red balls and four green balls. Four balls are selected at random from the box. 

What is the probability that two of the selected balls will be red and two will be gree?
(<sub>6</sub>C<sub>2</sub> * <sub>4</sub>C<sub>2</sub>) +  (<sub>6</sub>C<sub>1</sub> * <sub>4</sub>C<sub>3</sub>) + (<sub>6</sub>C<sub>3</sub> * <sub>4</sub>C<sub>1</sub>) / <sub>10</sub>C<sub>4</sub>

What is the probability that no more than two of the balls are red?

3 / <sub>10</sub>C<sub>4</sub>

What is the probability that no more than three of the balls are red

4 / <sub>10</sub>C<sub>4</sub>

## 3.5 Recurrence Relations

Relation is the recursive function of a sequence

1, 1, 2, 3, 5, 8, 13, 21, ....

Recursive: f(n) = f(n-1) + f(n-2), n(1) = 1
Explicit: ?

Let A = {0, 1}
What is the number of strings of length n in A* that do not containd adjacent 0's

for n = 1: "0", "1"
for n = 2: "01", "10", "11"
for n = 3: "010", "101", "110", "011", "111"
for n = 4: 8 possible
for n = 5: 13 possible

A recursive formula is a linear homogeneous relation of degree k

a<sub>n</sub> = r<sub>1</sub>a<sub>n-1</sub> + r<sub>2</sub>a<sub>n-2</sub> + ... + r<sub>k</sub>a<sub>n-k</sub>

x<sup>k</sup> = r<sub>1</sub>x<sup>k-1</sup> + r<sub>2</sub>x<sup>k-2</sup> + ... r<sub>k</sub>x<sup>0</sup>

If the equations has two distinct roots s<sub>1</sub> and s<sub>2</sub>, then a<sub>2</sub> = us<sub>1</sub><sup>n</sup> + vs<sub>2</sub><sup>n</sup>

c<sub>n</sub> = 3c<sub>n-1</sub> - 2c<sub>n-2</sub>, with c<sub>1</sub> = 5 and c<sub>2</sub> = 3

c<sub>3</sub> = 3(3) - 2(5) = -1

u + 2v = 5
u + 4v = 3

u + 2v = 5
+
-u - 4v = -3
=
-2v = 2
v = -1

u + 2(-1) = 5
u = 3


d<sub>n</sub> = 2d<sub>n-1</sub> - d<sub>n-2</sub>, d<sub>1</sub> = 1.5, d<sub>2</sub> = 3

x^2 = 2x - 1
x^2 - 2x + 1 = 0
(x - 1)^2 = 0

d<sub>n</sub> = u * 1^n + v*n*1^n

d<sub>1</sub> = u * 1^1 + v*1*1^1 = 1.5
d<sub>2</sub> = u * 1^2 + v*2*1^2

u + v = 1.5
u + 2v = 3

-v = -1.5
v = 1.5
u = 0

explicit = 0 + 1.5n