package gaszabo.robocode.robots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class SimpleRobot extends Robot {

	@Override
	public void run() {
		while (true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

}
