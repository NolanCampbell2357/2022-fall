# Why logic

logic is the discipline that deals with methods of reasoning
1. Rules
2. Theorems
3. Verify CS
4. Conclusion from science experiments

Statement or proposition is a declarative sentence that is either true or false;

a. The earth is round. A statement
b. 2 + 3 = 5. A statement
c. Do you speak English? Not a statement
d. 3 - x = 5. Not a statement, needs x defined
e. take two aspirens. Not a statement

The letters x, y, z, ... denote variables that can be replaced by numbers

In logic, the letters p, q, r, ... denote propositional variables that can be replaced by statements and combined by logic operations.
p: 2 < 3, q: it is cold, r: -3 is a positive integer

Negation of p, "not p", denoted by ~p.

Conjunction: "p and q", denoted by p ∧ q
Disjunction: "p or q", denoted by P ∨ q

p ∧ q  ∨ ~q
T T    T  F
T F    T  T
F F    F  F
F F    T  T

p q r   p ∧ r   q ∧ (p ∧ r)     p ∨ (q ∧ (p ∧ r))

T T T   T       T               T
T T F   F       F               T
T F T   T       F               T
T F F   T       T               T
F T T   F       F               F
F T F   F       F               F
F F T   F       F               F
F F F   F       F               F

Example:

Make truth table for ~(p ∧ q) ∧ r

p q r   p ∧ q   ~(p ∧ q)    ~(p ∧ q) ∧ r

T T T   T       F           F
T T F   T       F           F
T F T   F       T           T
T F F   F       T           F
F T T   F       T           T
F T F   F       T           F
F F T   F       T           T
F F F   F       T           F

{x | P(x)} : set of x such that P(x) is true is called a predicate/ propositional function. Each x is true or false.
Ex. Let a - {x | x is an integer less than 8}
    Here P(x) is "x is an integer less than 8"

Universal quantification: ∀ x P(x) meaning "For all values of x, P(x) is true."
Ex: ∀x ∈ R, x<sup>2</sup> >= 0

Existential quantification: ∃x P(x) meaning "There exists a value of x, P(x) is true"
Ex: ∃x ∈ Z, x = -x

Quantification of a predicate

Exercise. Suppose P(x): x is even; Q(x): x is a prime number; R(x, y); x + y is even; x and y are integers.

Write an english sentence for
1. ∀x P(x). For all integer values of x, x is even. False.
2. ∃x Q(x). There exists a value of x such that x is prime. True.
3. ∀x ∃y R(x, y). For all x, there exists a y that x + y is even. True.
4. ∃x ∀y R(x, y). There exists an x for all y that x + y is even. True.
5. ~(∃x P(x)). It is not the case that there is an x that is even. False.
6. ~(∀x Q(x)). It is not the case that all x is prime. True.

# Conditionals

impllication, "if p then q" denoted p ⇒ q
p is a sufficient condition for q

ex: p: it is snowing. q 8 < 5
p ⇒ q: If it is snowing then 8 < 5

p q     p ⇒ q
T T     T
T F     F
F T     T
F F     T

converse of p ⇒ q is q ⇒ p, Not equivalent
Contrapositive of p ⇒ q is ~q ⇒ ~p. equivalent
ex. If you are brad pitt, I am tom cruise

p q     p ⇒ q  q ⇒ p   ~q ⇒ ~p
TT      T       T       T                
TF      F       T       F
FT      T       F       T
FF      T       T       T

Biconditional statement or equivalence, "p if and only if q", denoted p ⇔ q
ex. x^2 < 4 if and only if -2 < x < 2

p q     p ⇔ q   p ⇒ q      ~q ⇒ ~p    (p ⇒ q) ⇔ (~q ⇒ ~p)
TT      T       T           T           T       
TF      F       F           F           T
FT      F       T           T           T
FF      T       T           T           T

Tautology: statement that is true for all possible values of its propositional variables
ex: (p v ~p), (p ∧ q) ⇒ p

p q     (p ∧ q) ⇒ p
T T     T
T F     T
F T     T
F F     T

Contradiction or absurdity: statement that is false for all possible values of its propositional variables

Contingency: statement that is either true or false depending on the value of its propositional variables

Theorem 3
a. ~(∀x P(x)) = ∃x ~P(x)
b. ~(∃x ~P(x)) = ∀x P(x)

If you invest in the stock market, then you will get rich.
If you get rich, then you will be happy.
If you invest in the stock market, then you will be happy.

Is this valid? Yes.

p ⇒ q : hypothesis
p ⇒ r : hypothesis
p ⇒ r : conclusion

(p ⇒ q) ∧ (q ⇒ r)⇒(p⇒r) is a tautology, It is true no matter what p, q, r is.

# 2.3 Methods of Proof

If you invest in the stock market, then you will get rich.
If you get rich, then you will be happy.
If you invest in the stock market, then you will be happy.

Is the argument valid? Yes. It is a good rule of interference.
Is the conclusion true? Depends. If all hypotheses are true, then it is true.

If smoking is healthy, then cigarettes are prescribed by physicians.
Smoking is healthy

p: smoking is healthy, q: cigarettes are prescribed by physicians
p ⇒ q : hypothesis
p      : hypothesis
q      : conclusion

(p ⇒ q) ∧ (p) ⇒ (q) is a tautology. It is true no matter what p or q is. 
Rule of interference is called modues ponens.

If taxes are lowered, then income rises
income rises
taxes are lowered

p ⇒ q : hypothesis
q      : hypothesis
p      : conclusion

(p ⇒ q) ∧ (q) ⇒ (p) is not a tautology.

Prove or disprove the staement that if z and y are real numbers

(x^2 = y^2) ⇔ (x = y)

counterexample: x = 3, y = -3

(x^2 = y^2) ⇒ (x = y)


(x = y) ⇒ (x^2 = y^2)

Prove that the sum of two odd numbers is even

Suppose that n is an integer and k is an integer such that n = 2k.
By the definition of even, an integer divisible by 2 is even. n is divisible by two.

Prove or disprove: The sum of five consecutive integers is divisible by 5.

Suppose that m is an integer, and n is the sum of 5 consecutive integers such that 
n = m + m+1 + m+2 + m+3 + m+4. Can be simplified as n = 5(m + 2). n is an integer divisible by five thus the sum of five consecutive numbers is divisible by 5.

# 2.4 Mathmatical Induction

Show that For all n >= 1.
  P(n) = 1 + 2 + 3 + ... + n = (n(n+1))/2
P = predicate

Assume P(n) is true for n = k, then p(k) is true. 

Show P(K + 1) is true

((k(k + 1)) / 2) + (((k+1)*2) / 2) = (k(k+1) + 2(k+1))/2 = (2(k + 1)) / 2

∀n >= n<sub>0</sub>, P(n) by mathmatical induction takes two steps

Basis step: Show P(n<sub>0</sub>) is true
Induction step: Show P(k) ⇒ P(k + 1)

Show that for all n >= 1, 1^2 + 2^2 + ... + n^2 = ((n(n + 1)(2n + 1)) / 6)

Basis step:

n = 1
1 = 1

Induction step:

Assume P(k) true, Show P(k+1) is true
(k(k + 1)(2k + 1)) / 6 + ((k+1)^2 * 6) / 6 = (k(k + 1)(2k + 1) + 6(k + 1)^2) / 6

(k + 1){(k(2k+1) + 6(k + 1))} / 6 = {2k^2 + k + 6k + 6} = {2k^2 + 7k + 6} = {2k(k + 2) + 3(k + 2)}
= (k+2)(2k + 3)

Show that for all n >= 1, n! >= 2^n-1

Basis step
n = 1
1! = 1
2^1-1 = 1

Induction step:

Assume P(k) true, show P(k+1) is true

(k+1) * k! >= k+1 * 2^(k-1) >= 2 * 2^k-1 = 2^k
