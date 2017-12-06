import javax.swing.JOptionPane;

public class remarkable {
	
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what is your name");
	if(name.equals("Victor")) {
		JOptionPane.showMessageDialog(null,"Hello Victor, you are great at codeing and a great base player");
	}
	else if(name.equals("Yasir")) {
		JOptionPane.showMessageDialog(null,"Hello Yasir, you are the best tumpet player and the boss. Also your name means rich ;)");
		
	}else if(name.equals("Max")) {
		JOptionPane.showMessageDialog(null,"Hello Max, you are a great coder you type like if a cheetah was running on you key board");
    }else if(name.equals("Emil")) {
	JOptionPane.showMessageDialog(null,"Hello Emil, good job, you are a great sax player");
    }else if(name.equals("Callum")) {
		JOptionPane.showMessageDialog(null,"Hello Callum, amazing job, you are a great baritone player");
    }else if(name.equals("Lauren")) {
			JOptionPane.showMessageDialog(null,"Hello Lauren, great job, you are a great sax player");
    }else if(name.equals("Cruz")) {
				JOptionPane.showMessageDialog(null,"Hello Cruz, good job you are good at beging though"); 
    }else {
    	JOptionPane.showMessageDialog(null,"hello, great job, else you look great");
    }
}
}