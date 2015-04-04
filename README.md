# Addition-Chains-Java
An "addition chain" is a sequence of numbers that starts with 1 and where each number is the sum of two previous numbers (or the same number taken twice), and that ends at some predetermined value.

An example will make this clearer: the sequence [1, 2, 3, 5, 10, 11, 21, 42, 84] is an addition chain for the number 84. This is because it starts with 1 and ends with 84, and each number is the sum of two previous numbers.

###### Demonstration

= 1             (chain starts as [1])
                
1 + 1   = 2     (chain is now [1, 2]) 

1 + 2   = 3     (chain is now [1, 2, 3]) 

2 + 3   = 5     (chain is now [1, 2, 3, 5]) 

5 + 5   = 10    (chain is now [1, 2, 3, 5, 10]) 

1 + 10  = 11    (chain is now [1, 2, 3, 5, 10, 11]) 

10 + 11 = 21    (chain is now [1, 2, 3, 5, 10, 11, 21]) 

21 + 21 = 42    (chain is now [1, 2, 3, 5, 10, 11, 21, 42]) 

42 + 42 = 84    (chain is now [1, 2, 3, 5, 10, 11, 21, 42, 84]) 


We say that this chain is of length 8, because it took 8 additions to generate it (this is one less than the total amount of numbers in the chain).

There are a several different addition chains of length 8 for the number 84 (another one is [1, 2, 4, 8, 16, 32, 64, 68, 84], for instance), but there are no shorter ones. This is as short as we can get.

Your task today is to try and generate addition chains of a given length and last number.

###### Input description

You will be given one line with two numbers on it. The first number will be the length of the addition chain you are to generate, and the second the final number.

###### Output description

Note that going by the strict definition of addition chains, they don't necessarily have to be strictly increasing. However, any addition chain that is not strictly increasing can be reordered into one that is, so you can safely assume that all addition chains are increasing. In fact, making this assumption is probably a very good idea!


#### Examples

###### Input 1

7 43

###### Output 1

(one of several possible outputs)

1

2

3

5

10

20

40

43

###### Input 2

9 95

###### Output 2

(one of several possible outputs)

1

2

3

5

7

14

19

38

57

95

## Stuff to do

Need to optimize the algorithm, just using simple brute force. Takes long time on lenght > 25 chains.

Need to check bad input.
