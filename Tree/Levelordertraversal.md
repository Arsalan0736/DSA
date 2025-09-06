# Level Order Traversal

## Problem Description
Given a root of a binary tree with `n` nodes, the task is to find its level order traversal. Level order traversal of a tree is breadth-first traversal for the tree.

## Examples

### Example 1
**Input:**  
root[] = [1, 2, 3]  

**Output:**  
[[1], [2, 3]]  

**Explanation:**  
We start with the root node 1, so the first level of the traversal is [1]. Then we move to its children 2 and 3, which form the next level, giving the final output [[1], [2, 3]].

---

### Example 2
**Input:**  
root[] = [10, 20, 30, 40, 50]  

**Output:**  
[[10], [20, 30], [40, 50]]  

**Explanation:**  
We begin with the root node 10, which forms the first level as [10]. Its children 20 and 30 make up the second level, and their children 40 and 50 form the third level, resulting in [[10], [20, 30], [40, 50]].

---

### Example 3
**Input:**  
root[] = [1, 3, 2, N, N, N, 4, 6, 5]  

**Output:**  
[[1], [3, 2], [4], [6, 5]]  

**Explanation:**  
The traversal starts with root node 1, giving the first level [1]. At the second level, we visit its children 3 and 2 from left to right as given, then move to the third level with node 4, and finally reach the fourth level with its children 6 and 5, resulting in [[1], [3, 2], [4], [6, 5]].

---

## Constraints
- 1 ≤ number of nodes ≤ 10^5  
- 0 ≤ node->data ≤ 10^9  

## Expected Complexities
- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(n)  
