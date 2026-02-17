# Two Sum

## Problem
Find two indices such that their values add up to target.

## Approach
Use HashMap to store number and index while traversing array.

For each element:
- Find complement = target - current number
- If complement exists in map → answer found

## Time Complexity
O(n)

## Space Complexity
O(n)
