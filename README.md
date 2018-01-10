# boozallenhackerrankchallenge
booz allen hacker rank challenge

quesion # 1Complete the mergeStrings function in your editor. It has 2 parameters:

1. A string, a .

2. A string, b.

Your function must merge strings a and b, and then return a single merged string. Amerge operation on two strings is 
described as follows:

Append altenating characters from a and b, respectively, to some new string, mergedString.

Once all of the characters in one of the strings have been merged, append the remaining characters in the other string to mergedString.

Input Format

The locked stub code in your editor reads two strings,a and b, from stdin and passes them to your function.

Constraints 1 ≤ |a|, |b| ≤ 25000

Output Format Your function must return the merged string. This will be printed to stdout by the locked stub code 
in your editor.


question # 2

Each node of a Binary Search Tree (BST) has an integer value and pointers to two children, referred to as left
child and right child. The value of left child is always less than the value of its parent node, and the value of
right child is always greater than or equal to the value of its parent node.

The isPresent function in your editor has two parameters: a reference to theroot node of a Binary Search Tree 
(BST) and an integer value. Complete isPresent so it returns 1 if the value is present in the BST, and returns 
0 otherwise.

Constraints 1 ≤ total nodes ≤ 10 5

4 1 ≤ total nodes ≤ 10

1 ≤ value ≤ 5 × 10 4


question # 3
Julia has a string, s, composed of the letters a , b, c, and d. String s is said to be balanced if both of the following conditions are satisfied:


The summed number of a 's and c's is even. The summed number of b's and d's is even.

Complete the code in the editor below by filling in the blank (i.e., _________ ) with a RegEx that only matches 
balanced strings. Input Format

This is a RegEx-only challenge. Locked stub code in the editor reads strings from stdin and determines if the 
written RegEx matches it.

Output Format You are not responsible for generating any output. The boolean result of the match is printed to 
stdout by locked stub code in the
editor.

question # 4
Julia has a string, s, composed of the letters a , b, c, and d. String s is said to be balanced if both of the 
following conditions are satisfied:



The summed number of a 's and c's is even. The summed number of b's and d's is even.

Complete the code in the editor below by filling in the blank (i.e., _________ ) with a RegEx that only matches 
balanced strings. Input Format

This is a RegEx-only challenge. Locked stub code in the editor reads strings from stdin and determines if the 
written RegEx matches it.

Output Format You are not responsible for generating any output. The boolean result of the match is printed to 
stdout by locked stub code in the editor.

question # 5
The maximum difference between elements in some array, a , is defined as the largest difference between any a[i] and 
a[j] where i < j and a[i] < a[j]. For example, if a = [4, 1, 2, 3], the maximum difference would be 
a[3] − a[1] = 3 − 1 = 2 because this is the largest difference between any two elements satisfying the 
aforementioned criteria.

Complete the maxDifference function in the editor below. It has 1 parameter: an array of integers, a . It must 
return an integer denoting the maximum difference between any pair of elements in a ; if no such number exists 
(e.g., if a is in descending order and all a[j] < a[i]), return −1 instead.

Input Format Locked stub code in the editor reads the following input from stdin and passes it to the function:

The first line contains a single integer, n, denoting the number of elements in array a . Each line i of the n 
subsequent lines (where 0 ≤ i < n) contains a single integer describing element a[i].

Constraints 1 ≤ n ≤ 2 × 10 5 −10 6 ≤ a[i] ≤ 10 6 ∀ i ∈ [0, n − 1]

Output Format

The function must return an integer denoting the maximum difference ina . This is printed to The function must 
return an integer denoting the maximum difference ina . This is printed to stdout by locked stub code in the editor.

question # 6

string similarity
For two strings A and B, we define the similarity of the strings to be the length of thelongest prefix common 
to both strings.

For example, the similarity of strings abc and abd is 2, while the similarity of strings aaa and aaab is 3.

Calculate the sum of similarities of a string S with each of its suffixes, including the string itself as the first
suffix.

Input Format

The first line contains the number of test cases T . Next subsequent T lines contains a string representing the 
value of string S for each test case.

Constraints 1 ≤ T ≤ 10 1 ≤ |s| ≤ 10 5 The strings contain only lowercase characters [a-z].

Output Format

Output T lines, each containing one integer that is the answer for the corresponding test case.
