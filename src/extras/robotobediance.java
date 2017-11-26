package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robotobediance {
	public static void main(String[] args) {
String question = JOptionPane.showInputDialog("Which shape do you want the robot to draw?");	
		if(question.equals("square")) {
		
		Robot Rob = new Robot();
		Rob.penDown();
		Rob.setRandomPenColor();
		Rob.setSpeed(20);
		for(int i = 0;i<4;i++) {
		Rob.move(150);
		
		Rob.turn(90);
		}
		}
		if(question.equals("triangle")) {
			Robot Rob = new Robot();
			Rob.penDown();
			Rob.setRandomPenColor();
			Rob.setSpeed(20);
			for(int i = 0;i<3;i++) {
				Rob.turn(120);
				Rob.move(150);
				
			}
		}
		
		if(question.equals("circle")) {
			Robot Rob = new Robot();
			Rob.penDown();
			Rob.setRandomPenColor();
			Rob.setSpeed(50);
			for(int i=0;i<100;i++) {
Rob.move(2);
Rob.turn(1);
		}
	
	
	
	}
	
}
}