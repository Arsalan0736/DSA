# Count Pairs with Given Sum

**Difficulty:** Easy  
**Accuracy:** 50.11%  
**Submissions:** 51K+  
**Points:** 2  
**Average Time:** 15m

---

## Problem Statement

Given an array `arr[]` and an integer `target`, you have to **find the number of pairs** in the array `arr[]` that sum up to the given `target`.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 5, 7, -1, 5]`  
`target = 6`  

**Output:**  
`3`  

**Explanation:**  
Pairs with sum `6` are `(1, 5)`, `(7, -1)`, and `(1, 5)`.

---

### Example 2
**Input:**  
`arr[] = [1, 1, 1, 1]`  
`target = 2`  

**Output:**  
`6`  

**Explanation:**  
All pairs are `(1, 1)` in multiple combinations, total of 6 such pairs.

---

### Example 3
**Input:**  
`arr[] = [10, 12, 10, 15, -1]`  
`target = 125`  

**Output:**  
`0`  

**Explanation:**  
No pairs found with the sum `125`.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^5`  
- `-10^4 ≤ arr[i] ≤ 10^4`  
- `1 ≤ target ≤ 10^4`

---

## Expected Complexities

- **Time Complexity:** `O(n)`  
- **Auxiliary Space:** `O(n)`
