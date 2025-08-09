# Count the Number of Possible Triangles

## 📌 Problem Statement
Given an integer array `arr[]`, find the number of triangles that can be formed using **three different array elements** as the lengths of the sides of the triangle.

A triangle is **valid** if the sum of **any two sides** is always greater than the third side.

---

## 📝 Examples

### Example 1
**Input:**  
`arr = [4, 6, 3, 7]`  
**Output:**  
`3`  
**Explanation:**  
Possible triangles:  
- `[3, 4, 6]`  
- `[4, 6, 7]`  
- `[3, 6, 7]`  
Note: `[3, 4, 7]` is **not** a valid triangle because `3 + 4` is not greater than `7`.

---

### Example 2
**Input:**  
`arr = [10, 21, 22, 100, 101, 200, 300]`  
**Output:**  
`6`  
**Explanation:**  
Valid triangles:  
- `[10, 21, 22]`  
- `[21, 100, 101]`  
- `[22, 100, 101]`  
- `[10, 100, 101]`  
- `[100, 101, 200]`  
- `[101, 200, 300]`

---

### Example 3
**Input:**  
`arr = [1, 2, 3]`  
**Output:**  
`0`  
**Explanation:**  
No valid triangles possible.

---

## 🎯 Constraints
- `1 ≤ arr.size() ≤ 10^3`
- `0 ≤ arr[i] ≤ 10^5`

---

## ⏳ Expected Complexity
- **Time Complexity:** `O(n^2)`
- **Auxiliary Space:** `O(1)`