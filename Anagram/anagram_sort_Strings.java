//so anagram means if two strings contains the same alphabets with same count it is 
//called an anagram 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();//taking two strings
		String s2=s.nextLine();
		if(s1.length()==s2.length()){ //checking if two strings are of same length if yes continue
		    char st1[]=s1.toCharArray(); //storing the two strings into two different array 
		    char st2[]=s2.toCharArray();
		    Arrays.sort(st1); //sorting them in alphabetical order  
		    Arrays.sort(st2);
		    if(Arrays.equals(st1,st2)) //comparing  if each char is same or not in both strings as both are sorted
		    System.out.println("it is Anagram");
		    else
		    System.out.println("it is not a Anagram");
		}
      //if both are not of same length then it is not a anagram 
		else{
		    System.out.println("it is not a Anagram");
		}
	}
}
//the overall time complexity of your code is O(N * log(N)), where N is the length of the longest input string.
//the overall space complexity of your code is O(N), where N is the length of the longest input string.
