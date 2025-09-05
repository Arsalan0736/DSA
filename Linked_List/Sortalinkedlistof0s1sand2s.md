# Sort a Linked List of 0s, 1s, and 2s

## Problem Description
Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. The task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.

## Examples

**Input:**  
head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2  
**Output:**  
0 → 1 → 1 → 2 → 2 → 2 → 2 → 2  

---

**Input:**  
head = 2 → 2 → 0 → 1  
**Output:**  
0 → 1 → 2 → 2  

---

## Constraints
- 1 ≤ number of nodes ≤ 10^6  
- 0 ≤ node->data ≤ 2  

## Expected Complexities
- Time Complexity: **O(n)**  
- Auxiliary Space: **O(1)**
