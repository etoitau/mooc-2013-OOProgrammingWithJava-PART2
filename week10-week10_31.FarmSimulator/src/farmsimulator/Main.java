package farmsimulator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());


        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);
    }
    
    public static String rounded(double num, int deci) {
        // made this to match example output in spec
        // but test suite wants different output, so not used, but saved for later...
        // tanks to https://stackoverflow.com/a/22186845/11517662
        int scale = (int) Math.pow(10, deci);
        return "" + (double) Math.round(num * scale) / scale;
    }
}
