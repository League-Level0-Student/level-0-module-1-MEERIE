import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password = "123";
	String thingy = JOptionPane.showInputDialog("enter an amount of cash plz");
	String pin = JOptionPane.showInputDialog( " plz enter your pin ");
	if (pin.equals(password)) {
		JOptionPane.showMessageDialog(null,"you have $" + thingy + " in your account");
		JOptionPane.showMessageDialog(null,"it seems you have been hacked");
		JOptionPane.showMessageDialog(null,"pay 100000000000000000000 to restore your account");
		JOptionPane.showMessageDialog(null,"sorry");




	}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER");
		JOptionPane.showMessageDialog(null, "we are reporting u to fortnite in ");
		JOptionPane.showMessageDialog(null, "3");
		JOptionPane.showMessageDialog(null, "2");
		JOptionPane.showMessageDialog(null, "1");
	}
}
		
	}
