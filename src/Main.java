import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        RobotPosition robotPosition= new RobotPosition(0,0,'N');
        Grid grid = new Grid(5,5);
        RobotMovement robotMovement = new RobotMovement(robotPosition,grid);
        try{
            robotMovement.moveRobot("RMMMMM");
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            //will throw an exception since U is not a valid Instruction
            robotMovement.moveRobot("U");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}