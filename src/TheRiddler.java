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
		JOptionPane.showMessageDialog(null, "Correct, you now have "+score+" points");
	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect, the answer is your name");
	}
	String riddlethree=JOptionPane.showInputDialog("If you eat me, my sender would eat you what am I?");
	if(riddlethree.equals("a hook")) {
		score=score+1;
		JOptionPane.showMessageDialog(null, "Correct, now you have "+score+" points");
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong, the correct answer is a hook");
	}
	String riddlefour=JOptionPane.showInputDialog("what is as light as a feather put not even the worlds strongest man can hold it under a minute");
	if(riddlefour.equals("air")) {
		score=score+1;
		JOptionPane.showMessageDialog(null, "Good job it is correct, you now have "+score+" points");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nope, the right answer is air");
	}
	String riddlefive=JOptionPane.showInputDialog("Last one,Imagine you are in a dark room. How do you get out?");
	if(riddlefive.equals("stop imagining")) {
		score=score+1;
		JOptionPane.showMessageDialog(null, "Correct, now lets check you score ->");
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong, the right answer is stop imagining, now lets see how you did ->");
	}
	// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "you have a total amount of " +score+ " points");
	}
}

