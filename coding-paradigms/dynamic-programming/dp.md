## Intro
- Stores results of previous calculations 
### Tabulation
- is bottom up
- is called tabulation because you are accessing values from table
- starts from base state and works up to desitination
- **practicality**
  - not natural way of thinking of things
  - forces you to calculate every subproblem
  - reduces recursion overhead and can be faster  
### Memoization
- start at destination, work down to base and then recurse back
- **practicality**
  - is more natural to think about
  - allows you to skip some subproblems
### Properties of DP problems
- 2 properties
  - overlapping substructure
    - There is need to recalculate subproblems
  - optimal substructure
    - solution of problem is made of optimal solutions of subproblems
### How to solve
- all problems satisfy overlapping subproblem property and some have optimal substructure 
- **developing bellman equation**
  - Is recurrence formula that finds optimal solution
  1. Define state: is set of parameters to determine position
  2. formulate relation among states
  3. add memoization/store in table
