package com.interview.lists;
//sort a string
public class SortString {
	public static void main(String[] args) {
		String s="prepByte";
		sort(s);
	}
 //counting sort algorithm
	private static void sort(String s) {
		int arr[]= new int[26];
		s=s.toLowerCase();
		for(char ch:s.toCharArray()) {
			arr[ch-'a']++;
		}
		for(int i=0;i<26;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.print((char)(i+'a'));
			}
		}
	}
}
//Certainly! Let's go through the nested loops step by step with an example:
//
//Suppose we have the input string "geeksforgeeks".
//
//Initialization:
//i is initialized to 0.
//The outer loop runs while i is less than MAX_CHAR, which is 26 in this case.
//j is initialized to 0.
//Outer Loop (i):
//For each iteration of the outer loop, we're going to deal with a particular character represented by i + 'a'.
//For i = 0, i + 'a' represents the character 'a'.
//For i = 1, i + 'a' represents the character 'b'.
//And so on until i = 25, where i + 'a' represents the character 'z'.
//Inner Loop (j):
//Now, for each character represented by i + 'a', we're going to print it letters[i] times.
//letters[i] contains the count of the character in the input string.
//For i = 0, letters[0] would contain the count of 'a' in the input string.
//For i = 1, letters[1] would contain the count of 'b' in the input string.
//And so on until i = 25.
//Printing Characters:
//For each character represented by i + 'a', we print it letters[i] times.
//This means, if the count of the character is 0, we don't print it. If it's greater than 0, we print it letters[i] times.
//We continue this process for each character from 'a' to 'z'.
//Now, let's apply this step by step with the input string "geeksforgeeks":
//
//For i = 0, which represents 'a', letters[0] is 0. So 'a' is not printed.
//For i = 1, which represents 'b', letters[1] is 0. So 'b' is not printed.
//For i = 2, which represents 'c', letters[2] is 0. So 'c' is not printed.
//For i = 3, which represents 'd', letters[3] is 0. So 'd' is not printed.
//For i = 4, which represents 'e', letters[4] is 4. So 'e' is printed 4 times.
//For i = 5, which represents 'f', letters[5] is 1. So 'f' is printed 1 time.
//For i = 6, which represents 'g', letters[6] is 2. So 'g' is printed 2 times.
//And so on...
//Following this logic, the output for the input string "geeksforgeeks" would be "eeeefggkkorss".

 
