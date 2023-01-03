# Robot-ExceptionHandling

In this program there are three classes
- Grid (the place where Robots to move) contains two properties 
     - maximum X coordinate 
     - maximum Y coordinate
-RobotPositon that has three properties
     - X coordinate
     - Y coordinate
     - and the direction
-RobotMovement class which has a composition with Grid and RobotPosition  it takes a series of characters to move the robot
if the character is other than L,R and M it throws inVallid exception
and it also throws exception if it reached the boundaries and is trying to move forward
