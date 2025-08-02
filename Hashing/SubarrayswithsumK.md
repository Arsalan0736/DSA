# 📊 Subarrays with Sum K

### 🔍 Problem Description
Given an unsorted array `arr[]` of integers, find the number of **subarrays** whose sum is exactly equal to a given number `k`.

---

### 📥 Input

- An integer array `arr[]`
- An integer `k` representing the target sum

---

### 📤 Output

- Return the **count of subarrays** with sum exactly equal to `k`.

---

### 📈 Examples

#### ✅ Example 1
```java
Input:  arr[] = {10, 2, -2, -20, 10}, k = -10  
Output: 3

Explanation:  
Subarrays with sum -10 are:  
→ arr[0...3] → {10, 2, -2, -20}  
→ arr[1...4] → {2, -2, -20, 10}  
→ arr[3...4] → {-20, 10}
