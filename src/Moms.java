import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et vilkårligt køb-beløb");

        double koebmaengde = input.nextDouble();

        /*Danish tax(moms) is 25% - therefore 0.25
        Additionally, the reason why we times and divide by 100 is simply to first round down our variable, Moms
        to two digits. */

        double moms = koebmaengde * 0.25;
        double tyskmoms = koebmaengde * 0.16;
        System.out.println("Dansk salgs moms er: " + (int)(plusDanskMoms(moms * 100) / 100) + " kroner");
        System.out.println("Tysk salgs-moms er: " + (int)(plusTyskmoms(tyskmoms * 100) / 100) + " euro");
    }
    /*
       Additionally, we could separate our moms method and make it independant.
       Also for the last task, it was stated to rename our plusMoms to plusDanskMoms - so just be aware that
       I've done the test for both plusMoms and plusDanskmoms.
    */
    public static double plusDanskMoms(double moms) {
        return moms;
    }
    // Again, we can make one for german moms.
    public static double plusTyskmoms(double tyskmoms) {
        return tyskmoms;
    }
}
