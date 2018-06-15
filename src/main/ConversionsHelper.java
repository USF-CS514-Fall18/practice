package main;

/**
 * A class to help with several common conversions.
 * @author srollins
 *
 */
public class ConversionsHelper {

    /**
     * Converts ounces to gallons.
     * One gallon is 128 ounces.
     *
     * @param ounces
     * @return
     */
    public static double ouncesToGallons(int ounces) {
        //TODO: Replace with your code.
        return 0;
    }

    /**
     * Converts centimeters to feet.
     * One foot is 30.48 cm.
     *
     * @param cm
     * @return
     */
    public static double cmToFeet(int cm) {
        //TODO: Replace with your code.
        return 0;
    }

    public static void main(String[] args) {
        int ounces = 10;
        int cm = 100;
        System.out.println(ounces + " ounces = " + ConversionsHelper.ouncesToGallons(ounces) + " gallons.");
        System.out.println(cm + " cm = " + ConversionsHelper.cmToFeet(cm) + " feet.");
    }
}
