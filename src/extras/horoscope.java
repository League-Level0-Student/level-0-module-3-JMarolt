package extras;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
	int option = 	JOptionPane.showOptionDialog(null, "choose", "horoscope", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String [] {"Aries"  ,"Taurus","Gemini", "Cancer","Leo" , "Virgo", "Libra", "Scorpio", "Sagittarius","Capricorn" ,"Aquarius" , "Pisces"}, null);
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
		if(option == 5) {
			JOptionPane.showMessageDialog(null,"Though communication is one of your strong points, today you might find it hard. You may feel introspective, but open, honest discussion could be what you need now. Your long-held ideas and values are changing, and you might require guidance to put your new beliefs to work. A search for truth is in your future, and you'll want some companions along the way." );
		}
		if(option == 6) {
			JOptionPane.showMessageDialog(null, "Stress-related health complaints could force reevaluation of your current situation, particularly your job. You may take a good look at your skills and consider how they can be put to use in other fields. Communication from distant places may bring new opportunities to pursue old ambitions. Don't write them off right away. Change is in the wind. It isn't wise to try to stop it.");
		}
		if(option == 7) {
			JOptionPane.showMessageDialog(null, "Your inner child surfaces today. Memories of past good times bring out your playful side. You might want to try forms of amusement that you once enjoyed but have long since abandoned. Children provide inspiration and outlet for this energy. Tell them stories about your own childhood or read to them. Indulge your flights of fancy. You can always face reality tomorrow.");
					
				
		}
		if(option == 8) {
			JOptionPane.showMessageDialog(null, "Renegotiating relationships may cause sorrow today. You may find that trying to fix one won't work. Past emotions that have created difficulties may resurface. Releasing them could bring the courage to move on. Bonds with others are like matter and energy. They can be changed, but they can't be created or destroyed. Whatever form it takes, a true bond will always be there.");
					
				
		}
		if(option == 9) {
			JOptionPane.showMessageDialog(null, "Today you might put aside your usual tendency to push ahead without a backward glance. You could reconsider past ideas and see them in an entirely new light. Circumstances may force reevaluation of your current job or lifestyle. Or you could contemplate a move. Contact with a sibling or neighbor may be restored. Today is all about adjustment.");
					
				
		}
		if(option == 10) {
			JOptionPane.showMessageDialog(null, "Aquarians are among the friendliest of the signs, making friends everywhere. They are often chosen among co-workers and family for special awards and honors because of their ability to network. Highly intelligent they are energetic and talented, often using their abilities to help others. Despite their extensive people skills, they often crave alone time to reflect and think about things. Meditation is recommended for this sign as it helps to maintain that sense of alone time, while at the same time a feeling of connectedness with something greater than themselves.");	
				
		}
		if(option == 11) {
			JOptionPane.showMessageDialog(null, "Pisces are empathetic people, often feeling badly for someone whose life is not going well. They feel the need to reach out to those who are less fortunate and will often find themselves involved in drama that they hadn’t intended. They are kind, caring individuals who feel everything deeply, even though you would not know it on the surface. They can be creative and imaginative when they believe that they have support to make those leaps");
					
				
		}
}
}