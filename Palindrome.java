package com.interview.lists;
//Palindrome number in java:
//A palindrome number is a number that is same after reverse. 
//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
//It can also be a string like LOL, MADAM etc.
public class Palindrome {
	public static void main(String[] args) {
		String str="MADAM";
		int orignal=3553;
		palindromeInt(orignal);
		boolean res=pal(str);
		System.out.println(res);
		palindrome(str);
	}

	private static void palindromeInt(int orignal) {
        int rev=0,remain;
        int num=orignal;
        while(num!=0) {
        	remain=num%10;
        	rev=rev*10+remain;
        	num=num/10;
        }
        if(rev==orignal) {
        	System.out.println("hurray ");
        }
        else {
        	System.out.println("ssad ");
        }
	}

	private static void palindrome(String str) {
		String rev="";
		int n=str.length()-1;
		for(int i=n;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println(rev+" yes");
		}
		else {
			System.out.println(rev+" no");
		}
	}

	private static boolean pal(String str) {
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			if(str.charAt(l)!=str.charAt(r)) {
				return false;
			}
			
         l++;
         r--;
		}
       return true;
	}

}
