package _02_robot_graffiti;



import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=JOptionPane.showInputDialog("What is your favorite color, mate?");
JOptionPane.showMessageDialog(null, "Well, "+input+" is my favorite color too!");

Robot Jeff = new Robot();
Jeff.setSpeed(100);
Jeff.penDown();
Jeff.turn(45);
Jeff.move(200);
Jeff.turn(90);
Jeff.move(200);
Jeff.turn(135);
Jeff.move(300);
	}

}
