# Count Distinct Elements in Every Window

## Problem Description
Given an integer array `arr[]` and a number `k`, find the count of distinct elements in every window of size `k` in the array.

---

## Examples

### Example 1
**Input:**  
arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4  
**Output:**  
[3, 4, 4, 3]  
**Explanation:**  
Window 1: [1, 2, 1, 3] → 3 distinct elements  
Window 2: [2, 1, 3, 4] → 4 distinct elements  
Window 3: [1, 3, 4, 2] → 4 distinct elements  
Window 4: [3, 4, 2, 3] → 3 distinct elements  

---

### Example 2
**Input:**  
arr[] = [4, 1, 1], k = 2  
**Output:**  
[2, 1]  
**Explanation:**  
Window 1: [4, 1] → 2 distinct elements  
Window 2: [1, 1] → 1 distinct element  

---

### Example 3
**Input:**  
arr[] = [1, 1, 1, 1, 1], k = 3  
**Output:**  
[1, 1, 1]  
**Explanation:**  
Every window contains only the element 1, so the number of distinct elements in each window is 1.

---

## Constraints
- 1 ≤ k ≤ arr.size() ≤ 10^5  
- 1 ≤ arr[i] ≤ 10^5  

---

## Expected Complexities
- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(k)  
