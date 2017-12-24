package extras;

import javax.swing.JOptionPane;

public class AreyouHappy {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Are you happy?");
		if (s.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

		}
		if (s.equals("no")) {
			String z = JOptionPane.showInputDialog("Do you want to be happy?");

			if (z.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			}

			if (z.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}
}