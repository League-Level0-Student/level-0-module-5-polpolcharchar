package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	int num1 = 0;
	int num2 = 1;
	int sum;
	System.out.println(num1);
	System.out.println(num2);
	
	for(int i = 0;i<30;i++) {
		sum = num1+num2;
		System.out.println(sum);
		num1 = num2;
		num2 = sum;
	}
	
	
	
	
	
}
}
