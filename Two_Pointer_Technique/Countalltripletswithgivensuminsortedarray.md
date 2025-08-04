# 🧮 Count Triplets with Given Sum in Sorted Array

## 📝 Problem Statement

Given a **sorted array** `arr[]` and a **target value**, the task is to count all **triplets (i, j, k)** such that:

- `arr[i] + arr[j] + arr[k] == target`
- `i < j < k`

### ✅ Constraints:
- `3 ≤ arr.length ≤ 10^4`
- `-10^5 ≤ arr[i], target ≤ 10^5`

---

## 📈 Expected Complexity

- **Time Complexity:** `O(n^2)`
- **Auxiliary Space:** `O(1)`

---

## 🔍 Example 1

**Input:**
```java
arr = [-3, -1, -1, 0, 1, 2]
target = -2
