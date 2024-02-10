<h1 align="center">TheDailyByteDev
<br>
<br>
        <p align="center">
                <a href="https://thedailybyte.dev/">
                        <img src="https://thedailybyte.dev/img/apple-touch-icon.png" alt="The Daily Byte">
                </a>
        </p>
</h1>

## Solutions to the Daily Byte algorithms

This repository contains the **[The Daily Byte](https://thedailybyte.dev/)** solutions. Enroll yourself to get problems.

> PS : This repository is a work in progress, everyday problems will be uploaded

## Problems

---

### Problem 1 : Reverse String

> This question is asked by Google.

Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

```java
"Cat", return "taC"
"The Daily Byte", return "etyB yliaD ehT"
"civic", return "civic"
```

[Solution](/Solutions/ReverseString.java)

---

### Problem 2 : Valid Palindrome

> This question is asked by Facebook.

Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.

Ex: Given the following strings...

```java
"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true
```

[Solution](/Solutions/ValidPalindrome.java)

---

### Problem 3 : Vacuum Cleaner Route

> This question is asked by Amazon.

Given a string representing the sequence of moves a robot vacuum makes,return whether or not it will return to its original position. The string will only contain `L`, `R`, `U`, and `D` characters,representing left, right, up, and down respectively.

Ex: Given the following strings...

```java
"LR", return true
"URURD", return false
"RUULLDRD", return true
```

[Solution](/Solutions/VacuumCleanerRoute.java)

---

### Problem 4 : Correct Capitalization

> This question is asked by Google.

Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

```java
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
```

[Solution](/Solutions/CorrectCapitalization.java)

---

### Problem 5 : Add Binary

> This question is asked by Apple.

Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).

> Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...

```java
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
```

[Solution](/Solutions/AddBinary.java)

---

### Problem 6 : Longest Common Prefix

> This question is asked by Microsoft.

Given an array of strings, return the longest common prefix that is shared amongst all strings.

> Note: you may assume all strings only contain lowercase alphabetical characters.

Ex: Given the following arrays...

```java
["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
```

[Solution](/Solutions/LongestCommonPrefix.java)

---

### Problem 7 : Valid Palindrome with Removal

> This question is asked by Facebook.

Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.

> Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

```java
"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
```

[Solution](/Solutions/ValidPalindromeWithRemoval.java)

---

### Problem 8 : Two Sum

> This question is asked by Google.

Given an array of integers, return whether or not two numbers sum to a given target, k.

> Note: you may not sum a number with itself.

Ex: Given the following...

```java
[1, 3, 8, 2], k = 10, return true (8 + 2)
[3, 9, 13, 7], k = 8, return false
[4, 2, 6, 5, 2], k = 4, return true (2 + 2)
```

[Solution](/Solutions/TwoSum.java)

---

### Problem 9 : Jewels and Stones

> This question is asked by Amazon.

Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

```java
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
```

[Solution](/Solutions/JewelsAndStones.java)

---

### Problem 10 : Valid Anagram

> This question is asked by Facebook.

Given two strings `s` and `t` return whether or not `s` is an anagram of `t`.

> Note: An anagram is a word formed by reordering the letters of another word.

Ex: Given the following strings...

```java
s = "cat", t = "tac", return true
s = "listen", t = "silent", return true
s = "program", t = "function", return false
```

[Solution](/Solutions/ValidAnagram.java)

---

### Problem 11 : First Unique Character

> This question is asked by Microsoft.

Given a string, return the index of its first unique character. If a unique character does not exist, return `-1`.

Ex: Given the following strings...

```java
"abcabd", return 2
"thedailybyte", return 1
"developer", return 0
```

[Solution](/Solutions/FirstUniqueCharacter.java)

---

### Problem 12 : Spot the Difference

> This question is asked by Google.

You are given two strings, `s` and `t` which only consist of lowercase letters. `t` is generated by shuffling the letters in `s` as well as potentially adding an additional random character. Return the letter that was randomly added to `t` if it exists, otherwise, return `’ ‘`.

> Note: You may assume that at most one additional character can be added to t.

Ex: Given the following strings...

```java
s = "foobar", t = "barfoot", return 't'
s = "ide", t = "idea", return 'a'
s = "coding", t "ingcod", return ''
```

[Solution](/Solutions/SpotTheDifference.java)

---

### Problem 13 : Intersection of Numbers

> This question is asked by Google.

Given two integer arrays, return their intersection.

> Note: the intersection is the set of elements that are common to both arrays.

Ex: Given the following arrays...

```java
nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []
```

[Solution](/Solutions/IntersectionOfTwoNumbers.java)

---

### Problem 14 : Uncommon Words

> This question is asked by Amazon.

Given two strings representing sentences, return the words that are not common to both strings (i.e. the words that only appear in one of the sentences). You may assume that each sentence is a sequence of words (without punctuation) correctly separated using space characters.

Ex: given the following strings...

```java
sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]
```

[Solution](/Solutions/UncommonWords.java)

---

### Problem 15 : Merge Linked Lists

> This question is asked by Apple.

Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list

Ex: Given the following lists...

```java
list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null
```

[Solution](/Solutions/MergeLinkedLists.java)

---

### Problem 16 : Remove Nth to Last Node

> This question is asked by Facebook.

Given a linked list and a value n, remove the nth to last node and return the resulting list.

Ex: Given the following linked lists...

```java
1->2->3->null, n = 1, return 1->2->null
1->2->3->null, n = 2, return 1->3->null
1->2->3->null, n = 3, return 2->3->null
```

[Solution](/Solutions/RemoveNthToLastNode.java)

---

### Problem 17 : Remove Value

> This question is asked by Google.

Given a linked list and a value, remove all nodes containing the provided value, and return the resulting list.

Ex: Given the following linked lists and values...

```java
1->2->3->null, value = 3, return 1->2->null
8->1->1->4->12->null, value = 1, return 8->4->12->null
7->12->2->9->null, value = 7, return 12->2->9->null
```

[Solution](/Solutions/RemoveValue.java)

---

### Problem 18 : Find Middle Element

> This question is asked by Amazon.

Given a non-empty linked list, return the middle node of the list. If the linked list contains an even number of elements, return the node closer to the end.

```java
1->2->3->null, return 2
1->2->3->4->null, return 3
1->null, return 1
```

[Solution](/Solutions/FindMiddleElement.java)

---

### Problem 19 : Contains Cycle

> This question is asked by Microsoft.

Given a linked list, containing unique numbers, return whether or not it has a cycle.

> Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)

Ex: Given the following linked lists...

```java
1->2->3->1 -> true (3 points back to 1)
1->2->3 -> false
1->1 true (1 points to itself)
```

[Solution](/Solutions/ContainsCycle.java)

---

### Problem 20 : Return Start of Cycle

> This question is asked by Apple.

Given a potentially cyclical linked list where each value is unique, return the node at which the cycle starts. If the list does not contain a cycle, return null.

Ex: Given the following linked lists...

```java
1->2->3, return null
1->2->3->4->5->2 (5 points back to 2), return a reference to the node containing 2
1->9->3->7->7 (7 points to itself), return a reference to the node containing 7
```

[Solution](/Solutions/ReturnStartOfCycle.java)

---

### Problem 21 : Reverse List

> This question is asked by Facebook.

Given a linked list, containing unique values, reverse it, and return the result.

Ex: Given the following linked lists...

```java
1->2->3->null, return a reference to the node that contains 3 which points to a list that looks like the following: 3->2->1->null

7->15->9->2->null, return a reference to the node that contains 2 which points to a list that looks like the following: 2->9->15->7->null

1->null, return a reference to the node that contains 1 which points to a list that looks like the following: 1->null
```

[Solution](/Solutions/ReverseList.java)

---

### Problem 22 : Validate Characters

> This question is asked by Google.

Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order.

Ex: Given the following strings...

```java
"(){}[]", return true
"(({[]}))", return true
"{(})", return false
```

[Solution](/Solutions/ValidateCharacters.java)

---

### Problem 23 : Compare KeyStrokes

> This question is asked by Amazon.

Given two strings `s` and `t`, which represents a sequence of keystrokes, where `#` denotes a backspace, return whether or not the sequences produce the same result.

Ex: Given the following strings...

```java
s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
```

[Solution](/Solutions/CompareKeyStrokes.java)

---

### Problem 24 : Remove Adjacent Duplicates

> This question is asked by Facebook.

Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result.

Ex: Given the following strings...

```java
s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"
```

[Solution](/Solutions/RemoveAdjacentDuplicates.java)

---

### Problem 25 : Greater Elements

> This question is asked by Amazon.

Given two arrays of numbers, where the first array is a subset of the second array, return an array containing all the next greater elements for each element in the first array, in the second array. If there is no greater element for any element, output -1 for that number.

Ex: Given the following arrays…

```java
nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1] because no element in nums2 is greater than 4, 3 is the first number in nums2 greater than 1, and no element in nums2 is greater than 2.

nums1 = [2,4], nums2 = [1,2,3,4], return [3, -1] because 3 is the first greater element that occurs in nums2 after 2 and no element is greater than 4.
```

[Solution](/Solutions/GreaterElements.java)

---

### Problem 26 : Call Counter

> This question is asked by Google.

Create a class `CallCounter` that tracks the number of calls a client has made within the last 3 seconds. Your class should contain one method, `ping(int t)` that receives the current timestamp (in milliseconds) of a new call being made and returns the number of calls made within the last 3 seconds.

> Note: you may assume that the time associated with each subsequent call to `ping` is strictly increasing.

Ex: Given the following calls to `ping`…

```java
ping(1), return 1 (1 call within the last 3 seconds)
ping(300), return 2 (2 calls within the last 3 seconds)
ping(3000), return 3 (3 calls within the last 3 seconds)
ping(3002), return 3 (3 calls within the last 3 seconds)
ping(7000), return 1 (1 call within the last 3 seconds)
```

[Solution](/Solutions/CallCounter.java)

---

### Problem 27 : Moving Average

> This question is asked by Microsoft.

Design a class, MovingAverage, which contains a method, next that is responsible for returning the moving average from a stream of integers.

> Note: a moving average is the average of a subset of data at a given point in time.

Ex: Given the following series of events...

```java
// i.e. the moving average has a capacity of 3.
MovingAverage movingAverage = new MovingAverage(3);
m.next(3) returns 3 because (3 / 1) = 3
m.next(5) returns 4 because (3 + 5) / 2 = 4
m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
```

MovingAverage class definition:

```java
public class MovingAverage {
    // TODO: declare any instance variables you require.
/**
 * Initializes a MovingAverage with a
 * capacity of `size`.
 */
public MovingAverage(int size) {
  // TODO: initialize your MovingAverage.
}

/**
 * Adds `val` to the stream of numbers
 * and returns the current average of the numbers.
 */
public double next(int val) {
   // TODO: implement this method.
}

}
```

[Solution](/Solutions/MovingAverage.java)

---

### Problem 28 : Queue Stack

Design a class to implement a stack using only a single queue. Your class, `QueueStack`, should support the following stack methods: `push()` (adding an item), `pop()` (removing an item), `peek()` (returning the top value without removing it), and `empty()` (whether or not the stack is empty).

[Solution](/Solutions/QueueStack.java)

---

### Problem 29 : Find Value

> This question is asked by Google.

Given the reference to the root of a binary search tree and a search value, return the reference to the node that contains the value if it exists and `null` otherwise.

> Note: all values in the binary search tree will be unique.

Ex: Given the tree...

```java
        3
       / \
      1   4
```

and the search value 1 return a reference to the node containing 1.
Ex: Given the tree

```java
        7
       / \
      5   9
         / \
        8   10
```

and the search value 9 return a reference to the node containing 9.
Ex: Given the tree

```java
        8
       / \
      6   9
```

and the search value 7 return null.

[Solution](/Solutions/FindValue.java)

---

### Problem 30 : Convert Binary Search Tree to Sorted Linked List (FlattenBSTtoLL)

Given a binary search tree, rearrange the tree such that it forms a linked list where all its values are in ascending order.

```java
Ex: Given the following tree...
        5
       / \
      1   6
```

return...

```java
1
 \
  5
   \
    6
```

Ex: Given the following tree...

```java
       5
      / \
    2    9
   / \
  1   3
```

return...

```java
1
 \
  2
   \
    3
     \
      5
       \
        9
```

Ex: Given the following tree...

```java
5
 \
  6
```

return...

```java
5
 \
  6
```

[Solution](/Solutions/FlattenBSTtoLL.java)

---

### Problem 31 : Lowest Common Ancestor

Given a binary search tree that contains unique values and two nodes within the tree, `a,` and `b,` return their lowest common ancestor.

> Note: the lowest common ancestor of two nodes is the deepest node within the tree such that both nodes are descendants of it.

```java
Ex: Given the following tree...
       7
      / \
    2    9
   / \
  1   5
and a = 1, b = 9, return a reference to the node containing 7.
```

```java
Ex: Given the following tree...

        8
       / \
      3   9
     / \
    2   6
and a = 2, b = 6, return a reference to the node containing 3.
```

```java
Ex: Given the following tree...

        8
       / \
      6   9
and a = 6, b = 8, return a reference to the node containing 8.
```

[Solution](/Solutions/LowestCommonAncestor.java)

---

### Problem 32 : Sorted Array to Binary Search Tree

Given an array of numbers sorted in ascending order, return a height balanced binary search tree using every number from the array.

> Note: height balanced meaning that the level of any node’s two subtrees should not differ by more than one.

```java
Ex: nums = [1, 2, 3] return a reference to the following tree...
       2
      /  \
     1    3
```

```java
Ex: nums = [1, 2, 3, 4, 5, 6] return a reference to the following tree...
        3
       / \
      2   5
     /   / \
    1   4   6

      [or]

        4
       / \
      2   5
     / \   \
    1   3   6
```

[Solution](/Solutions/SortedArraytoBST.java)

---

### Problem 33 : Identical Trees

Given two binary trees, return whether or not the two trees are identical.

> Note: identical meaning they exhibit the same structure and the same values at each node.

```java
Ex: Given the following trees...
        2
       / \
      1   3

        2
       / \
      1   3

return true.
```

```java
Ex: Given the following trees...

        1
         \
          9
           \
           18
    1
   /
  9
   \
    18

return false.
```

```java
Ex: Given the following trees...

        2
       / \
      3   1
    2
   / \
  1   3

return false.
```

[Solution](/Solutions/IdenticalTrees.java)

---

### Problem 34 : Minimum Difference

Given a binary search tree, return the minimum difference between any two nodes in the tree.

```java
Ex: Given the following tree...
        2
       / \
      3   1

return 1.
```

```java
Ex: Given the following tree...
        29
       /  \
     17   50
    /     / \
   1    42  59

return 8.
```

```java
Ex: Given the following tree...
        2
         \
         100

return 98.
```

[Solution](/Solutions/MinimumDifference.java)

---

### Problem 35 : Find the Mode

Given a binary search tree, return its mode (you may assume the answer is unique). If the tree is empty, return `-1`. Note: the mode is the most frequently occurring value in the tree.

```java
Ex: Given the following tree...

        2
       / \
      1   2
return 2.
```

```java
Ex: Given the following tree...

         7
        / \
      4     9
     / \   / \
    1   4 8   9
               \
                9
return 9.
```

[Solution](/Solutions/FindTheMode.java)

---

### Problem 36 : Gather Levels

Given a binary tree, return its level order traversal where the nodes in each level are ordered from left to right.

```java
Ex: Given the following tree...

    4
   / \
  2   7

return [[4], [2, 7]]
```

```java
Ex: Given the following tree...

    2
   / \
  10  15
        \
         20

return [[2], [10, 15], [20]]
```

```java
Ex: Given the following tree...

    1
   / \
  9   32
 /      \
3        78

return [[1], [9, 32], [3, 78]]
```

[Solution](/Solutions/GatherLevels.java)

---

### Problem 37 : Max Value in Each Level

Given a binary tree, return the largest value in each of its levels.

```java
Ex: Given the following tree…
    2
   / \
  10  15
        \
         20

return [2, 15, 20]
```

```java
Ex: Given the following tree…

          1
         / \
        5   6
       / \   \
      5   3   7

return [1, 6, 7]
```

[Solution](/Solutions/MaxInEachLevel.java)

---

### Problem 38 : Visible Values

Given a binary tree return all the values you’d be able to see if you were standing on the left side of it with values ordered from top to bottom.

```java
Ex: Given the following tree…

-->    4
      / \
-->  2   7

return [4, 2]
```

```java
Ex: Given the following tree…

-->        7
         /  \
-->     4     9
       / \   / \
-->   1   4 8   9
                 \
-->               9

return [7, 4, 1, 9]
```

[Solution](/Solutions/VisibleValues.java)

---

### Problem 39 : Bottoms Up

Given a binary tree, returns of all its levels in a bottom-up fashion (i.e. last level towards the root).

```java
Ex: Given the following tree…

        2
       / \
      1   2

return [[1, 2], [2]]
```

```java
Ex: Given the following tree…

       7
      / \
    6    2
   / \
  3   3

return [[3, 3], [6, 2], [7]]
```

[Solution](/Solutions/BottomsUp.java)

---

### Problem 40 : ZigZag Traversal

Given a binary tree, return its zig-zag level order traversal (i.e. its level order traversal from left to right the first level, right to left the level the second, etc.).

```java
Ex: Given the following tree…

    1
   / \
  2   3

return [[1], [3, 2]]
```

```java
Ex: Given the following tree…

    8
   / \
  2  29
    /  \
   3    9

return [[8], [29, 2], [3, 9]]
```

[Solution](/Solutions/ZigZagTraversal.java)

---

### Problem 41 : Gather N-ary Tree Levels

Given an n-ary tree, return its level order traversal.

> Note: an n-ary tree is a tree in which each node has no more than N children.

```java
Ex: Give the following n-ary tree…

    8
  / | \
 2  3  29

return [[8], [2, 3, 29]]
```

```java
Ex: Given the following n-ary tree…

     2
   / | \
  1  6  9
 /   |   \
8    2    2
   / | \
 19 12 90

return [[2], [1, 6, 9], [8, 2, 2], [19, 12, 90]]
```

[Solution](/Solutions/GatherNAryTree.java)

---

### Problem 42 : Gather Columns

Given a binary tree, return its column order traversal from top to bottom and left to right.

> Note: if two nodes are in the same row and column, order them from left to right.

```java
Ex: Given the following tree…

    8
   / \
  2   29
     /  \
    3    9

return [[2], [8, 3], [29], [9]]
```

```java
Ex: Given the following tree…

     100
    /   \
  53     78
 / \    /  \
32  3  9    20

return [[32], [53], [100, 3, 9], [78], [20]]
```

[Solution](/Solutions/GatherColumns.java)

---

### Problem 43 : Calculate Depth

Given a binary tree, return its maximum depth.

> Note: the maximum depth is defined as the number of nodes along the longest path from root node to leaf node.

```java
Ex: Given the following tree…

    9
   / \
  1   2

return 2
```

```java
Ex: Given the following tree…

    5
   / \
  1  29
    /  \
   4   13

return 3
```

[Solution](/Solutions/CalculateDepth.java)

---

### Problem 44 : Root to Leaf Paths

Given a binary tree, return a list of strings containing all root to leaf paths.

```java
Ex: Given the following tree…

   1
 /   \
2     3

return ["1->2", "1->3"]
```

```java
Ex: Given the following tree…

    8
   / \
  2  29
    /  \
   3    9

return ["8->2", "8->29->3", "8->29->9"]
```

[Solution](/Solutions/RootToLeafPaths.java)

---

### Problem 45 : Root to Leaf Path Sum

Given a binary tree and a target, return whether or not there exists a root to leaf path such that all values along the path sum to the target.

```java
Ex: Given the following tree…

      1
     / \
    5   2
   /   / \
  1  12   29

and a target of 15, return true as the path 1->2->12 sums to 15.
```

```java
Ex: Given the following tree…

     104
    /   \
  39     31
 / \    /  \
32  1  9    10

and a target of 175, return true as the path 104->39->32 sums to 175.
```

[Solution](/Solutions/RootToLeafPathSum.java)

---

### Problem 46 : Validate Tree

Given a binary tree, containing unique values, determine if it is a valid binary search tree.

> Note: the invariants of a binary search tree (in our case) are all values to the left of a given node are less than the current node’s value, all values to the right of a given node are greater than the current node’s value, and both the left and right subtrees of a given node must also be binary search trees.

```java
Ex: Given the following binary tree…

   1
 /   \
2     3

return false.
```

```java
Ex: Given the following tree…

   2
 /   \
1     3

return true.
```

[Solution](/Solutions/ValidateTree.java)

---

### Problem 47 : Symmetrical Tree

Given a binary tree, return whether or not it forms a reflection across its center (i.e. a line drawn straight down starting from the root).

> Note: a reflection is when an image, flipped across a specified line, forms the same image.

```java
Ex: Given the following tree…

   2
 /   \
1     1

return true as when the tree is reflected across its center all the nodes match.
```

```java
Ex: Given the following tree…

    1
   / \
  5   5
   \    \
    7    7

return false as when the tree is reflected across its center the nodes containing sevens do not match.
```

[Solution](/Solutions/SymmetricalTree.java)

---

### Problem 48 : Same Leaves

Given two binary trees, return whether or not both trees have the same leaf sequence. Two trees have the same leaf sequence if both trees’ leaves read the same from left to right.

```java
Ex: Given the following trees…

   1
 /   \
1     3

and


   7
 /   \
1     2

return false as both the trees leaves do not read the same from left to right (i.e. [1, 3] and [1, 2]).
```

```java
Ex: Given the following trees…

    8
   / \
  2   29
    /  \
   3    9

and

    8
   / \
  2  29
 /   /  \
2   3    9
     \
      3

return true as both the trees leaves read the same from left to right (i.e. [2, 3, 9] and [2, 3, 9]).
```

[Solution](/Solutions/SameLeaves.java)

---

### Problem 49 : Sum Left Leaves

Given a binary tree, return the sum of all left leaves of the tree.

```java
Ex: Given the following tree…
    5
   / \
  2   12
     /  \
    3    8

return 5 (i.e. 2 + 3)
```

```java
Ex: Given the following tree…

       2
      / \
    4    2
   / \
  3   9

return 3 (i.e. 3)
```

[Solution](/Solutions/SumLeftLeaves.java)

---

### Problem 50 : String Permutations

> This question is asked by Amazon.

Given a string `s` consisting of only letters and digits, where we are allowed to transform any letter to uppercase or lowercase, return a list containing all possible permutations of the string.

```java
Ex: Given the following string…

S = "c7w2", return ["c7w2", "c7W2", "C7w2", "C7W2"]
```

[Solution](/Solutions/StringPermutations.java)

---

### Problem 51 : Generate Text Messages

> This question is asked by Google.

Given a string of digits, return all possible text messages those digits could send.

> Note: The mapping of digits to letters is as follows…
> <br> 0 -> null
> <br> 1 -> null
> <br> 2 -> "abc"
> <br> 3 -> "def"
> <br> 4 -> "ghi"
> <br> 5 -> "jkl"
> <br> 6 -> "mno"
> <br> 7 -> "pqrs"
> <br> 8 -> "tuv"
> <br> 9 -> "wxyz"

```java
Ex: digits = "23" return ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
```

[Solution](/Solutions/GenerateTextMessages.java)

---

### Problem 52 : Word Search

> This question is asked by Amazon.

Given a 2D board that represents a `word` search puzzle and a string word, return whether or the given word can be formed in the puzzle by only connecting cells horizontally and vertically.

```java
Ex: Given the following board and words…

board =
[
  ['C','A','T','F'],
  ['B','G','E','S'],
  ['I','T','A','E']
]

word = "CAT", return true
word = "TEA", return true
word = "SEAT", return true
word = "BAT", return false
```

[Solution](/Solutions/WordSearch.java)

---

### Problem 53 : Gold Rush

> This question is asked by Amazon.

Given a 2D matrix that represents a gold mine, where each cell’s value represents an amount of gold, return the maximum amount of gold you can collect given the following rules:

1. You may start and stop collecting gold from any position.
2. You can never visit a cell that contains 0 gold.
3. You cannot visit the same cell more than once.
4. From the current cell, you may walk one cell to the left, right, up, or down.

```java
Ex: Given the following gold mine…

goldMine = [
    [0,2,0],
    [8,6,3],
    [0,9,0]
],

return 23 (start at 9 and then move to 6 and 8 respectively)
```

[Solution](/Solutions/GoldRush.java)

---

### Problem 54 : Parentheses Generation

> This question is asked by Facebook.

Given an integer `N`, where `N` represents the number of pairs of parentheses (i.e. `”(“` and `”)”`) you are given, return a list containing all possible well-formed parentheses you can create.

```java
Ex: Given the following value of N…

N = 3,

return [
    "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```

[Solution](/Solutions/ParenthesesGeneration.java)

---

### Problem 55 : Unqiue Combinations

> This question is asked by Apple.

Given a list of positive numbers without duplicates and a target number, find all unique combinations of the numbers that sum to the target. Note: You may use the same number more than once.

```java
Ex: Given the following numbers and target…

numbers = [2,4,6,3], target = 6,

return [
    [2,2,2],
    [2,4],
    [3,3],
    [6]
]
```

[Solution](/Solutions/UniqueCombinations.java)

---

### Problem 56 : Palindrome Splitting

> This question is asked by Google.

Given a string `s`, return all possible partitions of `s` such that each substring is a palindrome.

```java
Ex: Given the following string s…

s = "abcba",

return [
    ["a","b","c","b","a"],
    ["a","bcb","a"],
    ["abcba"]
]

Ex: Given the following string s…

s="aab"

return [
    ["a","a","b"],
    ["aa","b"]
]
```

[Solution](/Solutions/PalindromeSplitting.java)

---

### Problem 57 : Life Rafts

> This question is asked by Amazon.

A ship is about to set sail and you are responsible for its safety precautions. More specifically, you are responsible for determining how many life rafts to carry onboard. You are given a list of all the passengers’ weights and are informed that a single life raft has a maximum capacity of `limit` and can hold at most two people. Return the minimum number of life rafts you must take onboard to ensure the safety of all your passengers.

> Note: You may assume that a the maximum weight of any individual is at most `limit`.

```java
Ex: Given the following passenger weights and limit…

weights = [1, 3, 5, 2] and limit = 5, return 3
weights = [1, 2] and limit = 3, return 1
weights = [4, 2, 3, 3] and limit = 5 return 3
```

[Solution](/Solutions/LifeRafts.java)

---

### Problem 58 : Max Points

> This question is asked by Google.

You are given a bag of coins, an initial energy of `E`, and want to maximize your number of points (which starts at zero). To gain a single point you can exchange `coins[i]` amount of energy (i.e. if I have 100 energy and a coin that has a value 50 I can exchange 50 energy to gain a point). If you do not have enough energy you can give away a point in exchange for an increase in energy by `coins[i]` amount (i.e. you give away a point and your energy is increased by the value of that coin: `energy += coins[i]`). Return the maximum number of points you can gain.

> Note: Each coin may only be used once.

```java
Ex: Given the following coins and starting energy…

coins = [100, 150, 200] and E = 150, return 1
coins = [100,200,300,400] and E = 200, return 2
coins = [300] and E = 200, return 0
```

[Solution](/Solutions/MaxPoints.java)

---

### Problem 59 : Throwing Stones

> This question is asked by Amazon.

You are given a group of stones, all of which have a positive weight. At each turn, we select the heaviest two stones and smash them together. When smashing these two stones together, one of two things can happen:

1. If the stones are both the same weight, both stones are destroyed.
2. If the weights of the stones are not equal, the smaller of the two stones is destroyed and the remaining stone’s weight is updated to the difference (i.e. if we smash two stones together of weight 3 and weight 5 the stone with weight 3 is destroyed and the stone with original weight 5 now has weight 2).

Continue smashing stones together until there is at most one stone left and return the weight of the remaining stone. If not stones remain, return zero.

```java
Ex: Given the following stones…

stones = [2, 4, 3, 8], return 1
8 and 4 are smashed together, 4 is destroyed, 8 becomes 4.
4 and 3 are smashed together, 3 is destroyed, 4 becomes 1.
2 and 1 are smashed together, 1 is destroyed, 2 becomes 1.
1 is the last stone remaining and is therefore returned.
```

```java
Ex: Given the following stones…

stones = [1, 2, 3, 4], return 0
4 and 3 are smashed together, 3 is destroyed, 4 becomes 1.
2 and 1 are smashed together, 1 is destroyed, 2 becomes 1.
1 and 1 are smashed together and both stones are destroyed.
0 is returned as no stones remain.
```

[Solution](/Solutions/ThrowingStones.java)

---

### Problem 60 : Popsicle Stand

> This question is asked by Amazon.

You’re running a popsicle stand where each popsicle costs $5. Each customer you encountered pays with either a $5 bill, a $10 bill, or a $20 bill and only buys a single popsicle. the customers that come to your stand come in the ordered given by the `customers` array where `customers[i]` represents the bill the ith customer pays with. Starting with $0, return whether or not you can serve all the given customers while also giving the correct amount of change.

```java
Ex: Given the following customers…

customers = [5, 10], return true
collect $5 from the first customer, pay no change.
collet $10 from the second customer and give back $5 change.
```

```java
Ex: Given the following customers…

customers = [10], return false
collect $10 from the first customer and we cannot give back change.
```

```java
Ex: Given the following customers…

customers = [5,5,5,10,20], return true
collect $5 from the first 3 customers.
collet $10 from the fourth customer and give back $5 change.
collect $20 from the fifth customer and give back $10 change ($10 bill and $5 bill).
```

[Solution](/Solutions/PopsicleStand.java)

---

### Problem 61 : Lunchtime

> This question is asked by Apple.

You are serving people in a lunch line and need to ensure each person gets a “balanced” meal. A balanced meal is a meal where there exists the same number of food items as drink items. Someone is helping you prepare the meals and hands you food items (i.e. `F`) or a drink items (`D`) in the order specified by the `items` string. Return the maximum number of balanced meals you are able to create without being able to modify `items`.

> Note: `items` will only contain `F` and `D` characters.

```java
Ex: Given the following items…

items = "FDFDFD", return 3
the first "FD" creates the first balanced meal.
the second "FD" creates the second balanced meal.
the third "FD" creates the third balanced meal.
```

```java
Ex: Given the following items…

items = "FDFFDFDD", return 2
"FD" creates the first balanced meal.
"FFDFDD" creates the second balanced meal.
```

[Solution](/Solutions/Lunchtime.java)

---

### Problem 62 : Flight Prices

> This question is asked by Google.

A company is booking flights to send its employees to its two satellite offices `A` and `B`. The cost of sending the ith employee to office `A` and office `B` is given by `prices[i][0]` and `prices[i][1]` respectively. Given that half the employees must be sent to office `A` and half the employees must be sent to office `B`, return the minimum cost the company must pay for all their employees’ flights.

```java
Ex: Give the following prices…

prices = [[40,30],[300,200],[50,50],[30,60]], return 310
Fly the first personn to office B.
Fly the second person to office B.
Fly the third person to office A.
Fly the fourth person to office B.
```

[Solution](/Solutions/FlightPrices.java)

---

### Problem 63 : Moving Bricks

You are transporting bricks on a construction site and want to work as efficiently as possible. The weight of each brick is given by `bricks[i]`. Given a wheelbarrow that can carry up to (not including) 5000 pounds, return then maximum number of bricks you can place in your wheelbarrow to transport.

```java
Ex: Given the following bricks…

bricks = [1000, 1000, 1000, 2000], return 3.
```

```java
Ex: Given the following bricks…

bricks = [1000, 200, 150, 200], return 4.
```

[Solution](/Solutions/MovingBricks.java)

---

### Problem 64 : Who Wins ?

> This question is asked by Amazon.

Given an integer array, two players take turns picking the largest number from the ends of the array. First, player one picks a number (either the left end or right end of the array) followed by player two. Each time a player picks a particular numbers, it is no longer available to the other player. This picking continues until all numbers in the array have been chosen. Once all numbers have been picked, the player with the larger score wins. Return whether or not player one will win.

> Note: You may assume that each player is playing to win (i.e. both players will always choose the maximum of the two numbers each turn) and that there will always be a winner.

```java
Ex: Given the following integer array...

nums = [1, 2, 3], return true
Player one takes 3
Player two takes 2
Player one takes 1
3 + 1 > 2 and therefore player one wins
```

[Solution](/Solutions/WhoWins.java)

---

### Problem 65 : StairMaster

> This question is asked by Apple.

Given a staircase where the ith step has a non-negative cost associated with it given by `cost[i]`, return the minimum cost of climbing to the top of the staircase. You may climb one or two steps at a time and you may start climbing from either the first or second step.

```java
Ex: Given the following cost array…

cost = [5, 10, 20], return 10.
```

```java
Ex: Given the following cost array…

cost = [1, 5, 10, 3, 7, 2], return 10.
```

[Solution](/Solutions/StairMaster.java)

---

### Problem 66 : Making Change

> This question is asked by Facebook.

Given an array that represents different coin denominations and an amount of change you need to make, return the fewest number of coins it takes to make the given amount of change.

> Note: If it is not possible to create the amount of change with the coins you’re given, return -1.

```java
Ex: Given the following denominations and amount…

coins = [1,5, 10, 25], amount = 78, return 6
Take three 25 coins and three 1 coins for a total of 6 coins.
```

[Solution](/Solutions/MakingChange.java)

---

### Problem 67 : Message Decryption

> This question is asked by Microsoft.

Given a message that is encoded using the following encryption method…

```java
A -> 1
B -> 2
C -> 3
...
Z -> 26
```

Return the total number of ways it can be decoded.
Note: ‘0’ has no mapping and a character following a ‘0’ also has no mapping (i.e. “03”)

```java
Ex: Given the following message…

message = "23", return 2.
The message can be decrypted as "BC" (i.e. 2 -> B, 3 -> C)
The message can also be decrypted as "W" (i.e. 23 -> W)
```

```java
Ex: Given the following message…

message = "1234", return 3.
```

[Solution](/Solutions/MessageDecryption.java)

---

### Problem 68 : Galton Board

> This question is asked by Google.

A ball is dropped into a special Galton board where at each level in the board the ball can only move right or down. Given that the Galton board has `M` rows and `N` columns, return the total number of unique ways the ball can arrive at the bottom right cell of the Galton board.

```java
Ex: Given the following values of M and N…

M = 2, N = 2, return 2.
The possible paths are DOWN -> RIGHT and RIGHT -> DOWN
```

[Solution](/Solutions/GaltonBoard.java)

---

### Problem 69 : River Crossing

> This question is asked by Amazon.

A frog is attempting to cross a river to reach the other side. Within the river, there are stones located at different positions given by a `stones` array (this array is in sorted order). Starting on the first stone (i.e. `stones[0]`), the frog makes a jump of size one potentially landing on the next stone. If the frog’s last jump was of size `x`, the frog’s next jump may be of size `x - 1`, `x`, or `x + 1`. Given these following conditions return whether or not the frog can reach the other side.

> Note: The frog may only jump in the forward direction.

```java
Ex: Given the following stones…

stones = [0, 1, 10], return false.
The frog can jump from stone 0 to stone 1, but then the gap is too far to jump to the last stone (i.e. the stone at position 10)
```

```java
Ex: Given the following stones…


stones = [0, 1, 2, 4], return true.
The frog can jump from stone 0, to stone 1, to stone 2, to stone 4.
```

[Solution](/Solutions/RiverCrossing.java)

---

### Problem 70 : Longest Common Consequence

> This question is asked by Google.

Given two strings, `s` and `t`, return the length of their longest subsequence.

```java
Ex: Given the following strings s and t…

s = "xyz", t = "xyz". return 3.
```

```java
Ex: Given the following strings s and t…

s = "abca", t = "acea", return 3.
```

```java
Ex: Given the following strings s and t…

s = "abc", t = "def", return 0.
```

[Solution](/Solutions/LongestCommonSubsequence.java)

---

### Problem 71 : Maximum Subarray

> This question is asked by Facebook.

Given an integer array, return the sum of its contiguous subarray that produces the largest value.

> Note: Your subarray must contain at least one value.

```java
Ex: Given the following integer arrays…

nums = [-3,8,-8,2], return 8 (8)
nums = [2, 3,-4, 2], return 5 (2 + 3)
nums = [1, 5,-2, -3, 7], return 8 (1 + 5 + (-2) + (-3) + 7)
```

[Solution](/Solutions/MaximumSubarray.java)

---

### Problem 72 : Edit Distance

> This question is asked by Google.

Given two strings `s` and `t`, return the minimum number of operations needed to convert `s` into `t` where a single operation consists of inserting a character, deleting a character, or replacing a character.

```java
Ex: Given the following strings s and t…

s = "cat", t = "bat", return 1.
```

```java
Ex: Given the following strings s and t…

s = "beach", t = "batch", return 2.
Delete the 'e' in "beach" and add a 't' to the resulting "bach".
```

[Solution](/Solutions/EditDistance.java)

---

### Problem 73 : Dictionary Words

> This question is asked by Amazon.

Given a string s and a list of words representing a dictionary, return whether or not the entirety of s can be segmented into dictionary words.

> Note: You may assume all characters in `s` and the dictionary are lowercase.

```java
Ex: Given the following string s and dictionary…

s = "thedailybyte", dictionary = ["the", "daily", "byte"], return true.
```

```java
Ex: Given the following string s and dictionary…

s = "pizzaplanet", dictionary = ["plane", "pizza"], return false.
```

[Solution](/Solutions/DictionaryWords.java)

---

### Problem 74 : Longest Increasing Subsequence

> This question is asked by Facebook.

Given an array of unsorted integers, return the length of its longest increasing subsequence.

> Note: You may assume the array will only contain positive numbers.

```java
Ex: Given the following array nums…

nums = [1, 9, 7, 4, 7, 13], return 4.
The longest increasing subsequence is 1, 4, 7, 13.
```

[Solution](/Solutions/LongestIncreasingSubsequence.java)

---

### Problem 75 : Painting Houses

> This question is asked by Apple.

You are tasked with painting a row of houses in your neighborhood such that each house is painted either red, blue, or green. The cost of painting the ith house red, blue or green, is given by `costs[i][0]`, `costs[i][1]`, and `costs[i][2]` respectively. Given that you are required to paint each house and no two adjacent houses may be the same color, return the minimum cost to paint all the houses.

```java
Ex: Given the following costs array…

costs = [[1, 3, 5],[2, 4, 6],[5, 4, 3]], return 8.
Paint the first house red, paint the second house blue, and paint the third house green.
```

[Solution](/Solutions/PaintingHouses.java)

---

### Problem 76 : Stairs

> This question is asked by Google.

Given a staircase with `N` steps and the ability to climb either one or two steps at a time, return the total number of ways to arrive at the top of the staircase.

```java
Ex: Given the following value of N…

N = 2, return 2
1 step + 1 step
2 steps
```

```java
Ex: Given the following value of N…

N = 3, return 3
1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step
```

[Solutions](/Solutions/Stairs.java)

---

### Problem 77 : Art Gallery Thief

You’ve broken into an art gallery and want to maximize the value of the paintings you steal. All the paintings you steal you place in your bag which can hold at most `W` pounds. Given that the weight and value of the ith painting is given by `weights[i]` and `values[i]` respectively, return the maximum value you can steal.

```java
Ex: Given the following W, weights array and values array…

W = 10, weights = [4, 1, 3], values = [4, 2, 7], return 13.
```

```java
Ex: Given the following W, weights array and values array…

W = 5, weights = [2, 4, 3], values = [3, 7, 2], return 7.
```

```java
Ex: Given the following W, weights array and values array…

W = 7, weights = [1, 3, 4], values = [3, 5, 6], return 11.
```

[Solution](/Solutions/ArtGalleryThief.java)

---

### Problem 78 : Buggy Software

> This question is asked by Facebook.

Releasing software can be tricky and sometimes we release new versions of our software with bugs. When we release a version with a bug it’s referred to as a bad release. Your product manager has just informed you that a bug you created was released in one of the past versions and has caused all versions that have been released since to also be bad. Given that your past releases are numbered from zero to `N` and you have a helper function `isBadRelease(int releaseNumber)` that takes a version number and returns a boolean as to whether or not the given release number is bad, return the release number that your bug was initially shipped in.

> Note: You should minimize your number of calls made to `isBadRelease()`

```java
Ex: Given the following value N…

N = 5 and release number four is the release your bug was shipped in...
isBadRelease(3) // returns false.
isBadRelease(5) // returns true.
isBadRelease(4) // returns true.


return 4.
```

[Solution](/Solutions/BuggySoftware.java)

---

### Problem 79 : Gym Lockers

> his question is asked by Facebook.

In a gym hallway there are N lockers. You walk back and forth down the hallway opening and closing lockers. On your first pass you open all the lockers. On your second pass, you close every other locker. On your third pass you open every third locker. After walking the hallway N times opening/closing lockers in the previously described manner, how many locker are left open?

```java
Ex: Given the following value of N…

N = 1, return 1.
You walk down the hallway once and open the only locker.
```

```java
Ex: Given the following value of N…

N = 2, return 1.
You walk down the hallway and open both lockers.
You walk back down the hallway and close the last locker.
```

[Solution](/Solutions/GymLockers.java)

---

### Problem 80 : One Gone Missing

> This question is asked by Amazon.

Given an array that contains all distinct values from zero through N except one number, return the number that is missing from the array.

```java
Ex: Given the following array nums…

nums = [1, 4, 2, 0], return 3.
3 is the only number missing in the array between 0 and 4.
```

```java
Ex: Given the following array nums…

nums = [6, 3, 1, 2, 0, 5], return 4.
4 is the only number missing in the array between 0 and 6.
```

[Solution](/Solutions/OneGoneMissing.java)

---

### Problem 81 : Complementary Numbers

Given a positive number, return its complementary number.
Note: The complement of a number is the number that results from flipping every bit in the original number. (i.e. zero bits become one bits and one bits become zero bits).

```java
Ex: Given the following number…

number = 27, return 4.
27 in binary (not zero extended) is 11011.
Therefore, the complementary binary is 00100 which is 4.
```

[Solution](/Solutions/ComplementaryNumbers.java)

---

### Problem 82 : Create Trie

> This question is asked by Microsoft.

Implement a trie class that supports insertion and search functionalities.
Note: You may assume only lowercase alphabetical characters will added to your trie.

```java
Ex: Given the following operations on your trie…

Trie trie = new Trie()
trie.insert("programming");
trie.search("computer") // returns false.
trie.search("programming") // returns true.
```

[Solution](/Solutions/CreateTrie.java)

---

### Problem 83 : Finding Friends

> This question is asked by Facebook.

You are given a two dimensional matrix, `friends`, that represents relationships between coworkers in an office. If `friends[i][j] = 1` then coworker `i` is friends with coworker `j` and coworker `j` is friends with coworker `i`. Similarly if `friends[i][j] = 0` then coworker `i` is not friends with coworker `j` and coworker `j` is not friend with coworker `i`. Friendships in the office are transitive (i.e. if coworker one is friends with coworker two and coworker two is friends with coworker three, coworker one is also friends with coworker three). Given the friendships in the office defined by `friends`, return the total number of distinct friends groups in the office.
Note: Each coworker is friends with themselves (i.e.`matrix[i][j] = 1` for all values where `i = j`)

```java
Ex: Given the following matrix friends…

friends = [
    [1, 1, 0],
    [1, 1, 0],
    [0, 0, 1]
], return 2.
The 0th and 1st coworkers are friends with one another (first friend group).
The 2nd coworker is friends with themself (second friend group).
```

[Solutions](/Solutions/FindingFriends.java)

---

### Problem 84 : Counting Primes

> This question is asked by Google.

Given a positive integer `N`, return the number of prime numbers less than `N`.

```java
Ex: Given the following N…

N = 3, return 1.
2 is the only prime number less than 3.
Ex: Given the following N…

N = 7, return 3.
2, 3, and 5 are the only prime numbers less than 7.
```

[Solution](/Solutions/CountingPrimes.java)

---

### Problem 85 : Iterative Inorder Traversal

Given a binary tree, return a list containing its inorder traversal without using recursion.

```java
Ex: Given the following tree…

      2
     / \
    1   3
return [1, 2, 3]
Ex: Given the following tree…

        2
       / \
      1   7
     / \
    4   8
return [4, 1, 8, 2, 7]
```

[Solution](/Solutions/IterativeInorderTraversal.java)

---

### Problem 86 : Reverse Vowels

> This question is asked by Facebook.

Given a string, reverse the vowels of it.
Note: In this problem `y` is not considered a vowel.

```java
Ex: Given the following strings s…

s = "computer", return "cemputor"
Ex: Given the following strings s…

s = "The Daily Byte", return "The Dialy Byte"
```

[Solution](/Solutions/ReverseVowels.java)

---

### Problem 87 : Reap Children

You are given two lists of integers and an integer representing a process id to kill. One of the lists represents a list of process ids and the other represents a list of each of the processes’ corresponding (by index) parent ids. When a process is killed, all of its children should also be killed. Return a list of all the process ids that are killed as a result of killing the requested process. Ex: Given the following…

```java
pid =  [2, 4, 3, 7]
ppid = [0, 2, 2, 3]
kill = 7
the tree of processes can be represented as follows:
      2
     / \
    4   3
       /
      7

return [3, 7] as killing process 3 will also require killing its child (i.e. process 10).
```

[Solution](/Solutions/ReapChildren.java)

---

### Problem 88 : Character Scramble

> This question is asked by Amazon.

Given two strings, passage and text return whether or not the characters in text can be used to form the given passage.
Note: Each character in text may only be used once and passage and text will only contain lowercase alphabetical characters.

```java
Ex: Given the following passage and text…

passage = "bat", text = "cat", return false.
Ex: Given the following passage and text…

passage = "dog" text = "didnotgo", return true.
```

[Solution](/Solutions/CharacterScramble.java)

---

### Problem 89 : Subsequence

> This question is asked by Google.

Given two strings s and t return whether or not `s` is a subsequence of `t`.
Note: You may assume both `s` and `t` only consist of lowercase characters and both have a length of at least one.

```java
Ex: Given the following strings s and t…

s = "abc", t = "aabbcc", return true.
Ex: Given the following strings s and t…

s = "cpu", t = "computer", return true.
Ex: Given the following strings s and t…

s = "xyz", t = "axbyc", return false.
```

[Solution](/Solutions/Subsequence.java)

---

### Problem 90 : Count Islands

Given a 2D array of integers with ones representing land and zeroes representing water, return the number of islands in the grid. Note: an island is one or more ones surrounded by water connected either vertically or horizontally.

```java
Ex: Given the following grid…

11000
11010
11001
return 3.

Ex: Given the following grid…

00100
00010
00001
00001
00010
return 4.
```

[Solution](/Solutions/CountIslands.java)

---

### Problem 91 : Compression

> This question is asked by Facebook.

Given a character array, compress it in place and return the new length of the array.
Note: You should only compress the array if its compressed form will be at least as short as the length of its original form.

```java
Ex: Given the following character array chars…

chars = ['a', 'a', 'a', 'a', 'a', 'a'], return 2.
chars should be compressed to look like the following:
chars = ['a', '6']
Ex: Given the following character array chars…

chars = ['a', 'a', 'b', 'b', 'c', 'c'], return 6.
chars should be compressed to look like the following:
chars = ['a', '2', 'b', '2', 'c', '2']
Ex: Given the following character array chars…

chars = ['a', 'b', 'c'], return 3.
In this case we chose not to compress chars.
```

[Solution](/Solutions/Compression.java)

---

### Problem 92 : Distance to Rabbit Holes

Given a 2D array containing only the following values: -1, 0, 1 where -1 represents an obstacle, 0represents a rabbit hole, and 1represents a rabbit, update every cell containing a rabbit with the distance to its closest rabbit hole.

```java
Note: multiple rabbit may occupy a single rabbit hole and you may assume every rabbit can reach a rabbit hole. A rabbit can only move up, down, left, or right in a single move. Ex: Given the following grid…

-1  0  1
 1  1 -1
 1  1  0
your grid should look like the following after running the function...
-1  0  1
2  1 -1
2  1  0

Ex: Given the following grid…

 1  1  1
 1 -1 -1
 1  1  0
your grid should look like the following after running the function...
4  5  6
3 -1 -1
2  1  0
```

[Solution](/Solutions/DistanceToRabbitHoles.java)

---

### Problem 93 : Defanging IPs

> This question is asked by Amazon.

Given a valid IP address, defang it.
Note: To defang an IP address, replace every `"."`, with `"[.]"`.

Ex: Given the following address...

```java
address = "127.0.0.1", return "127[.]0[.]0[.]1"
```

[Solution](/Solutions/DefangingIPs.java)

---

### Problem 94 : Removing Vowels

> This question is asked by Amazon.

Given a string `s` remove all the vowels it contains and return the resulting string.
Note: In this problem `y` is not considered a vowel.

```java
Ex: Given the following string s…

s = "aeiou", return ""

Ex: Given the following string s…

s = "byte", return "byt"

Ex: Given the following string s…

s = "xyz", return "xyz"

```

[Solution](/Solutions/RemovingVowels.java)

---

### Problem 95 : Minimize Path

> This question is asked by Google.

Given an NxM matrix, `grid`, where each cell in the matrix represents the cost of stepping on the current cell, return the minimum cost to traverse from the top-left hand corner of the matrix to the bottom-right hand corner.
Note: You may only move down or right while traversing the `grid`.

```java
Ex: Given the following grid…

grid = [
    [1,1,3],
    [2,3,1],
    [4,6,1]
], return 7.
The path that minimizes our cost is 1->1->3->1->1 which sums to 7.
```

[Solution](/Solutions/MinimizePath.java)

---

### Problem 96 : Hamming Distance

> This question is asked by Facebook.

Given two integers `x` and `y`, return the hamming distance between the two numbers.
Note: The hamming distance between two numbers is the number of bit positions in which the bits differ.

```java
Ex: Given the following integers x and y…

x = 2, y = 4, return 2.
2 in binary is 0 0 1 0
4 in binary is 0 1 0 0
therefore the number of positions in which the bits differ is two.
```

[Solution](/Solutions/HammingDistance.java)

---

### Problem 97 : Travel to Points

> This question is asked by Facebook.

Given `N` points on a Cartesian plane, return the minimum time required to visit all points in the order that they’re given.
Note: You start at the first point and can move one unit vertically, horizontally, or diagonally in a single second.

```java
Ex: Given the following points…

points = [[0, 0], [1,1], [2,2]], return 2.
In one second we can travel from [0, 0] to [1, 1]
In another second we can travel from [1, 1,] to [2, 2]
```

```java
Ex: Given the following points…

points = [[0, 1], [2, 3], [4, 0]], return 5.
```

[Solution](/Solutions/TravelToPoints.java)

---

### Problem 98 : Rearrange Elements

> This question is asked by Apple.

Given an array of numbers, move all zeroes in the array to the end while maintaining the relative order of the other numbers.
Note: You must modify the array you’re given (i.e. you cannot create a new array).

```java
Ex: Given the following array nums…

nums = [3, 7, 0, 5, 0, 2], rearrange nums to look like the following [3,7,5,2,0,0]
```

[Solution](/Solutions/RearrangeElements.java)

---

### Problem 99 : Averages

> This question is asked by Facebook.

Given a reference to the root of a binary tree, return a list containing the average value in each level of the tree.

```java
Ex: Given the following binary tree…

       1
      / \
    6    8
   / \
  1   5
return [1.0, 7.0, 3.0]
```

[Solution](/Solutions/Averages.java)

---

### Problem 100 : Array Shuffle

> This question is asked by Amazon.

Given an array of integers, nums, sort the array in any manner such that when i is even, nums[i] is even and when i is odd, nums[i] is odd.
Note: It is guaranteed that a valid sorting of nums exists.

```java
Ex: Given the following array nums…

nums = [1, 2, 3, 4], one possible way to sort the array is [2,1,4,3]
```

[Solution](/Solutions/ArrayShuffle.java)
