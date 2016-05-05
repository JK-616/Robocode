package barbarossa;

import robocode.Robot;

public class Basic extends Robot {
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }
    
    public void onScannedRobot(robocode.ScannedRobotEvent e) {
        fire(1);
    }
}