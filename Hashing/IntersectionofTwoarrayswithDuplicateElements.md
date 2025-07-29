# Intersection of Two Arrays (With Duplicate Elements)

**Difficulty:** Easy  
**Accuracy:** 61.4%  
**Submissions:** 35K+  
**Points:** 2  
**Average Time:** 20m

---

## Problem Statement

Given two integer arrays `a[]` and `b[]`, find the **intersection** of the two arrays.

The **intersection** is defined as the elements that are **common to both arrays**, with **no duplicates** in the result. The result can be in **any order**.

> **Note:** The driver code will automatically sort the result in increasing order before printing.

---

## Examples

### Example 1
**Input:**  
`a[] = [1, 2, 1, 3, 1]`  
`b[] = [3, 1, 3, 4, 1]`  

**Output:**  
`[1, 3]`  

**Explanation:**  
1 and 3 are the only common elements. We include only one occurrence of each.

---

### Example 2
**Input:**  
`a[] = [1, 1, 1]`  
`b[] = [1, 1, 1, 1, 1]`  

**Output:**  
`[1]`  

**Explanation:**  
1 is the only element common in both arrays.

---

### Example 3
**Input:**  
`a[] = [1, 2, 3]`  
`b[] = [4, 5, 6]`  

**Output:**  
`[]`  

**Explanation:**  
There are no common elements.

---

## Constraints

- `1 ≤ a.size(), b.size() ≤ 10^5`  
- `0 ≤ a[i], b[i] ≤ 10^5`

---

## Expected Complexities

- **Time Complexity:** `O(n + m)`  
- **Auxiliary Space:** `O(n)`
