## General info
- uses array as storage
- uses hash function to generate index to store data

## Hashing
- Should have these properties
  - efficient to compute
  - uniformly distributed
- Collisions
  - load factor: is number of elements / size of array
    - on average there will be n/b elements in a slot
  - handled in 2 ways
    - chaining
      - Store items in array as linked list
      - when there is collision attach to linked list
    - open addressing
      - Find next empty slot if there is collision
      - when full, double size
      - methods for probing
        - linear
        - quadratic
        - double hashing


## Operations for chaining
- insert: O(1 + load factor)
- lookup: O(1 + load factor)
