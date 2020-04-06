package by.gstu.runner;

import by.gstu.controllers.PrintingShop;
import by.gstu.models.CreateTypeWriters;
import by.gstu.utils.classesError.SetModelPrinterError;
import by.gstu.utils.classesError.SetNamePrinterError;
import by.gstu.utils.classesHelper.PrintMenu;

import java.util.Iterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Run {

    private static final Logger log = Logger.getLogger(Run.class.getName());
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            PrintingShop shop = PrintingShop.getInstance();
            while(flag){
                PrintMenu.mainMenu();
                System.out.print("Select item: ");
                int answer = scanner.nextInt();
                switch (answer){
                    case 1:
                        System.out.print("Enter name printer: ");
                        String namePrinter = scanner.next();
                        PrintMenu.modelPrinter();
                        System.out.print("Enter printer model: ");
                        String modelPrinter = scanner.next();
                        shop.createPrinter(namePrinter, modelPrinter);
                        System.out.println("Printer successfully created.");
                        break;
                    case 2:
                        System.out.println("All created printers: ");
                        for (Iterator<CreateTypeWriters> it = shop.getListPrinters(); it.hasNext(); ) {
                            CreateTypeWriters printer = it.next();
                            System.out.println(printer);
                        }
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("There is no such menu item");
                }
            }
        }catch (SetNamePrinterError error){
            log.error(error.getMessage());
        }catch (SetModelPrinterError error){
            log.error(error.getMessage());
        }catch (Error error){
            log.error(error.getMessage());
        }
    }
}
