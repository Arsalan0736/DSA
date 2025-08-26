# Add Number Linked Lists

### Difficulty
**Medium**

### Accuracy
34.52%

### Submissions
354K+

### Points
4

### Average Time
30 minutes

---

## Problem Statement

You are given the heads of two singly linked lists `head1` and `head2`, where each list represents a non-negative integer. The task is to return the head of the linked list representing the **sum of these two numbers**.

Each node of the linked list contains a single digit, and the digits are stored in the same order as they appear in the number. 

**Note:**  
- There can be leading zeros in the input lists.  
- The output list should **not contain any leading zeros**.

---

## Examples

### Example 1
**Input:**  
head1 = 4 -> 5  
head2 = 3 -> 4 -> 5  

**Output:**  
3 -> 9 -> 0  

**Explanation:**  
The given numbers are `45` and `345`.  
Their sum is `390`.  
Hence, the output linked list is `3 -> 9 -> 0`.

---

### Example 2
**Input:**  
head1 = 0 -> 0 -> 6 -> 3  
head2 = 0 -> 7  

**Output:**  
7 -> 0  

**Explanation:**  
The given numbers are `63` and `7`.  
Their sum is `70`.  
Hence, the output linked list is `7 -> 0`.

---

## Constraints
- `1 ≤ list1.size, list2.size ≤ 5 * 10^5`  
- `0 ≤ node->data ≤ 9`

---

## Expected Complexities
- **Time Complexity:** `O(n + m)`  
- **Auxiliary Space:** `O(1)`

---
