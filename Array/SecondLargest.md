# Second Largest Element in Array

**Difficulty:** Easy  
**Accuracy:** 26.72%  
**Submissions:** 1.3M+  
**Points:** 2  
**Average Time:** 15m

---

## Problem Statement

Given an array of positive integers `arr[]`, return the **second largest element** from the array.  
If the second largest element doesn't exist, return `-1`.

> **Note:** The second largest element should **not be equal** to the largest element.

---

## Examples

### Example 1
**Input:**  
`arr[] = [12, 35, 1, 10, 34, 1]`  
**Output:**  
`34`  
**Explanation:**  
The largest element is `35` and the second largest is `34`.

---

### Example 2
**Input:**  
`arr[] = [10, 5, 10]`  
**Output:**  
`5`  
**Explanation:**  
The largest element is `10` and the second largest is `5`.

---

### Example 3
**Input:**  
`arr[] = [10, 10, 10]`  
**Output:**  
`-1`  
**Explanation:**  
All elements are the same. No second largest element exists.

---

## Constraints

- `2 ≤ arr.size() ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^5`

---

## Expected Complexities

- **Time Complexity:** `O(n)`  
- **Auxiliary Space:** `O(1)`
