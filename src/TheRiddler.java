import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
         int score=0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle=JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("incorrectly")) {
	score=score+1;
	JOptionPane.showMessageDialog(null, "Correct, you have now " +score+ " points");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong :(, the answer is incorrectly");
}
		// 6. Add some more riddles
String riddletwo=JOptionPane.showInputDialog("What belongs to you but other people use it more?");
	if(riddletwo.equals("your name")) {
		score=score+1;
		JOptionPane.showMessageDialog(null, "Coreect, you now have "+score+" points");
	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "you have "+score);
	}
}

