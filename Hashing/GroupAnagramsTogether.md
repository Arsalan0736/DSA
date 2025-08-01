# 🧩 Print Anagrams Together

## 📝 Problem Description

Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array.

---

## 📥 Input

- An array of lowercase strings.

## 📤 Output

- A list of lists, where each sublist contains strings that are anagrams of each other, ordered by their appearance in the input array.

---

## 🧠 Constraints

- `1 <= arr.length <= 100`
- `1 <= arr[i].length <= 10`

---

## 💡 Sample Examples

### Example 1
```java
Input: ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
