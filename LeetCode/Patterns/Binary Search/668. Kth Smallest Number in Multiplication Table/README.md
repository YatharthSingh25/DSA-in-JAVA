# 📝 668. Kth Smallest Number in Multiplication Table (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/)

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Math, Binary Search

### 🚀 Performance
- **Runtime:** N/A
- **Memory:** N/A

---

### 📜 Problem Description

Nearly everyone has used the  [Multiplication Table](https://en.wikipedia.org/wiki/Multiplication_table) . The multiplication table of size  `m x n`  is an integer matrix  `mat`  where  `mat[i][j] == i * j`  ( **1-indexed** ).

Given three integers  `m` ,  `n` , and  `k` , return  *the*  `kth`  *smallest element in the*  `m x n`  *multiplication table* .

OriginalJava **Example 1:**

 ![image](https://assets.leetcode.com/uploads/2021/05/02/multtable1-grid.jpg) 

```
Input: m = 3, n = 3, k = 5
Output: 3
Explanation: The 5th smallest number is 3.

```

**Example 2:**

 ![image](https://assets.leetcode.com/uploads/2021/05/02/multtable2-grid.jpg) 

```
Input: m = 2, n = 3, k = 6
Output: 6
Explanation: The 6th smallest number is 6.

```

**Constraints:**

	
- `1 <= m, n <= 3 * 104`
	
- `1 <= k <= m * n`