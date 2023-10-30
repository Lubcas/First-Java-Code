public class RobotController {
    // Variables
    private int batteryLevel;
    private boolean isMoving;
    private String robotName;

    // Constructor
    public RobotController(String robotName, int initialBatteryLevel) {
        this.robotName = robotName;
        this.batteryLevel = initialBatteryLevel;
        this.isMoving = false; // Assuming the robot starts not moving
    }

    // Display the status of the robot
    public void displayStatus() {
        System.out.println("Robot Status:");
        System.out.println("Name: " + robotName);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Moving: " + isMoving);
        System.out.println();
    }

    // Charge the robot's battery
    public void chargeBattery(int amount) {
        batteryLevel += amount;

        // Cap the battery level at 100
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }

        System.out.println("Battery charged. New battery level: " + batteryLevel + "%");
    }

    // Move the robot
    public void moveRobot() {
        if (batteryLevel >= 20) {
            // Move the robot
            isMoving = true;
            System.out.println("Robot is moving.");

            // Consume battery power
            batteryLevel -= 10; // Change the value to whatever
            System.out.println("Battery level after moving: " + batteryLevel + "%");
        } else {
            System.out.println("Low battery, unable to move.");
        }
    }

    // Stop the robot
    public void stopRobot() {
        if (isMoving) {
            isMoving = false;
            System.out.println("Robot has stopped.");
        } else {
            System.out.println("Robot is not moving");
        }
    }

    // Other methods...

    public static void main(String[] args) {
        // Example usage in the main method (you can customize this part)
        RobotController myRobot = new RobotController("Bobot", 50);
        myRobot.displayStatus();

        myRobot.chargeBattery(30);
        myRobot.displayStatus();

        myRobot.moveRobot();
        myRobot.displayStatus();

        myRobot.stopRobot();
        myRobot.displayStatus();
    }
    public void turnRobot(String direction) {
        if (isMoving) {
            System.out.println("turning" + direction);
        }
        else {
            System.out.println ("robot is not moving");
        }
    }
    public void checkSensors () {
        System.out.println ("checking sensors");
        //sensor check
    }
}
