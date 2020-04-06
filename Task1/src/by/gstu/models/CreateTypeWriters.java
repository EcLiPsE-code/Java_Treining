package by.gstu.models;

import by.gstu.models.typeWriters.*;
import by.gstu.utils.classesError.SetModelPrinterError;
import by.gstu.utils.classesError.SetNamePrinterError;

/**
 *An abstract class that describes what classes should contain that describe a particular printer model.
 * @author Solodkov M.A, Group : ITP-31.
 * @version 1.0
 */
public abstract class CreateTypeWriters implements TypeWriterLogic{
    protected String namePrinter;
    protected ModelTypeWriter modelPrinter;
    protected String typePrint;

    public CreateTypeWriters(String namePrinter, String modelPrinter){
        setNamePrinter(namePrinter);
        setModelPrinter(modelPrinter);
    }

    /**
     * An abstract method is to print, which each class has that describes a specific printer model.
     * @verison 1.0
     */
    public abstract void print();

    public String getNamePrinter() {return this.namePrinter;}
    public ModelTypeWriter getModelPrinter() {return this.modelPrinter;}
    public String getTypePrint() {return  this.typePrint;}

    public void setNamePrinter(String namePrinter) throws SetNamePrinterError{
        if (namePrinter.length() < 3){
            throw new SetNamePrinterError("Printer Name Cannot Be Less Than Three Characters", namePrinter);
        }
        this.namePrinter = namePrinter;
    }

    /**
     * Method that sets the printer model value.
     * @param modelPrinter printer model value
     */
    public void setModelPrinter(String modelPrinter) throws SetModelPrinterError, Error{
        ModelTypeWriter model = ModelTypeWriter.valueOf(modelPrinter.toUpperCase());
        switch (model){
            case JET:
                this.typePrint = "JET type";
                this.modelPrinter = ModelTypeWriter.JET;
                break;
            case LED:
                this.typePrint = "LED type";
                this.modelPrinter = ModelTypeWriter.LED;
                break;
            case LASER:
                this.typePrint = "LASER type";
                this.modelPrinter = ModelTypeWriter.LASER;
                break;
            case MATRIX:
                this.typePrint = "MATRIX type";
                this.modelPrinter = ModelTypeWriter.MATRIX;
                break;
            case THREE:
                this.typePrint = "3D type";
                this.modelPrinter = ModelTypeWriter.THREE;
                break;
            default:
                throw new SetModelPrinterError("There is no such printer model", modelPrinter);
        }
    }

    @Override
    public String toString() {
        return "CreateTypeWriters{" +
                "namePrinter='" + namePrinter + '\'' +
                ", modelPrinter=" + modelPrinter +
                ", typePrint='" + typePrint + '\'' +
                '}';
    }
}
