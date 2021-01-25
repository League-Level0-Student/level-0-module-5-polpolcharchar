package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Command {
	static Robot rob = new Robot();
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("Choose a color: Blue or Red");
	if(color.equalsIgnoreCase("Blue")) {
		rob.setPenColor(0, 0, 255);
	}
	else if(color.equalsIgnoreCase("Red")) {
		rob.setPenColor(255, 0, 0);
	}
	
	
	
	
	
	String shape = JOptionPane.showInputDialog("Choose a shape");
	if(shape.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if(shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}
}


static void drawSquare() {
	
	rob.penDown();
	rob.setSpeed(100);
	for(int i = 0;i<4;i++) {
		rob.move(100);
		rob.turn(90);
	}
	}

static void drawTriangle() {
	
	rob.penDown();
	rob.setSpeed(100);
	for(int i = 0;i<3;i++) {
		rob.move(100);
		rob.turn(120);
	}
		
}

static void drawCircle() {
	
	rob.penDown();
	rob.setSpeed(100);
	for(int i = 0;i<360;i++) {
		rob.move(1);
		rob.turn(1);
	}
}

}






