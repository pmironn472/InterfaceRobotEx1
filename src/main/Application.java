package main;

import robo.*;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {


        AbstractRobot IronManMark_32 = RobotFactory.getRobot("IronMan","charlie");



        System.out.printf("Simple test passed %d%%\n", ChargeTest.chargeTest((CharlieRobot)IronManMark_32));
        System.out.println();
        System.out.println();
        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(IronManMark_32));
        System.out.println();
        System.out.println();
        System.out.printf("Simple test passed %d%%\n", DiagonalWalkTest.diagonalWalkTest((CharlieRobot)IronManMark_32));



//
//        System.out.println();
//        System.out.println();
//
//        System.out.printf("Simple test passed %d%%\n", DiagonalWalkTest.diagonalWalkTest(IronManMark_33));


    }
}
