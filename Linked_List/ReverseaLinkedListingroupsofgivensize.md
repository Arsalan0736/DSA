# Linked List Group Reverse

## Problem Statement
Given the head of a linked list, the task is to reverse every **k** nodes in the linked list.  
If the number of nodes is not a multiple of `k`, then the left-out nodes at the end should also be considered as a group and must be reversed.

---

### Example 
**Input:**  
head = 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8
k = 4

**Output:**  
4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5

**Explanation:**  
The first 4 nodes `(1, 2, 2, 4)` are reversed → `4 2 2 1`.  
The next 4 nodes `(5, 6, 7, 8)` are reversed → `8 7 6 5`.  
Final result:  
4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5