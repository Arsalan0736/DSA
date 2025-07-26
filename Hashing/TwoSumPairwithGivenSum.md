# Two Sum - Pair with Given Sum

**Difficulty:** Easy  
**Accuracy:** 30.61%  
**Submissions:** 396K+  
**Points:** 2  
**Average Time:** 20m  

---

## Problem Statement

Given an array `arr[]` of integers and another integer `target`, determine if there exist **two distinct indices** such that the **sum of their elements is equal to the target**.

---

## Examples

### Example 1
**Input:**  
`arr[] = [0, -1, 2, -3, 1]`  
`target = -2`  

**Output:**  
`true`  

**Explanation:**  
`arr[3] + arr[4] = -3 + 1 = -2`

---

### Example 2
**Input:**  
`arr[] = [1, -2, 1, 0, 5]`  
`target = 0`  

**Output:**  
`false`  

**Explanation:**  
None of the pair makes a sum of 0

---

### Example 3
**Input:**  
`arr[] = [11]`  
`target = 11`  

**Output:**  
`false`  

**Explanation:**  
No pair is possible as only one element is present in `arr[]`.

---

## Constraints

- `1 ≤ arr.size ≤ 10^5`  
- `-10^5 ≤ arr[i] ≤ 10^5`  
- `-2 × 10^5 ≤ target ≤ 2 × 10^5`

---

## Expected Complexities

- **Time Complexity:** `O(n)`  
- **Auxiliary Space:** `O(n)`
