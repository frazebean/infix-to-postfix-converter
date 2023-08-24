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
