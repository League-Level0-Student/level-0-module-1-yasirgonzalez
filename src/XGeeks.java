//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String power=JOptionPane.showInputDialog("What do you do best/superpower?");
		
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name=JOptionPane.showInputDialog("What is you name?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
	if(name.equals("Yasir")){
		JOptionPane.showMessageDialog(null, "Your superpower is "+power);
	}
	else if(name.equals("Joan")){
		JOptionPane.showMessageDialog(null, "Your superpower is "+power);
	}
	else if(name.equals("Asher")){
		JOptionPane.showMessageDialog(null, "Your superpower is "+power);
	}
	else if(name.equals("Nicholas")){
		JOptionPane.showMessageDialog(null, "Your superpower is "+power);
	}	
	else if(name.equals("Walter")){
		JOptionPane.showMessageDialog(null, "Your superpower is "+power);
	}
}
}

