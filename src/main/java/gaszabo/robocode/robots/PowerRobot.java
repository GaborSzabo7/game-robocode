package gaszabo.robocode.robots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class PowerRobot extends Robot {

	@Override
	public void run() {
		while (true) {
			ahead(20);
			turnRight(36);
		}
	}

	public void onScannedRobot(ScannedRobotEvent scannedRobotEvent) {
		fire(10);
	}
	
}
