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

Ex: Five fair counds are tossed and the results are recorded.

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