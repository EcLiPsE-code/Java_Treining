package by.gstu.models.typeWriters;

import by.gstu.models.CreateTypeWriters;
import by.gstu.models.ModelTypeWriter;
import by.gstu.models.TypeWriterLogic;

public class LaserPrinter extends CreateTypeWriters {

    public LaserPrinter(String namePrinter, String modelPrinter) {
        super(namePrinter, modelPrinter);
    }
    @Override
    public void print() {
        System.out.println("Был создан лазерный принтер, который может выполнять лазерную печать");
    }
}
