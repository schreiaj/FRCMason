/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

/**
 *
 * @author aschreiber
 */
public class Globals {

    private static double ticsPerSecond = .1;
    private static int highGoalAutonPoint = 6;
    private static int middleGoalAutonPoint = 5;
    private static int lowGoalAutonPoint = 4;
    private static int highGoalTelePoint = 3;
    private static int middleGoalTelePoint = 2;
    private static int lowGoalTelePoint = 1;
    private static int pyramidGoalTelePoint = 5;
    private static int lowHang = 10;
    private static int midHang = 20;
    private static int highHang = 30;
    private static double highAutonShootDifficulty = 60;
    private static double middleAutonShootDifficulty = 40;
    private static double lowAutonShootDifficulty = 30;
    private static double highTeleShootDifficulty = 60;
    private static double middleTeleShootDifficulty = 40;
    private static double lowTeleShootDifficulty = 30;
    private static double pyramidTeleShootDifficulty = 90;
    private static double averageShootTime = .75;

    public static double getTicsPerSecond() {
        return Globals.ticsPerSecond;
    }

    public static int getHighGoalAutonPoint() {
        return Globals.highGoalAutonPoint;
    }

    public static int getMiddleGoalAutonPoint() {
        return Globals.middleGoalAutonPoint;
    }

    public static int getLowGoalAutonPoint() {
        return Globals.lowGoalAutonPoint;
    }

    public static int getHighGoalTelePoint() {
        return Globals.highGoalTelePoint;
    }

    public static int getMiddleGoalTelePoint() {
        return Globals.middleGoalTelePoint;
    }

    public static int getLowGoalTelePoint() {
        return Globals.lowGoalTelePoint;
    }

    public static int getPyramidGoalTelePoint() {
        return Globals.pyramidGoalTelePoint;
    }

    public static int getLowHang() {
        return Globals.lowHang;
    }

    public static int getMidHang() {
        return Globals.midHang;
    }

    public static int getHighHang() {
        return Globals.highHang;
    }

    public static double getHighAutonShootDifficulty() {
        return Globals.highAutonShootDifficulty;
    }

    public static double getMiddleAutonShootDifficulty() {
        return Globals.middleAutonShootDifficulty;
    }

    public static double getLowAutonShootDifficulty() {
        return Globals.lowAutonShootDifficulty;
    }

    public static double getHighTeleShootDifficulty() {
        return Globals.highTeleShootDifficulty;
    }

    public static double getMiddleTeleShootDifficulty() {
        return Globals.middleTeleShootDifficulty;
    }

    public static double getLowTeleShootDifficulty() {
        return Globals.lowTeleShootDifficulty;
    }

    public static double getPyramidTeleShootDifficulty() {
        return Globals.pyramidTeleShootDifficulty;
    }

    public static double getAverageShootTime() {
        return Globals.averageShootTime;
    }
}
