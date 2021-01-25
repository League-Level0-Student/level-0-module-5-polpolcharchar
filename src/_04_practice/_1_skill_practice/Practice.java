package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {



public static void main(String[] args) {

Practice skills = new Practice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

JOptionPane.showMessageDialog(null, Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have?"))*10 + " cents");


// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)

int height = Integer.parseInt(JOptionPane.showInputDialog("How tall are you in inches"));



// If they are shorter than 36 inches, tell them to eat their Wheaties

if(height<36) {
	JOptionPane.showMessageDialog(null, "Eat you wheaties!");

}
}
void skill2() { // Write a loop to print every third number between 1 and 30 to the console
for(int i = 1;i<31;i++) {
	if(i%3==0) {
		System.out.println(i);
	}
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console

Random ran = new Random();
int num1 = ran.nextInt(21);
int num2 = ran.nextInt(11);
System.out.println(num1);
// Get another random number that is less than 10 and print it to the console
System.out.println(num2);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
JOptionPane.showMessageDialog(null, "The difference is: " + (num1-num2));


}

void skill4() { // In a pop-up, ask the user for the city they live in
if(JOptionPane.showInputDialog("What city do you live in?").equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego!");
}


// If they answered "San Diego", tell them they live in America's Finest City



// Otherwise, tell them to move to San Diego



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."

int cars = 3;

// If there is 1 car, use a pop-up to display the make/model of the car



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
JOptionPane.showMessageDialog(null, cars*4);


}

void skill5() { // In a pop-up, ask the user for the name of their school

JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog("What school do you go to?") + " is a fantastic school!");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



}
}



