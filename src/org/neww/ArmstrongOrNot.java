package org.neww;

public class ArmstrongOrNot {
public static void main(String[] args) {
	int num = 153;
	
	int n = num;
	
	int rem = 0;
	
	int res = 0;
	
	while (num>0) {
		rem = num%10;
		res = (rem*rem*rem)+res;
		num = num/10;
	}
	if (n==res) {
		System.out.println("Armstrong");
	} else {
        System.out.println("Not Armstrong");
	}
}
}
