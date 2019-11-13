package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello "+input+ "! When the flight attendant said for you to have a safe flight, you totally didn't say you too!");
		JOptionPane.showMessageDialog(null,"Hello "+input+"! When you were at the resturant, you totally didn't ask the waiter for the tip!");
		JOptionPane.showMessageDialog(null,"Hello "+input+"! You aren't a worthless idiot like Alfred said!");
		JOptionPane.showMessageDialog(null,"Hello "+input+"! Just because I say this crud doesn't mean it's not true, "+input);
	}

}
