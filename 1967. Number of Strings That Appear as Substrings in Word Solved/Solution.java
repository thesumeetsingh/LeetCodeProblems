LeetCode Logo
Problem List
Pending...
Pending...
Debugging...
Debugging...










0

avatar
Avatar
Sumeet Singh
Access all features with our Premium subscription!
myLists
My Lists
notebook
Notebook
progress
Progress
points
Points
Try New Features
Orders
My Playgrounds
Settings
Appearance
Sign Out
Premium
Description
Editorial
Editorial
Solutions
Solutions
Submissions
Submissions
Code
Code
Accepted
Testcase
Testcase
Test Result
1967. Number of Strings That Appear as Substrings in Word
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".
3 of the strings in patterns appear as a substring in word.
Example 2:

Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
Output: 2
Explanation:
- "a" appears as a substring in "aaaaabbbbb".
- "b" appears as a substring in "aaaaabbbbb".
- "c" does not appear as a substring in "aaaaabbbbb".
2 of the strings in patterns appear as a substring in word.
Example 3:

Input: patterns = ["a","a","a"], word = "ab"
Output: 3
Explanation: Each of the patterns appears as a substring in word "ab".
 

Constraints:

1 <= patterns.length <= 100
1 <= patterns[i].length <= 100
1 <= word.length <= 100
patterns[i] and word consist of lowercase English letters.
 
Seen this question in a real interview before?
1/6
Yes
No
Accepted
252,231/292.6K
Acceptance Rate
86.2%
Topics
icon
Companies
Hint 1
Hint 2
Discussion (149)


Choose a type













Copyright © 2026 LeetCode. All rights reserved.

981


149

5 Online
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
patterns =
["a","abc","bc","d"]
word =
"abc"
Output
3
Expected
3
Contribute a testcase
All Submissions

Pending...
Sumeet Singh
Sumeet Singh
submitted at Jul 16, 2025
preparing runtime environment
Code
Java
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String str: patterns){
            if(word.contains(str)){
                count++;
            }
        }
        return count;
    }
}
 
Search questions


Note
Note
Accepted — reading current code…