package com.biz.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i값이 0부터 1씩 증가하는 동안
		for(int i = 0; i < 5; i++) {
			
		}

		int j = 0;
		for(;; ) {
			j++;
			if(j >= 5) {
				break;
			}
		}
		
		int k = 0;
		// k<5 : if(k>=5) break;
		for(;k<5; k++) {
			
		}
		int intSum = 0;
		for(int l = 0; l < 5; l++) {
			System.out.println("L: " + l);
			intSum = intSum + l;
		}
		System.out.println(intSum);
		
	}

}
