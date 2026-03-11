package com.arrays;

public class Max_Min_Finding {
	void main() {

		int[] marks = { 97, 90, 75, 74, 65, 63 };
		int max = marks[0];
		int min = marks[0];
	
		int secoundMax=0;
		int secoudmin=0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				secoundMax = max;
				max=marks[i];
				
			}else if(marks[i]!=max &&marks[i]>secoundMax ) {
				secoundMax=marks[i];
			}
			if (marks[i] < min) {
				min = marks[i];
			}
		}
		System.out.println("Maximum marks=" + max);
		System.out.println("minimun marks=" + min);
		System.out.println("secound max:"+secoundMax);
	}
}
