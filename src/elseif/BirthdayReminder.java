
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 19th";
		String dadsBirthday = "April 9th";
		String myBirthday = "April 19th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("Which birthday do you want to know?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
		if(bday.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
			
		}
	
			//print mom's birthday
		// 5. if user asked for "dad"
	if(bday.equals("dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
			// print dad's birthday
		// 6. if user asked for your name
		
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
}
	
	if(bday.equals("myself")) {
		JOptionPane.showMessageDialog(null, myBirthday);
}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	}
}
}
