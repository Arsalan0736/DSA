# Clone List with Next and Random (README)

## Problem
You are given a special singly linked list with `n` nodes where each node has:
- a `next` pointer that points to the next node in the list, and
- a `random` pointer that can point to any node in the list or be `NULL`.

Construct a **deep copy** (clone) of this linked list. The cloned list should contain new nodes such that:
- each new node has the same `data` value as the corresponding original node,
- `next` and `random` pointers in the cloned list refer only to nodes in the cloned list (no pointers to original nodes),
- the original list must remain unchanged.

Return the head of the cloned linked list.

---

**Example**
Input: head = [[1, 3], [3, 3], [5, NULL], [9, 3]]
Output: head = [[1, 3], [3, 3], [5, NULL], [9, 3]]

Explanation:
Node 1: NEXT -> Node 2, RANDOM -> Node 3
Node 2: NEXT -> Node 3, RANDOM -> Node 3
Node 3: NEXT -> Node 4, RANDOM -> NULL
Node 4: NEXT -> NULL, RANDOM -> Node 3