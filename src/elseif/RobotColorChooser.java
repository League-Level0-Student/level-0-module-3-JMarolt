 
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot Rob = new Robot();
		for (int coloor = 0; coloor < 4; coloor++) {
			// 3. ask the user what color they would like the robot to draw
			String color = JOptionPane.showInputDialog("What color would you like to draw?");
			// 4. use an if/else statement to set the pen color that the user requested
			if (color.equals("red")) {
				Rob.setPenColor(250, 0, 0);
			}
			if (color.equals("green")) {
				Rob.setPenColor(0, 250, 0);
			}
			if (color.equals("blue")) {
				Rob.setPenColor(0, 0, 250);

			}
			// 5. if the user doesn’t enter anything, choose a random color
			if (color.equals("")) {
				Rob.setRandomPenColor();

			}
			// 6. put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. set the pen width to 10
			Rob.setPenWidth(10);
			// 1. make the robot draw a shape (this will take more than one line of code)
			for (int i = 0; i < 4; i++) {
				Rob.penDown();
				Rob.setSpeed(10);
				Rob.move(90);
				Rob.turn(90);
			}
		}
	}
}