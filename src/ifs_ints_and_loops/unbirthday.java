package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("give me your birthday son");
		if(bday.equals("05/22")) {
			JOptionPane.showMessageDialog(null,"happy birthday you hobo");
			
		}
		else { 			JOptionPane.showMessageDialog(null,"you silly hobo its not yur birthday");
		JOptionPane.showMessageDialog(null,"nobody loves u");

			
		}
	}
}