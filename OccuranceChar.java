package com.interview.lists;
//remove occurance of c from the string
public class OccuranceChar {
   public static void main(String[] args) {
	String str="cloudTech";
	char ch='c';
	System.out.println(str.replaceAll("c", ""));
	removeOccurance(str,ch);
}

private static void removeOccurance(String str, char ch) {
	String res="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!='c') {
			res+=str.charAt(i);
		}
	}
	System.out.println(res);
}
}
