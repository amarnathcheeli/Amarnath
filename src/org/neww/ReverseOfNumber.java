package org.neww;

public class ReverseOfNumber {
public static void main(String[] args) {
	int num = 34;
	int rem = 0;
	int res = 0;
	
	while (num>0) {
		rem = num%10;
		res = (res*10)+rem;
		num = num/10;
	}
	System.out.println(res);
	
}
}
