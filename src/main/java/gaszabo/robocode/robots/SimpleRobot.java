package gaszabo.robocode.robots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class SimpleRobot extends Robot {

	@Override
	public void run() {
		while (true) {
			ahead(20);
			turnRight(36);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

}
