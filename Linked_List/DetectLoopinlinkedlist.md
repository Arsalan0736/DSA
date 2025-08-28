# Detect Loop in Linked List

## Problem Statement
You are given the head of a singly linked list. You need to determine whether the given linked list contains a loop or not.  
A loop exists in a linked list if the `next` pointer of the last node points to any other node in the list (including itself), rather than being `null`.

### Note
Internally, **pos (1-based index)** is used to denote the position of the node that the tail's next pointer is connected to.  
If `pos = 0`, it means the last node points to `null`. Note that `pos` is not passed as a parameter.

---

**Example**
Input: pos = 2
Output: true
Explanation: There exists a loop as last node is connected back to the second node.