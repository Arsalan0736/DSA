# 🔍 Sum Pair Closest to Target

## 🧩 Problem Statement

Given an array `arr[]` and a number `target`, your task is to find a pair of elements `(a, b)` in `arr[]`, where `a ≤ b`, such that the sum of the pair is **closest to the target**.

### ✳️ Special Conditions:
- Return the pair in **sorted order**.
- If there are **multiple such pairs**, return the pair with **maximum absolute difference**.
- If **no such pair exists**, return an empty array.

---

## 🧠 Examples

### Example 1:
```text
Input: arr[] = [10, 30, 20, 5], target = 25  
Output: [5, 20]  
Explanation: 5 + 20 = 25 is exactly equal to the target.
