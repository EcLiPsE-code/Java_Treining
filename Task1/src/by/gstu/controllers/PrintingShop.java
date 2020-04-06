package by.gstu.controllers;

import by.gstu.models.CreateTypeWriters;
import by.gstu.models.ModelTypeWriter;
import by.gstu.models.typeWriters.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * The controller class, the so-called "printer store",
 * which performs the creation of the desired printer by its name and model.
 * @author Solodkov M.A, Group: ITP-31
 * @version 1.0
 */
public class PrintingShop {
    private static PrintingShop instance;
    private Collection<CreateTypeWriters> listPrinters;

    private PrintingShop(){
        this.listPrinters = new ArrayList();
    }

    public static PrintingShop getInstance(){ //Singleton
        if (instance == null){
            instance = new PrintingShop();
            return instance;
        }
        return instance;
    }

    /**
     * A method that creates a printer according to such
     * transmitted parameters as the name of the printer and its model.
     * @param namePrinter parameter that indicates the name of the printer
     * @param modelTypeWriter parameter that indicates the printer model
     * @return created printer object
     */
    public CreateTypeWriters createPrinter(String namePrinter, String modelTypeWriter){
        ModelTypeWriter model = ModelTypeWriter.valueOf(modelTypeWriter.toUpperCase());
        switch (model){
            case THREE:
                this.listPrinters.add(new ThreeDPrinter(namePrinter, modelTypeWriter));
                return new ThreeDPrinter(namePrinter, modelTypeWriter);
            case MATRIX:
                this.listPrinters.add(new MatrixPrinter(namePrinter, modelTypeWriter));
                return new MatrixPrinter(namePrinter, modelTypeWriter);
            case LASER:
                this.listPrinters.add(new LaserPrinter(namePrinter, modelTypeWriter));
                return new LaserPrinter(namePrinter, modelTypeWriter);
            case LED:
                this.listPrinters.add(new LedPrinter(namePrinter, modelTypeWriter));
                return new LedPrinter(namePrinter, modelTypeWriter);
            case JET:
                this.listPrinters.add(new JetPrinter(namePrinter, modelTypeWriter));
                return new JetPrinter(namePrinter, modelTypeWriter);
            default:
                System.out.println("Error");
        }
        return null;
    }

    /**
     * Method for outputting all created printers.
     * @return printer collection iterator
     */
    public Iterator<CreateTypeWriters> getListPrinters(){
        Iterator<CreateTypeWriters> iterator = this.listPrinters.iterator();
        return iterator;
    }
}
