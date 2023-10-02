/*
this is no 58 question in leetcode
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.*/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String t=s.nextLine();
	    int c=0;
        for(int i=t.length()-1;i>=0;i--){ //reading from back to slove easy 
          if(t.charAt(i)!=' '){ // if space is there we just avoid it and if not then we increment c++ 
            c++;

          }
          if(t.charAt(i)==' '&& c>0){ //if we found space after c is greater than 0 then we break the loop and print c value 
              break;
          }
        }
       System.out.println(c);
	}
}
