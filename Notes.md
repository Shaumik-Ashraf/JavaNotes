#JavaNotes

##12/21/15
Suppose: [7,1,5,12,3]
  [7,1,5,3,12]
  [7,1,3,5,12]
  [7,1,3,5,12]
  [1,7,3,5,16]

This is one pass of bubble sort algorithm

Lighter values "bubble" up to top

###Notes on bubble sort
- n+1 passes sorts n elements
- ...

##12/23/15

######Aim: Reflect, look ahead
######DN: Review

"Let's all concede that BogoSort is the best. Stop kidding yourself."

##1/4/16

######Aim: "Sit in where you fit"
######DN: The cards have been dealt; how do shuffle your hand?

Suppose: [7,3,5,12,8]
After pass 1: [3,7,5,12,8]
After pass 2: [3,5,7,12,8]
After pass 3: [3,5,7,12,8]
After pass 4: [3,5,7,8,12]

This is known as insertion sort
- Think of dataset as 2 parts, sorted & unsorted
- At outset, sorted region contains 1 sorted item
- With each pass, "walk" an item from unsorted region to proper index in sorted region
- Repeat until no items are unsorted
- after n passes, sorted region contains n+1 elements

##1/5/16

######Aim: Enter the matrix
######DN: Trace selection and insertion sort

[3,2,5,0,1]

... (Check Notebook)

Matrices:

	Java class Matrix represents a square matrix (n rows x n columns)
		Accessors
			int size() -> dimensions
			int get(int r, int c) -> Matrix[r][c]
			...
		Overwrite
			String toString()

##1/6/16

######Aim: How do you flip a matrix
######DN: Which is simpler, swapping rows or columns?

"MTA works on the way to school?
	Glitch in The Matrix"

##2/24/16

######Aim: 
######DN: NQueens Problem

Traveling Salesman Problem (TSP)

State space - set of values which a process can take
 - state space is implicit, often too large to handle in entirety
 - 2 stats are connected if an operation can transform one into the other

