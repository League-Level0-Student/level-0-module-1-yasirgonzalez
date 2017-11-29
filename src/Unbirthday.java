import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	//iuhuyhuyhuy
	String birthday=JOptionPane.showInputDialog("What's your birthday");
	if(birthday.equals("11/29")) {
	JOptionPane.showMessageDialog(null,"Happy Brithday");
	}
	else{
		JOptionPane.showMessageDialog(null,"Happy unbrithday");
	}

}
}
