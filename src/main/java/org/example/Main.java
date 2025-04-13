package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking){
            return clock > 0 && (clock < 8 || clock > 20);
        }
        return isBarking;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge > 12 && firstAge <20) {
            return true;
        } else if (secondAge > 12 && secondAge <20) {
            return true;
        } else if (thirdAge > 12 && thirdAge <20) {
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }

    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0) {
           return -1;
       }
        return width * height;
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
