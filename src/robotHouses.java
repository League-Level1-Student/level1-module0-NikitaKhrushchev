import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
public class robotHouses {
public static void main(String[] args) {
	Robot rob = new Robot();
	Random random = new Random();
	rob.move(-200);
	rob.setSpeed(100);
	rob.turn(90);
	
	
	
	rob.move(-400);
	rob.penDown();
	for (int i = 0; i < 20; i++) {
		if (i%2==0) {
		drawTriangleHouse(rob, random);
		}
		else {
			drawHouse(rob,random);
		}
	}
}
static void drawTriangleHouse(Robot rob, Random ran) {
	int r1 = ran.nextInt(255);
	int r2 = ran.nextInt(255);
	int r3 = ran.nextInt(255);
	int r4 = ran.nextInt(170 + 100);
	rob.setPenColor(r1, r2, r3);
	rob.turn(-90);
	rob.move(r4);
	rob.turn(45);
	rob.move(40);
	rob.turn(90);
	rob.move(40);
	rob.turn(45);
	rob.move(r4);
	rob.turn(-90);
	rob.setPenColor(0, 0, 0);
	rob.move(10);
}
static void drawHouse(Robot rob, Random ran) {
	int r1 = ran.nextInt(255);
	int r2 = ran.nextInt(255);
	int r3 = ran.nextInt(255);
	int r4 = ran.nextInt(170 + 100);
	rob.setPenColor(r1, r2, r3);
	rob.turn(-90);
	rob.move(r4);
	rob.turn(90);
	rob.move(80);
	rob.turn(90);
	rob.move(r4);
	rob.turn(-90);
	rob.setPenColor(0, 0, 0);
	rob.move(10);
}
}