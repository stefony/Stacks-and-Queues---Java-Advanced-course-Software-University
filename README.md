# Stacks-and-Queues---Java-Advanced-course-Software-University
Courses from my education Java advanced in @SoftUni

Problems for exercises Stacks and Queues
1.	Reverse Numbers with a Stack
Write a program that reads N integers from the console and reverses them using a stack. Use the ArrayDeque<Integer> class. Just put the input numbers in the stack and pop them.
2.	Basic Stack Operations
You will be given an integer N representing the number of elements to push into the stack, an integer S representing the number of elements to pop from the stack, and finally an integer X, an element that you should check whether is present in the stack. If it is, print "true" on the console. If it’s not, print the smallest element currently present in the stack.
3.	Maximum Element
You have an empty sequence, and you will be given N commands. Each command is one of the following types:
•	"1 X" - Push the element X into the stack.
•	"2" - Delete the element present at the top of the stack.
•	"3" - Print the maximum element in the stack.
Input
•	The first line of input contains an integer N, where 1 ≤ N ≤ 105.
•	The next N lines contain commands. All commands will be valid and in the format described.
•	The element X will be in the range 1 ≤ X ≤ 109.
•	The type of the command will be in the range 1 ≤ Type ≤ 3.
4.	Basic Queue Operations
You will be given an integer N representing the number of elements to enqueue (add), an integer S representing the number of elements to dequeue (remove/poll) from the queue, and finally an integer X, an element that you should check whether is present in the queue. If it is - prints true on the console, if it is not - print the smallest element currently present in the queue.
5.	Balanced Parentheses
Given a sequence consisting of parentheses, determine whether the expression is balanced. A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with a closing parenthesis that occurs after the former. Also, the interval between them must be balanced.
You will be given three types of parentheses: (, {, and [.
{[()]} - This is a balanced parenthesis.
6.	Recursive Fibonacci
Write program with java.Each member of the Fibonacci sequence is calculated from the sum of the two previous members. The first two elements are 1, 1. Therefore, the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34… 
The following sequence can be generated with an array, but that’s easy, so your task is to implement it recursively.
If the function getFibonacci(n) returns the nth Fibonacci number, we can express it using getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).
However, this will never end and in a few seconds, a Stack Overflow Exception is thrown. For the recursion to stop, it has to have a "bottom". The bottom of the recursion is getFibonacci(1), and should return 1. The same goes for getFibonacci(0).
Input
•	On the only line in the input, the user should enter the wanted Fibonacci number N where 1 ≤ N ≤ 49.
Output
•	The output should be the nth Fibonacci number counting from 0.

Input
•	Each input consists of a single line, the sequence of parentheses.
•	1 ≤ Length of sequence ≤ 1000.
•	Each character of the sequence will be one of the following: {, }, (, ), [, ].
7.	Simple Text Editor
You are given an empty text. Your task is to implement 4 types of commands related to manipulating the text:
•	"1 {string}" - appends [string] to the end of the text.
•	"2 {count}" - erases the last [count] elements from the text.
•	"3 {index}" - returns the element at position [index] from the text.
•	"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
Input
•	The first line contains N, the number of operations, where 1 ≤ N ≤ 105.
•	Each of the following N lines contains the name of the operation, followed by the command argument, if any, separated by space in the following format "command argument". 
•	The length of the text will not exceed 1000000.
•	All input characters are English letters.
8.	Infix to Postfix
WRITE PROGRRAM WITH JAVA.Mathematical expressions are written in an infix notations, for example "5 / ( 3 + 2 )". However, this kind of notation is not efficient for computer processing, as you first need to evaluate the expression inside the brackets, so there is a lot of back and forth movement. A more suitable approach is to convert it into the so-called postfix notations (also called Reverse Polish Notation), in which the expression is evaluated from left to right, for example, "3 2 + 5 /".
Implement an algorithm that converts the mathematical expression from infix notation into a postfix notation. Use the famous Shunting-yard algorithm.
Input
•	You will receive an expression on a single line, consisting of tokens.
•	Tokens could be numbers 0-9, variables a-z, operators +, -, *, / and brackets ( or ).
•	Each token is separated by exactly one space.


