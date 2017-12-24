package extras;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
	int option = 	JOptionPane.showOptionDialog(null, "choose", "horoscope", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String [] {"Aries"  ,"Taurus","Gemini", "Cancer","Leo" , "The Maiden", "The Scales", "The Scorpion", "The Centuar","The Mountain Goat" ,"The Man who Carries Water" , "The Fish"}, null);
		System.out.println(option);
if(option == 0)	{
	JOptionPane.showMessageDialog(null, "While you may be comfortable with your environment, you could receive an unmistakable signal that it's time for change. This could involve a different job, allowing you to make use of skills and talents that have been lying fallow. Don't let small but necessary tasks make you abandon a new course of action. It represents a vital stage in your personal growth.");
}
		if(option == 1) {
			JOptionPane.showMessageDialog(null, "Sudden financial success could produce upheaval in your lifestyle. Therefore, rethink your current situation and consider the pursuit of cherished old dreams that you may have abandoned. Spiritual goals and interests may change. Old friends could be left behind and new friendships begun. It's important to remember that once you embark on this new path, there'll be no turning back.");
		}
		if(option == 2) {
			JOptionPane.showMessageDialog(null,"You spend much of your life serving others. Now you may reevaluate your \"duty\" toward them. Perhaps someone is taking unfair advantage of your good nature. Perhaps you're finally experiencing desires that you feel you have to fulfill. Look objectively at your situation without feeling guilt, sorrow, or the fear of losing a friend. Your happiness matters, too!" );
		}
		if(option ==3) {
			JOptionPane.showMessageDialog(null, "You always see both sides of a situation clearly. Today you might judge possible future courses of action in view of the past. Prior values may be put to the test and former opinions revised. You could consider ending a relationship or entering a new one. This may take effort, but it will set the stage for future success."); 		
		}
		if(option == 4) {
			JOptionPane.showMessageDialog(null, "Someone you've known for a long time may disappear from your life. This could leave you feeling disoriented and unfocused. Your ideas of truth, honor, ethics, and morality might require some revision in light of recent events. A change of profession might be looming on the horizon. On the positive side, you're in the process of transcending your limitations. Follow your heart.");
		}
}
}