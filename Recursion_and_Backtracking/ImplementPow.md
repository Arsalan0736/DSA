# Implement Pow (Power Function)

## Problem Description
Implement the function `power(b, e)`, which calculates **b raised to the power of e (i.e., b^e)**.

## Examples
**Example 1**  
Input: `b = 3.00000, e = 5`  
Output: `243.00000`

**Example 2**  
Input: `b = 0.55000, e = 3`  
Output: `0.16638`

**Example 3**  
Input: `b = -0.67000, e = -7`  
Output: `-16.49971`

## Constraints
- `-100.0 < b < 100.0`  
- `-10^9 <= e <= 10^9`  
- Either `b` is not zero OR `e > 0`  
- `-10^4 <= b^e <= 10^4`  

## Expected Complexity
- **Time Complexity:** `O(log n)`  
- **Auxiliary Space:** `O(log n)`  

## Approach
This problem is solved using **Fast Exponentiation (Binary Exponentiation)**:  
- If `e` is even: `b^e = (b^(e/2))^2`  
- If `e` is odd: `b^e = b * b^(e-1)`  
- If `e` is negative: `b^e = 1 / (b^(-e))`  

## Topics
- Recursion  
- Divide and Conquer  
- Exponentiation by Squaring  
