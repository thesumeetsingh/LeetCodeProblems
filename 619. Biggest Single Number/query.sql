LeetCode Logo
Problem List
Debugging...
Debugging...










0

avatar
Avatar
Sumeet Singh
Access all features with our Premium subscription!
myLists
My Lists
favorites
Favorites
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
Testcase
Testcase
Test Result
619. Biggest Single Number
Solved
Easy
Topics
premium lock icon
Companies
SQL Schema
Pandas Schema
Table: MyNumbers

+-------------+------+
| Column Name | Type |
+-------------+------+
| num         | int  |
+-------------+------+
This table may contain duplicates (In other words, there is no primary key for this table in SQL).
Each row of this table contains an integer.
 

A single number is a number that appeared only once in the MyNumbers table.

Find the largest single number. If there is no single number, report null.

The result format is in the following example.

 

Example 1:

Input: 
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 4   |
| 5   |
| 6   |
+-----+
Output: 
+-----+
| num |
+-----+
| 6   |
+-----+
Explanation: The single numbers are 1, 4, 5, and 6.
Since 6 is the largest single number, we return it.
Example 2:

Input: 
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 7   |
| 7   |
| 3   |
| 3   |
| 3   |
+-----+
Output: 
+------+
| num  |
+------+
| null |
+------+
Explanation: There are no single numbers in the input table so we return null.
 
Seen this question in a real interview before?
1/6
Yes
No
Accepted
665,043/916.3K
Acceptance Rate
72.6%
Topics
icon
Companies
Discussion (141)


Choose a type

















Read more
Copyright © 2026 LeetCode. All rights reserved.

1.1K


141

2 Online
MySQL
Auto




select(select num from mynumbers group by num having count(num)=1 order by num desc limit 1) as num;
1
Saved
You must run your code first
Search questions


Accepted — reading current code…