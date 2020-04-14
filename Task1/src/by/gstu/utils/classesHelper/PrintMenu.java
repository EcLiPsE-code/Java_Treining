package by.gstu.utils.classesHelper;

/**
 * A class that contains methods for dialogue with the user.
 * @author Solodkov M.A, Group: ITP-31
 * @version 1.0
 */
public class PrintMenu {
    public static void mainMenu(){
        System.out.println("----------------------------");
        System.out.println("|          MENU            |");
        System.out.println("----------------------------");
        System.out.println("| 1) Create typeWriter     |");
        System.out.println("| 2) Check all printers    |");
        System.out.println("| 3) Exit                  |");
        System.out.println("----------------------------");
    }
    public static void modelPrinter(){
        System.out.println("------------------------------");
        System.out.println("|            MENU            |");
        System.out.println("------------------------------");
        System.out.println("| 1) Create LASER_PRINTER    |");
        System.out.println("| 2) Create LED_PRINTER      |");
        System.out.println("| 3) Create JET_PRINTER      |");
        System.out.println("| 4) Create MATRIX_PRINTER   |");
        System.out.println("| 5) Create THREE_D_PRINTER  |");
        System.out.println("------------------------------");
    }
}
