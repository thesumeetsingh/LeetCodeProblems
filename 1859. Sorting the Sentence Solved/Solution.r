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
1859. Sorting the Sentence
Solved
Easy
Topics
premium lock icon
Companies
Hint
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 

Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.
 
Seen this question in a real interview before?
1/6
Yes
No
Accepted
249,570/296.3K
Acceptance Rate
84.2%
Topics
icon
Companies
Hint 1
Hint 2
Similar Questions
Discussion (38)


Choose a type















Read more









Copyright © 2026 LeetCode. All rights reserved.

2.4K


38

9 Online
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
s =
"is2 sentence4 This1 a3"
Stdout
This is a sentence
Output
"This is a sentence"
Expected
"This is a sentence"
Contribute a testcase


All Submissions

Accepted
45 / 45 testcases passed
Sumeet Singh
Sumeet Singh
submitted at Sep 08, 2026 20:53

Analysis

Solution
1024
👑 Unlock the Full LeetCode Experience
Company problems, Ask Leet, and expert editorials — all in one plan.
Runtime
2
ms
Beats
16.76%
Memory
42.26
MB
Beats
98.71%
Code
Java
class Solution {
    public String sortSentence(String s){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }

        }
        String words[]=new String[count+1];
        
        for(int i=0;i<s.length();i++){
            count=0;
            while(i<s.length() && s.charAt(i)!=' '){
                sb.append(s.charAt(i));
                i++;
                count++;
            }
            int index=sb.charAt(count-1)-'0';
            sb.deleteCharAt(count-1);
            words[index-1]=sb.toString();
            sb.delete(0,count);
        }
        
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            sb.append(' ');
        }
        count=sb.length();
        sb.deleteCharAt(count-1);
        System.out.println(sb);
        return sb.toString();
    }

}
View more
 
More challenges
2042. Check if Numbers Are Ascending in a Sentence

Write your notes here

Select related tags
0/5
Search questions


Submit
Ctrl
Enter
Submit
Ctrl
Enter
Accepted — reading current code…