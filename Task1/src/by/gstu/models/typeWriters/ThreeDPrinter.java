package by.gstu.models.typeWriters;

import by.gstu.models.CreateTypeWriters;

public class ThreeDPrinter extends CreateTypeWriters {

    public ThreeDPrinter(String namePrinter, String modelPrinter) {
        super(namePrinter, modelPrinter);
    }
    @Override
    public void print() {
        System.out.println("Был создан 3-D принтер, который может выполнять 3-D печать");
    }
}
