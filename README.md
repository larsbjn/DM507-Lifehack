# Lifehacks for the DM507 exam

# MinHeap & MaxHeap
Can be used to add integers to a heap. Print the heap with children, or just plain the array.
Can extract and insert, just use the functions in the main method.

# Master theorem solver
Lighter offline version of this: https://www.nayuki.io/page/master-theorem-solver-javascript
Make sure to have Node installed: https://nodejs.org/en/download/

Instructions:

![alt text](https://raw.githubusercontent.com/larsbjn/DM507-Lifehack/master/mt-solver.png)

```node mt-solver.js a b k i```

The above example looks like this through the console: ```node mt-solver.js 4 2 2 0```

# Strongly Connected Components
Hardcoded with graph from this example:
![alt text](https://raw.githubusercontent.com/larsbjn/DM507-Lifehack/master/scc.png)

Note that edges are 1-indexed in the example while the code is written for 0-indexed

# Red Black Tree
Type 1 for inserting number, just hit enter after each number inputted. When done, type -999 and hit enter, the program will then show each key with it's parent. Just start from the beginning and draw each key on a paper with it's parent. Parent -1 means that the key is the root of the tree.
