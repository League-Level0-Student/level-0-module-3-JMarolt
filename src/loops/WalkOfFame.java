
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		rob.hide();
		rob.penDown();
		rob.setPenColor(250, 250, 0);
		rob.setX(50);
		rob.setY(250);
		rob.setSpeed(500);
		for (int i = 0; i < 16; i++) {
			rob.setRandomPenColor();
			rob.setAngle(90);
			for (int robot = 0; robot < 5; robot++) {
				rob.move(50);
				rob.turn(144);
			}
		
			rob.move(50);
		}
	}
	// You also need to show the robot to see the result of this line.

	// 2. Make the robot draw a star shape. Hint: 144.

	// 3. Set the size of the star to 30.

	/** THE CHALLENGE: **/
	/*
	 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
	 * 
	 * Hint: The distance between stars is 50.
	 */

}
