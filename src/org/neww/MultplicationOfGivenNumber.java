package org.neww;

public class MultplicationOfGivenNumber {
public static void main(String[] args) {
	int num = 196;
	
	int rem = 0;
	
	int res = 1;
	
	while (num>0) {
		rem = num%10;
		res = rem*res;
		num = num/10;
	}
	System.out.println(res);
}
}
