package org.neww;

public class PalindromeOrNot {
public static void main(String[] args) {
	int num = 242;
	
	int rem = 0;
	
	int res = 0;
	
	int n= num;
	
	while (num>0) {
	
		rem = num%10;
		
		res = (res*10)+rem;
		
		num = num/10;
	}	
	if (n==res) {
		System.out.println("palindrome");
	} else {
         System.out.println("Not Palindrome");
	}
	
}
}
