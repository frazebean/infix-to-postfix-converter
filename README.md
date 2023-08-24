# Infix to postfix converter and evaluator

## What is infix?

Infix is the standard way we (as humans) write mathematical expressions. Here is an example:

_(5 + 4) * 3 / 2_

The answer to the expression above would be **13**. We would evaluate the expression using BODMAS/PEMDAS, which
most of us have learnt in primary school.

## What is postfix?

However, computers are not as smart as humans. It is much faster and easier for a computer to deal with a notation different from infix. This is what postfix is for. The expression mentioned earlier in postfix would be:

_54+3*2/_

Weird, I know. But it is a great notation for postfix.

## What is my program for?

My program converts from infix to postfix notation, then also evaluates the postfix notation to give an actual result. I wrote this program for a small university assignment, but decided to upload it to GitHub since I really like how this program works. The program utilises stacks and queues, which is a concept I am learning (thus demonstrating
in my program).

## How do I actually run the program?

This is a terminal program. Firstly, you need to compile the programs. Use: "javac <filename>" on all the files in this repository. Once that is done, type:

**java EquationSolver**

in the terminal. Simply enter your mathematical expression and the magic happens behind the scenes.

NOTE: The mathematical expressions only work if you put a space after every single character being entered. For example, if you want to evaluate the expression:

_(54+3)*2_

You must type:

_( 54 + 3 ) * 2_

**Note how there are spaces between every character.**

This is because the string being entered is parsed for every space character. Not a very elegant solution, but this is
what was recommended by my assignment sheet and I do this all for grades :D
