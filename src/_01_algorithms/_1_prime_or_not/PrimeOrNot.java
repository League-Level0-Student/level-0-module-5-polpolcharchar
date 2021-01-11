package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
	
	int multiples = 0;
	for(int i = 1;i<number;i++) {
		if(number%i==0) {
			multiples = multiples + 1;
		}
	}
	if(multiples>1) {
		JOptionPane.showMessageDialog(null, "This number is not prime!");
	}
	else{
		JOptionPane.showMessageDialog(null, "This number is prime!");
	}
	
	
	
	
	
	
	
}
}
