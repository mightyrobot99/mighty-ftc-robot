package org.voltron.training.exercise;

import java.util.HashMap;
import java.util.Map;

public class TriangleMovement {
    private static final String LEFT_MOTOR_KEY = "leftMotor";
    private static final String RIGHT_MOTOR_KEY = "rightMotor";
    private static final String LEFT_MOTOR_VALUE = "LEFT_MOTOR";
    private static final String RIGHT_MOTOR_VALUE = "RIGHT_MOTOR";
    private Map<String, String> hardwareMap;

    public void move() {
        hardwareMap = new HashMap<>(2);
        hardwareMap.put(LEFT_MOTOR_KEY, LEFT_MOTOR_VALUE);
        hardwareMap.put(RIGHT_MOTOR_KEY, RIGHT_MOTOR_VALUE);

        String leftMotor = hardwareMap.get(LEFT_MOTOR_KEY);
        String rightMotor = hardwareMap.get(RIGHT_MOTOR_KEY);


        //1 1
        System.out.println("I am " + leftMotor + " ON");
        System.out.println("I am " + rightMotor + " ON");
        //sleep for 2000ms
        System.out.println(sleep(leftMotor, 2000));
        System.out.println(sleep(rightMotor, 2000));
        //1 0
        System.out.println("I am " + leftMotor + " ON");
        System.out.println("I am " + rightMotor + " OFF");
        //sleep for 500ms
        System.out.println(sleep(leftMotor, 500));
        System.out.println(sleep(rightMotor, 500));
        //1 1
        System.out.println("I am " + leftMotor + " ON");
        System.out.println("I am " + rightMotor + " ON");
        //sleep for 2000ms
        System.out.println(sleep(leftMotor, 2000));
        System.out.println(sleep(rightMotor, 2000));
        //1 0
        System.out.println("I am " + leftMotor + " ON");
        System.out.println("I am " + rightMotor + " OFF");
        //sleep for 875ms
        System.out.println(sleep(leftMotor, 875));
        System.out.println(sleep(rightMotor, 875));
        //1 1
        System.out.println("I am " + leftMotor + " ON");
        System.out.println("I am " + rightMotor + " ON");
        //sleep for 2800ms
        System.out.println(sleep(leftMotor, 2800));
        System.out.println(sleep(rightMotor, 2800));
    }

    private String sleep(String motorName, int sleepTime) {
        return "I am " + motorName + " " + "sleeping for " + sleepTime + " milliseconds";
    }
}