# Remove Loop in Linked List

**Difficulty:** Medium  
**Accuracy:** 27.66%  
**Submissions:** 531K+  
**Points:** 4  
**Average Time:** 45m  

---

## Problem Statement
Given the head of a singly linked list, the task is to remove a cycle if present.  
A cycle exists when a node's `next` pointer points back to a previous node, forming a loop.  

Internally, a variable `pos` denotes the index of the node where the cycle starts, but it is **not passed as a parameter**.  

The terminal will print **true** if a cycle is removed, otherwise, it will print **false**.

---

## Examples

### Example 1
**Input:**  
head = 1 -> 3 -> 4, pos = 2  

**Output:**  
true  

**Explanation:**  
The linked list looks like:  
1 -> 3 -> 4  
     ^    |  
     |____|  
A loop is present in the list, and it is removed.

---

### Example 2
**Input:**  
head = 1 -> 8 -> 3 -> 4, pos = 0  

**Output:**  
true  

**Explanation:**  
The linked list does not contain any loop.

---

### Example 3
**Input:**  
head = 1 -> 2 -> 3 -> 4, pos = 1  

**Output:**  
true  

**Explanation:**  
The linked list looks like:  
1 -> 2 -> 3 -> 4  
     ^         |  
     |_________|  
A loop is present in the list, and it is removed.

---

## Constraints
- 1 ≤ size of linked list ≤ 10^5  

---

## Expected Complexities
- Time Complexity: O(n)  
- Auxiliary Space: O(1)
