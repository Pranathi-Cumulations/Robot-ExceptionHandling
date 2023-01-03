import java.util.ArrayList;
import java.util.List;

class RobotMovement {
    private RobotPosition robotPosition;
    private Grid grid;
    private List<Character> directionsInAntiClockwiseDirection = new ArrayList<>();

    RobotMovement(RobotPosition robotPosition, Grid grid) {
        this.robotPosition = robotPosition;
        this.grid = grid;
        directionsInAntiClockwiseDirection.add('N');
        directionsInAntiClockwiseDirection.add('W');
        directionsInAntiClockwiseDirection.add('S');
        directionsInAntiClockwiseDirection.add('E');
    }

    private void turnLeft() {
        robotPosition.direction = directionsInAntiClockwiseDirection.
                get((directionsInAntiClockwiseDirection.indexOf(robotPosition.direction) + 1) % 4);
    }

    private void turnRight() {


        robotPosition.direction = directionsInAntiClockwiseDirection.
                get((directionsInAntiClockwiseDirection.indexOf(robotPosition.direction) - 1 == -1 ?
                        3 : directionsInAntiClockwiseDirection.indexOf(robotPosition.direction) - 1) % 4);
    }

    public void moveRobot(String instruction) throws Exception {
        for (char ch : instruction.toCharArray()) {
            if (ch == 'M') {
                switch (robotPosition.direction) {
                    case 'N':
                        if (robotPosition.yCoordinate != grid.yMaxCoordinate) {
                            robotPosition.yCoordinate++;
                        }
                        else{
                            throw new Exception("No space to move");
                        }
                        break;
                    case 'S':
                        if (robotPosition.yCoordinate != 0) {
                            robotPosition.yCoordinate--;
                        }
                        else{
                            throw new Exception("No space to move");
                        }

                        break;
                    case 'E':
                        if (robotPosition.xCoordinate != grid.xMaxCoordinate) {
                            robotPosition.xCoordinate++;
                        }
                        else{
                            throw new Exception("No space to move");
                        }
                        break;
                    case 'W':
                        if (robotPosition.xCoordinate != 0) {
                            robotPosition.xCoordinate--;
                        }
                        else{
                            throw new Exception("No space to move");
                        }
                        break;
                }
            } else if (ch == 'L') {
                turnLeft();
            } else if (ch == 'R'){
                turnRight();
            }
            else{
                throw new Exception("Invalid Instruction");
            }
        }
        System.out.println(robotPosition);
    }

}
