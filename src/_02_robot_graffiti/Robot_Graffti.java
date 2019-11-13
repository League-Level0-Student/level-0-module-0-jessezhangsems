package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffti {
public static void main(String[] args) {
	Robot Jeff = new Robot();
	Jeff.setSpeed(10);
	Jeff.penDown();
	Jeff.moveTo(50,50);
	Jeff.turn(90);
	Jeff.move(100);
	Jeff.turn(180);
	Jeff.move(50);
	Jeff.turn(270);
	Jeff.move(200);
	Jeff.turn(90);
	Jeff.move(50);
	Jeff.turn(180);
	Jeff.move(50);
	Jeff.turn(270);
	Jeff.move(200);
	Jeff.moveTo(200, 50);
	Jeff.turn(90);
	Jeff.move(100);
	Jeff.turn(180);
	Jeff.move(100);
	Jeff.turn(270);
	Jeff.move(200);
	Jeff.turn(270);
	Jeff.move(100);
	Jeff.turn(180);
	Jeff.moveTo(200, 150);
	Jeff.turn(180);
	Jeff.move(100);
	Jeff.moveTo(400, 50);
	Jeff.move(100);
	Jeff.moveTo(400, 50);
	Jeff.turn(100);
	Jeff.setAngle(180);
}
}
