# Height of Binary Tree

## Problem Description
Given a binary tree, find its height. The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children.

### Examples
Example 1:
Input: root[] = [12, 8, 18, 5, 11]  
Output: 2  
Explanation: One of the longest path from the root (node 12) goes through node 8 to node 5, which has 2 edges.

Example 2:
Input: root[] = [1, 2, 3, 4, N, N, 5, N, N, 6, 7]  
Output: 3  
Explanation: The longest path from the root (node 1) to a leaf node 6 has 3 edges.

## Constraints
1 <= number of nodes <= 10^5  
0 <= node->data <= 10^5  

## Expected Complexities
Time Complexity: O(n)  
Auxiliary Space: O(n)  
