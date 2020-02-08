## Types
- Max heap
- Min heap

## Applications
- priority queue: is queue but orders people based on a priority
- get minimum or maximum element


## Description
- Is stored in array but is a tree complete binary tree
- Access calculations (assuming start at index 0)
  - parent: ceil(k/2) - 1
  - children: (k*2) + 1, (k*2) + 2
- Children have to be smaller than the parent in max heap and opposite in min heap but is not necessarily ordered

## Operations (min heap)
- getMin: return first element
  - O(1)
- insert: add to end of heap and swap with parent until it is bigger than a parent or is at the top
  - takes O(logn)
- delete: delete an index and then replace it with the last element and do swaps until the heap property is satisfied
  - O(logn)
- Create heap
  - O(n)
